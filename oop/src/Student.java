import java.util.Scanner;

public class Student {
   /*
   The access specifier "private" keyword was used to prevent data inconsistencies
   that may occur when the created object attributes are called directly from outside
   the class in which they were created.
    */
    private String Name;
    private String SurName;

    public void name_what(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the student's name and surname.");
        System.out.print("Name: ");
        Name = input.next();
        System.out.print("Surname: ");
        SurName = input.next();
    }
    public void screen_write(){
        System.out.println(Name+" "+SurName);
    }

}
