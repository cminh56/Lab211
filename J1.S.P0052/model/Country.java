package model;

public class Country {

    protected String code, name;
    protected float area;

    public Country(String code, String name, float area) {
        this.code = code;
        this.name = name;
        this.area = area;
    }

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code != null) {
            this.code = code;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void display() {
        System.out.format("%-15s %-15s %-15s ", code, name, area);
    }

}
