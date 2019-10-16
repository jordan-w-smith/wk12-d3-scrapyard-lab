public class CrushingMachine {


    public int crush(ICrushable crushable) {
        int metalToRecoverKG = crushable.getMetalContent();
        crushable.setMetalCountTo0();
        return metalToRecoverKG;

    }
}
