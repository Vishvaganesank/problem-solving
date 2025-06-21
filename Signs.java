
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if((a^b)<0) {
			System.out.println("Opposite signs");
		}else {
			System.out.println("Same signs");
		}
	}

}
