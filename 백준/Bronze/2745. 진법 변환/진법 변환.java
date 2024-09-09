import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();
		int b = Integer.parseInt(s, a);
		
		System.out.println(b);
	}

}