public class Lesson {
    String lessonName;
    String lessonID;
    Student[] students;
    Department department;

    public Lesson(String lessonName, String lessonID){
        this.lessonName = lessonName;
        this.lessonID = lessonID;
    }

    public Lesson(Lesson lesson, Student[] students, Department department){
        this.lessonName = lesson.lessonName;
        this.lessonID = lesson.lessonID;
        this.students = students;
        this.department = department;
    }

    public void courseInformation(){
        System.out.println("Lesson name: "+ lessonName +"\nLesson ID: "+ lessonID +"\nLessons taken; "
                +"\nDepartment name:"+ department.departmentName +"\nDepartment ID: "+ department.departmentID);

        System.out.println("Students taking the course;");
        for (int i = 0; i< students.length; i++){
            System.out.println("Student name: "+ students[i].studentName +","+"School ID: "+ students[i].schoolID);
        }
    }






}
