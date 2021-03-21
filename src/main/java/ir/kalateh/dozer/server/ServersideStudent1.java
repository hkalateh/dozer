package ir.kalateh.dozer.server;

public class ServersideStudent1 {
    private String name;
    private String point;
    private Double height;

    public ServersideStudent1(String name, String point, Double height) {
        this.name = name;
        this.point = point;
        this.height = height;
    }

    public ServersideStudent1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ServersideStudent1{" +
                "name='" + name + '\'' +
                ", point='" + point + '\'' +
                ", height=" + height +
                '}';
    }
}
