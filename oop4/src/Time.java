public class Time {

    /**
     * Normally, in addition to seconds, the time variable should have two more object variables: hours and minutes.
     * However, due to the encapsulation principle, the dependency on the other two variables has been eliminated in order
     * to prevent the client from directly interfering with the object variables, to prevent meaningless/inconsistent value entry,
     * and to reduce the client's dependence on the object variables. using only the seconds variable.
     */

    private int second;
        /**
         * Sets the initial state of the object to 0, 0, 0.
         */
        public Time() {
            second = 0;
        }
        /**
         * Gets the initial state of the object based on the given values.
         *
         * @param hr Initial value for times.
         * @param mn Initial value for minutes.
         * @param sc Initial value for seconds.
         */
        public Time(int hr, int mn, int sc) {
            if (hr >= 0 && hr < 24) {
                second += hr * 60 * 60;
            }
            if (mn >= 0 && mn < 60) {
                second += mn * 60;
            }
            if (sc >= 0 && sc < 60) {
                second += sc;
            }
        }
        /**
         * Moves the object after one second each time it is called.
         * Seconds cannot be greater than 59, minutes cannot be greater than 59, and hours cannot be greater than 23.
         */
        public void forward() {
            second++;
        }
        /**
         * Advances time by the specified number of seconds.
         *
         * @param sc Specifies how many seconds the time will be advanced.
         */
        public void forward(int sc) {
            second += sc;
            if (second < 0) {
                second = 0;
            }
        }
        /**
         * When called, it writes the current state of the object to the screen.
         */
       public void timePrinting() {
            int hour = second / (60 * 60);
            int minute = (second / 60) % 60;
            System.out.println("Time : " +
                    hour + ":" + minute + ":" + (second % 60));
        }
    }


