// Java program to find large factorials using BigInteger
import java.math.BigInteger;
import java.util.Scanner;

class Example
{
	// Returns Factorial of N
	static BigInteger factorial(int N)
	{
		// Initialize result
		BigInteger f = new BigInteger("1"); // Or BigInteger.ONE

        System.out.println("b initial:"+f);
		// Multiply f with 2, 3, ...N
		for (int i = 2; i <= N; i++){
			f = f.multiply(BigInteger.valueOf(i));
            //System.out.print(f+" ");   
		}
		return f;//return f+"" if return type is string
	}

	// Driver method
	public static void main(String args[]) throws Exception
	{
		int N = 20;
		/*Integer a=1;
		for(int i=1;i<=N;i++){
			a = a * i;
		}*/	

		System.out.println(factorial(N));
		
		String s1 = "111111";
		String s2 = "11111";
		BigInteger f1 = new BigInteger(s1);	
		BigInteger f2 = new BigInteger(s2);
		System.out.println(f1.add(f2));

	}
}
