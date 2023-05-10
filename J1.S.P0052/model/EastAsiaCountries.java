package model;

public class EastAsiaCountries extends Country {

    private String terrain;

    public EastAsiaCountries(String code, String name, float area, String terrain) {
        super(code, name, area);
        this.terrain = terrain;
    }

    public EastAsiaCountries() {
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    @Override
    public void display() {
        super.display();
        System.out.format("%-15s\n", terrain);
    }

}
