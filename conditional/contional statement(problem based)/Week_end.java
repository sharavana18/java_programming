import java.util.Scanner;
public class Week_end{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if(day>=5)
        System.out.println("week day");
        else
        System.out.println("weekend");
    }
}