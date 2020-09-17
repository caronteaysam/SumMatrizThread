public class SumThread extends Thread {

	private int array[];
	private int id;
	
	public SumThread ( int id, int array[] ) {
		
		this.id = id;
		this.array = array;
	}
	
	@Override
	public void run() {
		
		int sum = 0;
		for ( int i : this.array ) sum += i;
		
		System.out.printf ( "\nLinha %d - resultado da soma: %d", this.id, sum );
	}
}
