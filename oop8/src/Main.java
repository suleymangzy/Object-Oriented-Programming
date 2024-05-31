public class Main {
    public static void main(String[] args) {
      Instrument instrument = new Tuba("Tuba1");
      instrument.playAnInstrument();
      // instrument.breath(); -> Since the method is accessible to the subclass, it cannot be accessed from the superclass.
      Tuba tuba = new Tuba("Tuba2");
      tuba.playAnInstrument();
      tuba.breath();

      instrument = new Violin("Violin1");
      instrument.playAnInstrument();
      // instrument.compression(); -> Since the method is accessible to the subclass, it cannot be accessed from the superclass.
      Violin violin = new Violin("Violin2");
      violin.playAnInstrument();
      violin.compression();
    }
}