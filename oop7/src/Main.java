public class Main {
    public static void main(String[] args) {

        Instrument instrument = new Instrument();
        /**
         * First of all, a reference variable from the Instrument class is defined in the program class.
         * And a reference to an object belonging to the Instrument class is added to this reference variable.
         */
        instrument.playAnInstrument();
        /**
         * You can then call the playAnInstrument() method using this reference variable.
         * We are waiting for the “Sound...” output to appear on the screen.
         */

        instrument = new Violin();
        /**
         * Reference of a Violin object to the same reference variable in the next line
         * transferred.
         */
        instrument.playAnInstrument();
        /**
         * Then play playAnInstrument() via this reference
         * method called.
         * In terms of late binding: Although the reference variable's type is Violin class
         * Where he points is an object belonging to the Violin class. Which
         * It is obvious that the method will be called at runtime and
         * Since instrument.playAnInstrument() is a Violin object at time
         * Method call pointed to by the instrument reference variable
         * This means it will be executed via the Violin object. Violin
         * The object belongs to the Violin class and the playAnInstrument() method is in this class.
         * encoded. So the output of this line is “Violin sound...”
         * will.
         */


    }
}