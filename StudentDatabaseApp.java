import java.util.Scanner;
//package StudentDatabaseApp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number of new students to enroll:");
		Scanner in =new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		//create n number of new students
		for (int n=0; n < numOfStudents; n++) {
			students[n] =new Student();
			students[n].enroll();
			students[n].payTuition();
		}
		for (int n=0; n < numOfStudents; n++)
		{
			System.out.println(student[n].toString());
		}
		/*Student stu1 = new Student();
		stud1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
	}*/

}
