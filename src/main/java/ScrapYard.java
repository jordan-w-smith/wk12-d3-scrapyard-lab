public class ScrapYard {

    String name;
    int scrapMetalKG;

    public ScrapYard(String name) {
        this.name = name;
        this.scrapMetalKG = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getMetalCount() {
        return this.scrapMetalKG;
    }
}
