package ir.kalateh.dozer.client;

public class Student1 {
    private String name;
    private int point;
    private int height;

    public Student1(String name, int point, int height) {
        this.name = name;
        this.point = point;
        this.height = height;
    }

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", height=" + height +
                '}';
    }
}
