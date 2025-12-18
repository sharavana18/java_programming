import java.util.Scanner;
public class N_even_num{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s;
    for(int i=1;i<=n;i++){
        s = i*2;
        System.out.print(s+" ");
    }
    }
}