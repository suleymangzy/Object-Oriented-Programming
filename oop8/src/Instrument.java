public abstract class Instrument {
    /**
     * Abstract classes can hold object variables.
     */
    private String instrumentName;
    /**
     * Parameterized constructor
     * They may have constructors.
     * If not written, they become default constructors.
     * Subclass even if its own objects are not created
     * when an object is created in the abstract class
     * constructors work.
     * @param instrumentName parameter variable that holds the name of the instrument
     */
    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }
    /**
     * Having an interface but no implementation
     * Methods are called abstract methods.
     * Abstract methods cannot be private or final.
     * There is no need to use {} in these methods.
     */
    public abstract void playAnInstrument();
    /**
     * Concrete methods can be found within abstract classes.
     * @return Returns the value of the object variable.
     */
    public String getInstrumentName() {
        return instrumentName;
    }
}
