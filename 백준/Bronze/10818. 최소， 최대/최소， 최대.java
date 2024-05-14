import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int min = 1000000;
		int max = -1000000;

		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a<min) min = a;
			if(max<a) max = a;
		}
		System.out.printf("%d %d",min, max);

	}
}