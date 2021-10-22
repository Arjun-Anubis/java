public class t {
	public static void main( String [] args ) {
		System.out.println( atoi( "1232" ) );
	}
	public static int atoi( String s ) {
		int sum = 0;
		int length = s.length();
		for ( int i = length - 1; i >= 0; i-- ) {
			sum +=  (s.charAt(i) - '0') * Math.pow( 10, length - 1 - i ) ;
		}
		return sum;
	}
}

