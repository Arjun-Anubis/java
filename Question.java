import java.util.Scanner;

class Atransport {
	static String name;
	static int w;
	static int charge;

	public static void accept() {
		Scanner sc = new Scanner( System.in );

		System.out.printf( "Name of the customer : " );
		name = sc.next();

		System.out.printf( "Weight in kg, of the parcel : " );
		w = sc.nextInt();

	}

	public static void calculate() {
		charge = ( w < 10 ) ? ( w * 25 ) :  ( w > 30 ) ? ( w * 10 ) : ( w * 20 );
	}

	public static void print() {
		System.out.println( "Name\tWeight\tBill amount" );
		System.out.printf( "%s\t%d\t%f\n", name, w, charge * 105.0 / 100 );
	}
}

public class Question {
	public static void main( String [] args ) {
		Atransport obj = new Atransport();
		obj.accept();
		obj.calculate();
		obj.print();
	}
}
