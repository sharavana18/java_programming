import java.util.Scanner;
public class Fever{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Enter your temp : ");
	    int temp = sc.nextInt();
	    if(temp>=100)
	    System.out.println("you have fever");
	    else
	    System.out.println("normal temp");
	    
	}
}
