
public class Student {
    String studentName;
    String schoolID;
    Lesson[] lesson;
    Department department;
    public Student(String studentName, String schoolID){
        this.studentName = studentName;
        this.schoolID = schoolID;
    }
    public Student(Student student, Lesson[] lessons, Department department){
        this.studentName = student.studentName;
        this.schoolID = student.schoolID;
        this.lesson = lessons;
        this.department = department;
    }

    public void studentInformation(){
        System.out.println("Student's information; "+"\nName: "+ studentName +"\nSchool ID: "+ schoolID
                +"\nDepartment name: "+ department.departmentName +"\nDepartment ID: "+ department.departmentID);

        System.out.println("Lessons taken;");
        for (int i = 0; i< lesson.length; i++){
            System.out.println("Lesson name: "+ lesson[i].lessonName +","+"Lesson ID: "+ lesson[i].lessonID);
        }
    }


}
