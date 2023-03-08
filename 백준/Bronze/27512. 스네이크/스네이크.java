import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(N%2==1 && M%2==1)System.out.println(N*M -1);
        else System.out.println(N*M);
		
	}
}
