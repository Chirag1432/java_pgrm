import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "agbdba";
		longest_palindromic_subsequence(s1);
	}
	public static void longest_palindromic_subsequence(String s2){
		int dp[][] = new int[s2.length()][s2.length()];

		for(int i=0;i<s2.length();i++)
			dp[i][i] = 1;

		for(int len=2;len<=s2.length();len++){
			for(int j=0;j<=s2.length()-len;j++){
				int k = len + j - 1;
				if((s2.charAt(j)==s2.charAt(k))&&(len==2))
					dp[j][k] = 2;
				else if(s2.charAt(j)==s2.charAt(k)){
					dp[j][k] = 2 + dp[j+1][k-1];
				}
				else
					dp[j][k] = Math.max(dp[j][k-1],dp[j+1][k]);

			}
		}
		System.out.println(dp[0][s2.length()-1]);
	}
}