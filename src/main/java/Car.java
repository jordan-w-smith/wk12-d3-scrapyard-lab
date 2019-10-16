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


    public String getModel() {
        return this.model;
    }
}
