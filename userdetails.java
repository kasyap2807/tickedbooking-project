package Ticketsbooking;
import java.util.*;
public class userdetails {
	public static String name;
	public static String mailid;
	public static String mobile;
	public static int age;
	public static char gender;
	public static int regnos;
		public static void getUserDetails() {
			Scanner sc=new Scanner(System.in);
			System.out.println("--------------------welcome to registration form----------------");
			System.out.print("enter your name: ");
			name=sc.next();
			System.out.println("");
			System.out.print("enter mailid: ");
			mailid=sc.next();
			System.out.println("");
			System.out.print("enter your mobile number: ");
			mobile=sc.next();
			System.out.println("");
			System.out.print("enter age: ");
			age=sc.nextInt();
			System.out.println("");
			System.out.print("enter gender m if male f if female :");
			gender=sc.next().charAt(0);
			regnos=(int) Math.random();
			}
}
