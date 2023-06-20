package Ticketsbooking;
import java.util.*;
public class traindetails extends userdetailsprinter{
public static int trainno1=11101;
public static String trainname1="nspexp";
public static String servi1="exp";
public static int trainno2=11100;
public static String trainname2="nslexp";
public static String servi2="exp";
public static int trainno3=11105;
public static String trainname3="vjydemo";
public static String servi3="pass";
public static String stpoint1="ns";
public static String dwpoint1="hyd";
public static String stpoint2="ns";
public static String dwpoint2="nsl";
public static String stpoint3="ns";
public static String dwpoint3="vjy";

public static int train1seats=1;
public static int train2seats=1;
public static int train3seats=1;
public static void getTrain() {
	System.out.println("****************avilable trains are**************************");
	System.out.println("trainno   |train name|servi|trainseats|strat|droup");
	System.out.println("--------------------------------------");
	System.out.println(trainno1+"     |"+trainname1+"    |"+servi1+"  |"+train1seats+"         |"+stpoint1+"   |"+dwpoint1);
	System.out.println(trainno2+"     |"+trainname2+"    |"+servi2+"  |"+train2seats+"         |"+stpoint2+"   |"+dwpoint2);
	System.out.println(trainno3+"     |"+trainname3+"   |"+servi3+" |"+train3seats+"         |"+stpoint3+"   |"+dwpoint3);
	System.out.println("**************************************************************");
}
}


