package hacker.rank.euler.set1;

/**
 * 
 * @author Rishabh Sharma
 * @source https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem
 * 
 * @result <br/>passed JAVA<br>1 test case failed in Node.js
 */
public class E002SumOfEvenFibonnicciTerms {
	
	public static void main(String...strings) {
		long n = Integer.MAX_VALUE;
		System.out.println(getSum(n));
	}

	
	/**
	 * 
	 * @param n
	 * @return this method return the sum of all even terms below n in a fibonnicci seriessD
	 */
	public static long getSum(long n){
        long f1 = 1, f2 = 2;
        long sum = 0;
        while(f2<n){
            if(f2%2 == 0){
                sum += f2;
            }
            long temp = f1+f2;
            f1 = f2;
            f2 = temp;
        }
        return sum;
    }
}
