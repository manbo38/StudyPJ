import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int b = sc.nextInt();
		
		String a = Integer.toString(s,b);
		
		System.out.println(a.toUpperCase());
		
		
	}

}