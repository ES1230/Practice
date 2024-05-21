import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = 9;
        int[] arr= new int[num];
        
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        int row = 0;
        
        for(int i=1; i<num; i++){
            if(max<arr[i]){
                max = arr[i];
                row = i;
            }
        }
        
        System.out.println(max);
        System.out.println(row+1);
        
    }
}