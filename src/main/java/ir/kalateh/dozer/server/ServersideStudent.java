package ir.kalateh.dozer.server;

public class ServersideStudent {
    private String name;
    private String family;
    private int age;

    public ServersideStudent(String name, String family, int age) {
        this.name = name;
        this.family=family;
        this.age=age;
    }

    public ServersideStudent(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
