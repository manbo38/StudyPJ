import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String[] c = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		for(String aaa : c) {
			if(s.contains(aaa)) {
				s = s.replace(aaa, "*");
			}
		}
		
		System.out.println(s.length());
	}

}