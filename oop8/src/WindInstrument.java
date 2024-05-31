public abstract class WindInstrument extends Instrument{
    /**
     * Parameterized constructor
     * @param instrumentName parameter variable that holds the name of the instrument
     */
    public WindInstrument(String instrumentName) {
        super(instrumentName);
    }
    /**
     * Object method
     */
    public void breath(){
        System.out.println("Breath...");
    }
}
