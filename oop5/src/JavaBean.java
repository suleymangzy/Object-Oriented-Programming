public class JavaBean {
    /**
     *Object variable that holds the state information of the object to be created.
     */
    private String statusInformation;

    /**
     * The object's default constructor.
     */

    public JavaBean(){
        /**
         * With the "this" keyword, the object's default constructor,
         * via the object's parameterized constructor, returns the value
         * of the variable that holds the object's state information as
         * the default value of the object variable's data type.
         */
        this(null);
    }

    /**
     * The object's parameterized constructor.
     * @param statusInformation keeps the object's state information.
     */

    public JavaBean(String statusInformation){
        this.statusInformation = statusInformation;
    }

    /**
     * Class method that prints the information of the created object.
     * @param javaBean variable name that holds the reference information of the created object.
     */

    public static void statusInformation(JavaBean javaBean){
        System.out.println("Status information :"+javaBean.statusInformation);
    }


}
