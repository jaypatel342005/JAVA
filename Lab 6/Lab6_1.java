import java.util.*;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    int spi;

    Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id of student");
        this.id_no = sc.nextInt();
        System.out.println("enter the no_of_subjects_registered of student");
        this.no_of_subjects_registered = sc.nextInt();
        subject_code = new int[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new String[no_of_subjects_registered];

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("enter the subject code of subject" + i + 1);
            this.subject_code[i] = sc.nextInt();
            System.out.println("enter the credits of subject" + i + 1);
            this.subject_credits[i] = sc.nextInt();
            System.out.println("enter the grade_obtained in  subject" + i + 1);
            Scanner scc = new Scanner(System.in);
            this.grade_obtained[i] = scc.nextLine();
        }
    }

    int spi() {
        return 0;

    }

    public void print() {
        System.out.println(id_no);
        System.out.println(no_of_subjects_registered);
        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println(subject_code[i]);
            System.out.println(subject_credits[i]);
            System.out.println(grade_obtained[i]);
        }
    }

}

public class Lab6_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Student[] s = new Student[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();

        }
        for (int i = 0; i < s.length; i++) {
            s[i].print();

        }
    }

}