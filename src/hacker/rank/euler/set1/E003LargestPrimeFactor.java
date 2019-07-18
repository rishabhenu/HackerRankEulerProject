package hacker.rank.euler.set1;

import java.util.Scanner;
/**
 * 
 * @author Rishabh Sharma
 * @source https://www.hackerrank.com/contests/projecteuler/challenges/euler003/problem
 * 
 * @result <br/> Passed all in Java<br/> Passed all but one test case in node js
 */
public class E003LargestPrimeFactor {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			if (isPrime(n)) {
				System.out.println(n);
				continue;
			}
			long temp = n / 2;
			long i = 2;
			while (temp > 0) {
				if (n % i == 0 && isPrime(n / i)) {
					n = n / i;
					break;
				}
				i++;
				temp = n / i;
			}
			System.out.println(n);
		}
	}

	public static boolean isPrime(long l) {
		long temp = 1 + l / 2;
		long i = 2;
		while (i < temp) {
			if (l % i == 0)
				return false;
			i++;
			temp = 1 + l / i;
		}
		return true;
	}
}
