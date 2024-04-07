import java.io.*;
import java.util.Scanner;
public class Lab10_4{
	public static void main(String[] args) {
		String filename = "File4.txt";
		Scanner sc = new Scanner(System.in);
		try{
		FileOutputStream fout = new FileOutputStream("File4.txt");
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		String names[] = new String[n];
		String rollNos[] = new String[n];
		for(int j=0;j<n;j++)
		{
			System.out.println("Enter name of student "+j+" : ");
			names[j] = sc.next();
			System.out.println("Enter rollNo of student "+j+" : ");
			rollNos[j] = sc.next();
		}
		Student[] stu = new Student[n];
		for(int j=0;j<n;j++){
		stu[j] = new Student(names[j],rollNos[j]);
		}
		for(int j=0;j<n;j++)
		{
		byte[] b = stu[j].toString().getBytes();
			fout.write(b);
		}
		fout.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
		System.out.println("Data transferred successfully");
		try{
			File f = new File("File4.txt");
		FileInputStream fin = new FileInputStream("File4.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
		}
		fin.close();
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
}
}
class Student{
	String name;
	String rollNo;
	Student(String name,String rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	public String toString(){
		return "Name = "+name+" rollNo = "+rollNo+"\n";
	}  
}