package Java_Programs;

public class Fibonacci_series {
	public static void main(String[] args) {
		int i=1,n=10,firstTerm=0,secondTerm=1;
		System.out.println("fibonacii series" + n );
		
		
		while(i <= n) {
			System.out.print(firstTerm+",");
			
			
			int nextTerm=firstTerm+secondTerm;
			
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
			i++;
			
		}
	}

}
