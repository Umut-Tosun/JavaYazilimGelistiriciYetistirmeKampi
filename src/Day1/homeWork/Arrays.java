package Day1.homeWork;

public class Arrays {
    public static void main(String[] args) {
        String student1 = "Melih";
        String student2 = "Alper";
        String student3 = "Cihan";


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        String[] students = new String[3];

        students[0] = "Melih";
        students[1] = "Alper";
        students[2] = "Cihan";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);
        }
    }
}
