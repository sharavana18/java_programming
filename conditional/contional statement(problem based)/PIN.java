import java.util.Scanner;
public class PIN{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter your pin : ");
	    int pin = sc.nextInt();
	    int correctpin = 1010;
	    if(pin==correctpin)
	    System.out.println("you can withdraw");
	    else
	    System.out.println("you can not withdraw");
	}
}
