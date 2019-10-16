public class Car implements ICrushable {
    private int metalContentKG;
    private String model;

    public Car(int metalContentKG, String model) {
        this.metalContentKG = metalContentKG;
        this.model = model;
    }

    public int getMetalContent() {
        return this.metalContentKG;
    }

    public void setMetalCountTo0() {
        this.metalContentKG = 0;
    }


    public String getModel() {
        return this.model;
    }
}
