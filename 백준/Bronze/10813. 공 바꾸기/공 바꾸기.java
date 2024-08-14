import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int b=0; b<n; b++) {
			a[b] = b + 1;
		}
		int m = sc.nextInt();
		
		for(int j=0; j<m; j++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			int e = a[c-1];
			a[c-1] = a[d-1];
			a[d-1] = e;
	  }
		
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i] + " ");
		}
	}

}