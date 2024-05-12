import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[31];
		int arr2[] = new int[29];
		
		for(int i=1; i<arr1.length; i++) {
			arr1[i] = i;
		}
		
		for(int i=1; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i=1; i<arr1.length; i++) {
			for(int j=1; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					arr1[i]=0;
				}
			}
		}
		
		for(int i=1; i<arr1.length; i++) {
			if(arr1[i]!=0) {
				System.out.println(arr1[i]);
			}
		}
		
	}
}
