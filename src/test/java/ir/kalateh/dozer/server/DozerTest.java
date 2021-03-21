package ir.kalateh.dozer.server;

import ir.kalateh.dozer.client.Student;
import ir.kalateh.dozer.client.Student1;
import ir.kalateh.dozer.client.Student2;
import ir.kalateh.dozer.client.Student3;
import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DozerTest {

    DozerBeanMapper dozerMapper;

    @Before
    public void setUp() throws Exception {
        dozerMapper = new DozerBeanMapper();
    }

    BeanMappingBuilder builder = new BeanMappingBuilder() {
        @Override
        protected void configure() {
            mapping(ServersideStudent3.class, Student3.class)
                    .fields("family", "lastName")
                    .fields("birthPlace", "zadgah")
                    .exclude("name");
        }
    };

    @Test
    public void givenSourceObjectAndDestClass_whenMapsSameNameFieldsCorrectly_thenCorrect() {
        ServersideStudent server = new ServersideStudent("hossein", "kalateh", 27);
        Student client = dozerMapper.map(server, Student.class);
        assertEquals(client.getName(), "hossein");
        assertEquals(client.getFamily(), "kalateh");
        assertEquals(client.getAge(), 27);
        System.out.println(client.toString());
    }

    @Test
    public void givenSourceObjectAndDestObject_whenMapsSameNameFieldsCorrectly_thenCorrect() {
        ServersideStudent server = new ServersideStudent("hossein", "kalateh", 27);
        Student client = new Student();
        dozerMapper.map(server, client);
        assertEquals(client.getName(), "hossein");
        assertEquals(client.getFamily(), "kalateh");
        assertEquals(client.getAge(), 27);
        System.out.println(client);
    }

    @Test
    public void givenSourceAndDestWithDifferentFieldTypes_whenMapsAndAutoConverts_thenCorrect() {
        ServersideStudent1 server = new ServersideStudent1("hossein", "15", 177.6);
        Student1 client = dozerMapper.map(server, Student1.class);
        System.out.println(server);
        System.out.println(client);
        assertEquals(client.getName(), "hossein");
        assertEquals(client.getPoint(), 15);
        assertEquals(client.getHeight(),177);
    }

    @Test
    public void givenAnnotatedSrcFields_whenMapsToRightDestField_thenCorrect() {
        ServersideStudent2 server = new ServersideStudent2("hossein", "kalateh", "tehran");
        Student2 client = dozerMapper.map(server, Student2.class);
        assertEquals(client.getName(), server.getName());
        assertEquals(client.getLastName(), server.getFamily());
        assertEquals(client.getZadgah(), server.getBirthPlace());
        System.out.println(server);
        System.out.println(client);
    }

    @Test
    public void givenAnnotatedSrcFields_whenMapsToRightDestFieldBidirectionally_thenCorrect() {
        Student2 client = new Student2("hossein", "kalateh", "tehran");
        ServersideStudent2 server = dozerMapper.map(client, ServersideStudent2.class);
        assertEquals(server.getName(), client.getName());
        assertEquals(server.getFamily(), client.getLastName());
        assertEquals(server.getBirthPlace(), client.getZadgah());
        System.out.println(server);
        System.out.println(client);
    }

    @Test
    public void givenApiMapper_whenMaps_thenCorrect() {
        dozerMapper.addMapping(builder);

        ServersideStudent3 server = new ServersideStudent3("hossein", "kalateh", "tehran");
        Student3 client = dozerMapper.map(server, Student3.class);

        System.out.println(server);
        System.out.println(client);

        assertNull(client.getName());
        assertEquals(client.getLastName(), server.getFamily());
        assertEquals(client.getZadgah(), server.getBirthPlace());
    }

}