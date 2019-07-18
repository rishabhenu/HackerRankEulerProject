package hacker.rank.euler.set1;
/**
 * 
 * @author Rishabh Sharma
 *
 * @source https://www.hackerrank.com/contests/projecteuler/challenges/euler001/copy-from/1315047259
 * 
 * @result all test cases passed <br/>
 * 
 * 
 */
public class E001MultiplesOf3and5 {

    public static void main(String[] args) {
        int num = Integer.MAX_VALUE;
        System.out.println(getSum(num));
    }

    private static long getSum(int num){
        long sum = 0;
        long n = 0;
        
        n = (num-1)/3;
        sum += 3 * n * (n+1);
        
        n = (num-1)/5;
        sum += 5 * n * (n+1);
        
        n = (num-1)/15;
        sum -= 15 * n * (n+1);
        
        return sum/2;
    }	
}
