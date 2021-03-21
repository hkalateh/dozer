package ir.kalateh.dozer.server;

public class ServersideStudent2 {
    private String name;
    private String family;
    private String birthPlace;

    public ServersideStudent2(String name, String family, String birthPlace) {
        this.name = name;
        this.family = family;
        this.birthPlace = birthPlace;
    }

    public ServersideStudent2() {
    }

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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return "ServersideStudent2{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", birthPlace=" + birthPlace +
                '}';
    }
}
