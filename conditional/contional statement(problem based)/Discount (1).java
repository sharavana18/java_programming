import java.util.Scanner;
public class Discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m>1000)
        System.out.println("discount is 10 persent");
        else if(m>2000)
        System.out.println("discount is 20 persent");
        else if(m>3500)
        System.out.println("discount is 25 persent");
        else if(m>5000)
        System.out.println("discount is 30 persent");
        else
        System.out.println("no discount ");
    }
}