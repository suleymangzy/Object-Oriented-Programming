public class NonMotorizedLandVehicle extends LandVehicle{

    /**
     * The "super()" method is added to the first line of the methods or
     * constructors of derived classes, providing access to the methods and
     * constructors of the superclasses.
     * It is also found by default in the first line of the default configurators.
     * Creating nested objects or using different signed methods with the same name
     * (method overloading) allows calling.
     */
    public NonMotorizedLandVehicle(){
        super();
        System.out.print(" Non motorized land vehicle -");
    }
}
