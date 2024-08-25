import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		String aa = new StringBuilder(a).reverse().toString();
		String bb = new StringBuilder(b).reverse().toString();
		
		int c = Integer.parseInt(aa);
		int d = Integer.parseInt(bb);
		
		if(c > d) {
			System.out.println(c);
		}else if(c < d) {
			System.out.println(d);
		}
		
	}

}
