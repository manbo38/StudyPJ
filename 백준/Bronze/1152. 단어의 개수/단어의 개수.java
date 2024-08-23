import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String[] w = s.trim().split("\\s");
		
		if(s.trim().isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(w.length);
		}
		
	}

}