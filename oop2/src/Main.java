public class Main {

    public static void main(String[] args) {

        Home summerHouse = new Home();
        Home winterHome = new Home();
        /*
          The names of the objects we create are randomly written expressions
          used to access these objects. In other words, object names are "references" created to access objects.
        */
        summerHouse.setStreet("4336");
        summerHouse.setNumber("5-3");
        winterHome.setStreet("4224");
        winterHome.setNumber("7");

        summerHouse.write();
        winterHome.write();

        winterHome.setStreet("4336");
        winterHome.setNumber("5-3");
        summerHouse.setStreet("4224");
        summerHouse.setNumber("7");

        winterHome.write();
        summerHouse.write();



    }

}