import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		int retirement = 67;
Scanner sc = new Scanner(System.in);

System.out.println("Please type your name");
String yourName= sc.nextLine();

System.out.println("Hello "+yourName);
System.out.println("Please enter your age");

int age = sc.nextInt();
System.out.println("You are " +age);

int untilRetirement = retirement - age;

System.out.println("You can retire in " +untilRetirement+" years");


	}

}