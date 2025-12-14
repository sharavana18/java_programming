import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        if(bill<=100)
        System.out.println("Free");
        else if(bill<=300)
        System.out.println("5 rupees");
        else
        System.out.println("10 rupees");
    }
}