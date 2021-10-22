import java.util.Scanner;
public class question3 {
	public static void main (String [] args ) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		double logged;
		logged = Math.log(val);
		System.out.println(logged);	
		double sqrted = Math.sqrt(val);
		System.out.println(sqrted);
		double cubed = Math.pow(val, 3);
		System.out.println(cubed);
		}
}
