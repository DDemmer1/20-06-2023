package de.demmer.dennis;

public class IntUtil {
	
	
	public int recTest(int i) {
		
//		System.out.println(i);
		if(i == 20) {
			return i;
		}
		i++;
		return recTest(i);
		
	}
	
	
	
	
	public int sum(int k) {
		y = 0;
		return recSum(k);
	}
	
	
	
	int y = 0;
	
	private int recSum(int k) {

		if(k < 0) {
			return y;
		}

		y = y + k;
		// y = 0 + 10;
		// y = 10 + 9
		// y = 19 + 8
		
		recSum(k-1);
		
		return y;
	}
	
	
	
	
//	public int sum(int k) {
//		
//		if(k > 0 ) {
//			return k + sum(k-1);
//			// 10 + sum(9)
//			// 10 + 9 + sum(8)
//			// 10 + 9 + 8 + sum(7)
//			// ... sum(0)
//		} else {
//			return 0;
//		}
//	 }
	
	
	
	
	
	
	
}
