import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if((m-45)>=0) {
			System.out.println(h+" "+(m-45));
		}else {
			if((h-1)>=0) {
				System.out.println(h-1+" "+(m-45+60));
			}else {
				System.out.println((h-1+24)+" "+(m-45+60));
			}
		}
	}
}