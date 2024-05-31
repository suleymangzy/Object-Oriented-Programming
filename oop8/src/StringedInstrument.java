public abstract class StringedInstrument extends Instrument{
    /**
     * Parameterized constructor
     * @param instrumentName parameter variable that holds the name of the instrument
     */
    public StringedInstrument(String instrumentName) {
        super(instrumentName);
    }
    /**
     * Object method
     */
    public  void compression(){
        System.out.println("Compression...");
    }
}
