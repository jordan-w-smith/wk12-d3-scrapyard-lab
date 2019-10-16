import java.util.ArrayList;

public class ScrapYard {

    private String name;
    private int scrapMetalKG;
    private ArrayList<ICrushable> crushables;
    private CrushingMachine crushingMachine;


    public ScrapYard(String name, CrushingMachine crushingMachine) {
        this.name = name;
        this.scrapMetalKG = 0;
        this.crushables = new ArrayList<ICrushable>();
        this.crushingMachine = crushingMachine;
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

    public void salvageMetal(ICrushable crushable) {
        this.scrapMetalKG += this.crushingMachine.crush(crushable);
    }
}
