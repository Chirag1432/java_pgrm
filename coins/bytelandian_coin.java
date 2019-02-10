import java.util.*;
class Mymain{
	public static int[] dp = new int[100];
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		for(int i=0;i<=6;i++)
			dp[i] = -1;
		int n = 6;
		int res = exchange(n);
		System.out.println(res);
		for(int i=0;i<=6;i++)
			System.out.print(dp[i]+" ");
	}
	public static int exchange(int coin){
		if(dp[coin]!=-1)
			return dp[coin];
		if(coin<=1)//these value is just using to calculate expression i.e base case means value is not updated in dp
			return dp[coin]=coin;
		
		//dp[coin]=exchange(coin/2)+exchange(coin/3)+exchange(coin/4);
		int value = exchange(coin/2)+exchange(coin/3)+exchange(coin/4);
		if(value>coin)
			return dp[coin]=value;
		else
			return dp[coin]=coin;


	}
}