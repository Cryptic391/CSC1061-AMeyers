
public class Fibonachi {
	
	public static long recursioncnt = 0;
	public static long[] termArray = new long[200];
	
	public static void main(String[] args) {
		
	int n = 50;
	System.out.println("The " + n + "th term is " + fibIterative(n) + ".");	
	System.out.println("Fibonacci count: " + recursioncnt + ".");
	}

	private static long fibRecursive(int n) {
	
		if(n <= 1) {
			return n;
		}
		recursioncnt++;
		
		long ans = fibRecursive(n - 1) + fibRecursive(n - 2);
		return ans;
	}
	
	public static long fibRecDynamic(int n) {
		if(n <= 1) {
			return n;
		}
		if(termArray[n] > 0) {
			return termArray[n];
		}
		
		recursioncnt++;
		
		long ans = fibRecDynamic(n - 1) + fibRecDynamic(n - 2);
		termArray[n] = ans;
		return ans;
		
	}
	
	public static long fibIterative(int n) {
		if(n <= 1) {
			return n;
		}
		
		long prev1 = 1;
		long prev2 = 0;
		long ans = 0;
		for(int i = 2; i <= n; i++) {
			ans = prev1 + prev2;
			prev2 = prev1;
			prev1 = ans;
			recursioncnt++;
		}
		return ans;
	}
	
	

}
