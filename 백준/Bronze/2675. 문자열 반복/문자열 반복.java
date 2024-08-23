import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			String s = sc.next();
			sc.nextLine();
						
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<b; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		
	}

}