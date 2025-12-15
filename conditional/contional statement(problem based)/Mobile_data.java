import java.util.Scanner;

public class Mobile_data{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the data percentage used : ");
        double used = sc.nextInt();
        if(used==100)
            System.out.println("full");
        else if(used<100 && used>50)
            System.out.println("consumed");
        else if(used<50){
            System.out.println("low");
        }
        else 
            System.out.println("data over");


    }}