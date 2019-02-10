import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "sabgcf";
		String s2 = "qerabgf";

		int[][] T = new int[s2.length()+1][s1.length()+1];

/*		for(int i=0;i<=s1.length;i++)
			T[0][i] = 0;*/
		int max = 0;
		for(int i=1;i<=s2.length();i++){
			for(int j=1;j<=s1.length();j++){
				/*if((i==0)&&(j==0)) by default in java
					T[i][j] = 0;*/
				if(s2.charAt(i-1)==s1.charAt(j-1)){
					T[i][j] = 1+T[i-1][j-1];
					if(max<=T[i][j])
						max = T[i][j];
				}
				else
					T[i][j] = 0;
			}
		}
		System.out.println(max);
	}
}