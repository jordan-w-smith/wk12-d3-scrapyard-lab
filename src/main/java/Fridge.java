public class Fridge implements ICrushable {

    private int metalContentKG;

    public Fridge(int metalContentKG) {
        this.metalContentKG = metalContentKG;
    }



    public int getMetalContent() {
        return this.metalContentKG;
    }

    public void setMetalCountTo0() {
        this.metalContentKG = 0;
    }
}
