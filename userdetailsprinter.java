package Ticketsbooking;

public class userdetailsprinter extends userdetails{
	public static void putDetails(){
		System.out.println("_________ your details___________");
		for(int i=0;i<30;i++) {
				System.out.print("*");
			}System.out.println("");
		System.out.println("name :"+name);
		System.out.println("email :"+mailid);
		System.out.println("mobile number :"+mobile);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
		System.out.println("your registerd number is :"+regnos);
		for(int i=0;i<30;i++) {
			System.out.print("*");
		}System.out.println("");
	}
}