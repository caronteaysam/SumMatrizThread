
public class Main {
	
	public static void main ( String args[] ) {
		
		int matriz[][] = new int[3][5];
		
		for ( int i = 0; i < 3; i++ ) {
			
			// generating random number
			for ( int i2 = 0; i2 < 5; i2++ ) matriz[i][i2] = (int)( Math.random ( ) * 100 );
			
			// do sum
			new SumThread ( i, matriz[i] ).start ( );
		}
	}
}
