public class Tuba extends WindInstrument{
    /**
     * Parameterized constructor
     * @param instrumentName parameter variable that holds the name of the instrument
     */
    public Tuba(String instrumentName) {
        super(instrumentName);
    }
    /**
     * A concrete method created by method overriding
     * the inherited abstract method of the abstract ancestor class.
     * Polymorphism is necessarily ensured.
     */
    @Override
    public void playAnInstrument() {
        System.out.println(getInstrumentName()+" Sound...");
    }
    /**
     * A concrete method created in a subclass by overriding
     * the concrete method in the abstract parent class.
     * Polymorphism is provided optionally.
     */
    @Override
    public void breath() {
        System.out.println(getInstrumentName()+" Deep Breath...");
    }
}
