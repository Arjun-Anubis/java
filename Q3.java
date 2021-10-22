import java.util.Scanner;

public class Q3 {
	public static void main( String [] args ) {
		System.out.println( "Enter Cp and Sp" );
		Scanner sc = new Scanner( System.in );
		double CP, SP;
		CP = sc.nextDouble();
		SP = sc.nextDouble();

		if ( SP > CP ) {
			System.out.printf( "Profit of %d\n", (int)(SP-CP) );
			}
	}
}
