import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //바구니 n개
		int m = sc.nextInt(); //공 넣을 갯수
		
		int arr[] = new int[n+1];
		
		int i,j,k;
		
		for(int num1=1; num1<=m; num1++) {
			
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			
			for(int num2=i; num2<=j; num2++) {
				arr[num2] = k;
			}
			
		}
		
		//공 번호 출력
		for(int num=1; num<=n; num++) {
			System.out.print(arr[num]+" ");
		}

	}
}