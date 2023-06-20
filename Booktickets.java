package Ticketsbooking;
import java.util.*;
public class Booktickets extends traindetails{
	public static int trainno;
	public static void Booking() {
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("enter train umber");
		Scanner sc=new Scanner(System.in);
		trainno=sc.nextInt();
		if(trainno==11101) {
			train1seats=train1seats-1;
			if(train1seats>=0) {
				System.out.println("tickets booked");
			}
			else {
				System.out.println("failed");
			}
		}
		if(trainno==11100) {
			train2seats=train2seats-1;
			if(train2seats>=0) {
				System.out.println("tickets booked");
			}
			else {System.out.println("failed");
			}
				
		}
		if(trainno==11105) {
			train3seats=train2seats-1;
			if(train1seats>0) {
				System.out.println("tickets booked");
			}
			else {System.out.println("failed");
			}
				
		}
		System.out.println("name :"+name);
		System.out.println("email :"+mailid);
		System.out.println("mobile number :"+mobile);
		System.out.println("age :"+age);
		System.out.println("gender :"+gender);
		System.out.println("your registerd number is :"+regnos);
		System.out.println("-------------------------------------------------thanks for booking-----------------------------------------------------------------");
		
		
	}

}
