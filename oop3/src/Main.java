public class Main {
    public static void main(String[] args) {
    Student student = new Student(" ","38");
    Student student1 = new Student(" ","39");
    Student student2 = new Student(" ","40");

    Student[] students ={student, student1, student2};
    Student[] lessonStudent = {student, student1};

    Lesson lesson = new Lesson("Object Oriented Programming","20117");
    Lesson lesson1 = new Lesson("Database Management Systems","20118");
    Lesson lesson2 = new Lesson("Software Requirements Analysis","20119");
    Lesson lesson3 = new Lesson("Data Structures","20120");

    Lesson[] departmentLessons = {lesson, lesson1, lesson2, lesson3};
    Lesson[] studentsLessons = {lesson, lesson2};

    Department department = new Department("Software Engineering","121010");

    Department departmentInformation = new Department(department, students, departmentLessons);
    departmentInformation.departmentInformation();

        System.out.println(" ");

    Student studentInformation = new Student(student,studentsLessons, department);
    studentInformation.studentInformation();

        System.out.println(" ");

    Lesson courseInformation = new Lesson(lesson, lessonStudent, department);
    courseInformation.courseInformation();


    }
}