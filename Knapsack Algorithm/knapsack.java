// 0/1 knapsack algorithm
import java.util.*;
class Knapsack{
	public static void main(String[] args) {
		int[] weight = {1,3,4,5};
		int[] value = {1,4,5,7};
		int total_weight = 7;
		Knapsack ob = new Knapsack();
		System.out.println("Maximum value we can get is:" + ob.knapsack(weight,value,total_weight));
	}
	public int knapsack(int[] weight, int[] value, int total_weight)
	{
		int[][] a = new int[weight.length+1][total_weight+1];

		for(int i=0;i<weight.length+1;i++){
			for(int j=0;j<total_weight+1;j++){
				if(i==0||j==0)
					a[i][j] = 0;
				else if(j<weight[i-1])
					a[i][j] = a[i-1][j];
				else 
					a[i][j] = Math.max(value[i-1]+a[i-1][j-weight[i-1]],a[i-1][j]);

			}
			
		}
		System.out.println("_____Weigth_______");
		for(int i=0;i<weight.length+1;i++){
			for(int j=0;j<total_weight+1;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		return a[weight.length][total_weight];
	}
}