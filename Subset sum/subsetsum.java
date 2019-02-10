import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int[] a = {4, 2, 3};
		int sum = 6;

		boolean dp[][] = new boolean[a.length+1][sum+1];

		for(int i=0;i<a.length+1;i++)
			dp[i][0] = true;

		for(int i=1;i<a.length+1;i++){
			for(int j=1;j<sum+1;j++){
				if(a[i-1]>j)
					dp[i][j] = dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j-a[i-1]] || dp[i-1][j];

			}
		}

		/* extension returns no. of sets of sum X
		for(int i=1;i<a.length+1;i++){
			for(int j=1;j<sum+1;j++){
				if(a[i-1]>j)
					dp[i][j] = dp[i-1][j];
				else if(dp[i-1][j-a[i-1]]==1 || dp[i-1][j]==1)
					dp[i][j] = dp[i-1][j-a[i-1]] + dp[i-1][j];
				else
					dp[i][j] = 0;

			}
		}
		*/

		for(boolean[] b: dp){
			for(boolean c : b){
				System.out.print(c+" ");
			}
			System.out.print("\n");
		}
		System.out.print("Sub Set Sum of "+sum+"is");
		if(dp[a.length][sum])
			System.out.println(" present");
		else
			System.out.println(" absent");

	}
}