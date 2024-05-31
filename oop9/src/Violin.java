public class Violin implements Instrument,StringedInstrument{
    /**
     * It enables the implementation of the method in the interface.
     */
    @Override
    public void playAnInstrument() {
        System.out.println("Violin Sound...");
    }

    /**
     * It enables the implementation of the method in the interface.
     */
    @Override
    public void compression() {
        System.out.println("Low Compression... ");
    }
}
