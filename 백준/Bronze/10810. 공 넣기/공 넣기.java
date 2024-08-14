import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int m = sc.nextInt();
				
		for(int b=0; b<m; b++) {
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		for(int index = i-1; index<j; index++) {
			a[index] = k;
		}
	  }
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

}