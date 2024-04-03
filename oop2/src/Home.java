public class Home {
    private String street;
    private String number;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    public void write(){
        System.out.println("Sokak: "+street+"\nNumara: "+number);
    }
}
