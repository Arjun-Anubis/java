import java.util.Scanner;

public class Q4 {
	public static void main( String [] args ) {
		int physics, chemistry, biology;
		Scanner sc = new Scanner( System.in );
		System.out.print( "Physics\t\t");
		physics = sc.nextInt();
		System.out.print( "Chemistry\t");
		chemistry = sc.nextInt();
		System.out.print( "Biology\t\t");
		biology = sc.nextInt();
		
		System.out.println ( "Aggregate\t" + ( physics + chemistry + biology )/3.0 );
		System.out.println( Math.round( physics ) );
		System.out.println( Math.round( chemistry ) );
		System.out.println( Math.round( biology ) );
		
	}
}
