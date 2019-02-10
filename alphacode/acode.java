import java.util.*;

class Mymain{
	public static int[] dp = new int[100];
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		// for(int i=0;i<=20;i++)
		// 	dp[i] = 0;
		String s = "25114";
		int res = fun(s);
		System.out.println(res);
	}
	public static int fun(String s){
		int i=1;
		dp[0]=1;
		if(s.contains("0"))
			return -1;
		while(i<s.length()){
			if((s.charAt(i-1)<='2')&&(s.charAt(i)<='6'))
			{
				if(i<2)
					dp[i]=dp[i-1]+1;
				else
					dp[i] = dp[i-1]+dp[i-2];
			}
			else{
				dp[i]=dp[i-1];
			}
			i++;
		}
		return dp[i-1];

	}
}