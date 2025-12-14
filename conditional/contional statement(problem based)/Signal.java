import java.util.Scanner;
public class Signal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the signal : ");
        String str = sc.nextLine();
        if(str.equals("red"))
            System.out.println("Stop");
        else if(str.equals("yellow"))
            System.out.println("get ready");
        else if(str.equals("yellow"))
            System.out.println("go");
        else
        System.out.println("invalid input");
    }}