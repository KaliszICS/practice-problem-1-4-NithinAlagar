/**
	* Lesson: Input
	* Author: Nithin Alagar
	* Date Created: February 9, 2023
	* Date Last Modified: February 17, 2023
	*/
import java.util.Scanner; 

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}
	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name = input.nextLine();
		System.out.println(name);
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner inputQ2 = new Scanner(System.in);
		System.out.print("Input a whole number: ");
		Integer num = inputQ2.nextInt();
		System.out.println(num*2+2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner inputQ3 = new Scanner(System.in);
		System.out.print("Input a radius: ");
		Double rad = inputQ3.nextDouble();
		System.out.println(2*rad*3.14);
		System.out.println(3.14*(rad*rad));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner inputQ4 = new Scanner(System.in);
		System.out.print("Input a first name: ");
		String nameFirst = inputQ4.nextLine();
		System.out.print("Input a last name: ");
		String nameLast = inputQ4.nextLine();
		System.out.print("Input an age: ");
		String age = inputQ4.nextLine();
		System.out.println(nameLast+", "+ nameFirst + " - "+age);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner inputQ5 = new Scanner(System.in);
		System.out.print("Input a name: ");
		String name = inputQ5.nextLine();
		System.out.print("Input an age: ");
		Integer age = inputQ5.nextInt();
		Integer iq = age;
		age = age+3;
		System.out.println(name+age);
		System.out.println(iq);





	}

}
