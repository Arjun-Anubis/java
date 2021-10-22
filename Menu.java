import java.util.Scanner;
public class Menu {

	public static void x() {
		double x;
		double y = 5.5;
		double z;

		System.out.println( "X\tY\tZ" );
		for ( x = -10; x <= 10; x++ ) {
			z = ( Math.pow( x, 3 ) + 0.5 * x ) / y;
			System.out.printf( "%f\t%f\t%f\n", x, y, z );
		}
	}	
	public static void floyds( int N ) {
		int counter = 1;
		int row;
		int column;
		for ( row = 1; row <= N; row++ ) {
			for ( column = 1; column <= row ; column++ ) {
				System.out.printf( "%d\t", counter++ );
			}
			System.out.println();
		}
	}

	public static void main( String [] args ) {
		int choice;
		Scanner sc = new Scanner( System.in );

		System.out.println( "Input choice [1, 2] : " );
		choice = sc.nextInt();
		

		switch ( choice ) {
			case 1:
				x();
				break;
			case 2:
				floyds( 5 );
				break;
			}
	}
}
