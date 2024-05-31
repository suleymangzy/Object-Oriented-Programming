public class Tuba implements Instrument,WindInstrument{
    /**
     * It enables the implementation of the method in the interface.
     */
    @Override
    public void playAnInstrument() {
        System.out.println("Tuba Sound...");
    }

    /**
     * It enables the implementation of the method in the interface.
     */
    @Override
    public void breath() {
        System.out.println("Deep Breath...");
    }
}
