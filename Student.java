package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance=0;
	private static int costsOfCourse=600;
	private static int id = 1000;
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name:");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name:");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 -Senior\nEnter student class level:");
		this.gradeYear = in.nextLine();
		
		setStudentID();
		
		System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	//Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	//enroll in courses
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" +course;
			tuitionBalance = tuitionBalance + costsOfCourse;
		}
		else { 
			System.out.println("BREAK!");
			break;
			}
		} while (1 != 0);
		System.out.println("ENROLED IN:" +courses);
		//System.out.println("TUITION BALANCE:"+ tuitionBalance);
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is:$" + tuitionBalance);
	}
	//pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment:$");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+payment);
		viewBalance();
	}
	//show status
	public String toString() {
		return "Name:" + firstName +"" +lastname+
				"\nCourses Enrolled:" +courses +"\nBalance:$" + tuitionBalance;
	
	}

}
