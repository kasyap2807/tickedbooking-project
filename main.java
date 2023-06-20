package Ticketsbooking;
import java.util.*;
public class main {
public static void main(String[] args) {
	System.out.println("----------------welcome to railways tickets booking----------------");
	Scanner sc=new Scanner(System.in);
	int i=1;
	int option;
	while(i!=0) {
		i++;
		System.out.println("............select youe choice..........");
		System.out.println("1.register");
		System.out.println("2.profile details");
		System.out.println("3.train details");
		System.out.println("4.book tickets");
		System.out.println("5.exit");
		System.out.println(".........................................");
		option=sc.nextInt();
		switch(option) {
		case 1:{
			userdetails ud=new userdetails();
			ud.getUserDetails();
			break;
		}
		case 2:{
			userdetailsprinter udp=new userdetailsprinter();
			udp.putDetails();
			break;
		}
		case 3:{
			traindetails td=new traindetails();
			td.getTrain();
			break;
		}
		case 4:{
			Booktickets bt=new Booktickets();
			bt.Booking();
			break;
		}
		case 5:{
			System.out.println("**************** thanks for using platform ***************");
			System.out.println();
			System.exit(0);
			}
	}
			
}
	
}

}
