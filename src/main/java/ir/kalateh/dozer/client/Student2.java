package ir.kalateh.dozer.client;

import org.dozer.Mapping;

public class Student2 {
    private String name;
    private String lastName;
    private String zadgah;

    public Student2(String name, String lastName, String zadgah) {
        this.name = name;
        this.lastName = lastName;
        this.zadgah = zadgah;
    }

    public Student2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Mapping("family")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Mapping("birthPlace")
    public String getZadgah() {
        return zadgah;
    }

    public void setZadgah(String zadgah) {
        this.zadgah = zadgah;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zadgah=" + zadgah +
                '}';
    }
}
