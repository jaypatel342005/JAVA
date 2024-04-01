import java.util.Scanner;
public class Lab6_1_1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int student_no = Integer.parseInt(args[0]);
		Student[] s = new Student[student_no];
		for(int i=0;i<student_no;i++)
		{
			System.out.println("Enter id number of student "+(i+1)+" : ");
			double id_no = sc.nextDouble();
			System.out.println("Enter number of subjects registered of student "+(i+1)+" : ");
			int no_of_subjects_registered = sc.nextInt();
			s[i] = new Student(id_no,no_of_subjects_registered);
			s[i].calculate_spi();
		}
	}
}
class Student{
	double id_no;
	int no_of_subjects_registered;
	String subject_code[];
	int subject_credits[];
	String grade_obtained[];
	double spi;
	int sum;
	Student(double id_no,int no_of_subjects_registered)
	{
		this.id_no=id_no;
		this.no_of_subjects_registered=no_of_subjects_registered;
		this.subject_code=new String[no_of_subjects_registered];
		this.subject_credits=new int[no_of_subjects_registered];
		this.grade_obtained=new String[no_of_subjects_registered];
	}
	public void calculate_spi()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<no_of_subjects_registered;i++)
		{
			System.out.println("Enter Subject Code "+(i+1)+" : ");
			subject_code[i] = sc.next();
		System.out.println("Enter Subject Credit "+(i+1)+" : ");
		subject_credits[i] = sc.nextInt();
		System.out.println("Enter grade obtained of subject "+(i+1)+" : ");
		grade_obtained[i] = sc.next();
		switch(grade_obtained[i])
		{
			case "A+":
			sum += 10*subject_credits[i];
			break;
			case "A":
			sum += 9*subject_credits[i];
			break;
			case "B+":
			sum += 8*subject_credits[i];
			break;
			case "B":
			sum += 7*subject_credits[i];
			break;
			case "C+":
				sum += 6*subject_credits[i];
				break;
			case "C":
				sum += 5*subject_credits[i];
				break;
			case "D+":
				sum += 4*subject_credits[i];
				break;
			case "D":
				sum += 3*subject_credits[i];
				break;
			case "E+":
				sum += 2*subject_credits[i];
			case "E":
			sum += 1*subject_credits[i];	

		}

		}
		for(int i=0;i<no_of_subjects_registered;i++)
		{
			spi = (double)(sum)/(double)(no_of_subjects_registered);
		}
		spi/=10.0;
		System.out.println("spi of student = "+spi);
	}

}