import java.util.Scanner;
public class Balance{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter your balance : ");
	    int bal = sc.nextInt();
	    System.out.printf("Enter your withdraw ammount : ");
	    int wa = sc.nextInt();
	    if(wa>=bal&&wa%100==0)
	    System.out.println("you can withdraw");
	    else
	    System.out.println("you can not withdraw");
	}
}
