import java.util.*;
class Mymain{
	public static int[] dp = new int[100];
	
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int n = 6;
		for(int i=0;i<=6;i++)
			dp[i] = -1;

		for(int i=1;i<=n;i++)
			System.out.print(fib(i)+" ");
	}

	public static int fib(int num){
		if(dp[num]==-1){	
			if(num<=1)
				dp[num]=num;
			else
				dp[num]=fib(num-1)+fib(num-2);
		}
		return dp[num];

	}

}

