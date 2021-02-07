/*
 * Class: CMSC203 
 * Instructor: Khandan Monshi
 * Description: (Give a brief description for each Class)
 * Due: 2/09/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   System.out.println( your Name here: Justin Steele
*/
import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		String ans;
		System.out.println("reboot the computer and try to connect");
		System.out.println( "Did it work (yes/no)");
		ans=read.next();
		if(ans.equals("yes")){
			System.out.println("Rebooting the computer worked");}
		else if(ans.equals("no")) {
			System.out.println( "Reboot the router and try to connect");
			System.out.println( "Did It work (yes/no)");
			ans=read.next();
			/*== doesnt work for strings so .equals must be used*/
			if(ans.equals("yes")) {
					System.out.println( "Rebooting the router worked");}
			else if(ans.equals("no")) {
					System.out.println("Make sure all cables are firmly plugged in and power is getting to the router");
					System.out.println( "Did it work (yes/no)");
					ans=read.next();
					if(ans.equals("yes")){
						System.out.println("Checking the routers cables worked");}
					else if(ans.equals("no")) {
						System.out.println( "Move the computer closer to the router");
						System.out.println("did it work (yes/no)");
						ans=read.next();
						if(ans.equals("yes")){
							System.out.println( "moving the computer worked");}
						else if(ans.equals("no")) {
							System.out.println( "Contact you ISP");}
						else {
							System.out.println("Error: invalid response");}}
					else {
							System.out.println( "Error: invalid response");}}

				else{
						System.out.println("Error: invalid response");}}

			else{
				System.out.println( "Error: invalid response");}
		System.out.println( "Code By: Justin Steele");
	}

}
