import java.util.ArrayList;

public class ScrapYard {

    private String name;
    private int scrapMetalKG;
    private ArrayList<ICrushable> crushables;


    public ScrapYard(String name) {
        this.name = name;
        this.scrapMetalKG = 0;
        this.crushables = new ArrayList<ICrushable>();
    }

    public String getName() {
        return this.name;
    }

    public int getMetalCount() {
        return this.scrapMetalKG;
    }

    public int countCrushables() {
        return this.crushables.size();
    }

    public void addCrushable(ICrushable crushable) {
        this.crushables.add(crushable);
    }
}
