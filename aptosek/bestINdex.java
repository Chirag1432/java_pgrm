import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int n = myscan.nextInt();
		long[] arr = new long[n+1];
		long[] pref = new long[n+1];
		arr[0] = 0;
		for(int i = 1; i<=n; ++i){
			arr[i] = myscan.nextLong();
			pref[i] = pref[i-1] + arr[i];	
		}

		long maxi = -Integer.MAX_VALUE;
		double range = 0; 

		int diff=0, f_range = 1, index; 
		long loc_max=0;

		for(int i = 1; i<=n; ++i){
			diff = n-i+1;
			range = (-1+Math.sqrt(1+8*diff))/2;
			f_range = (int)Math.floor(range);
			//System.out.println("i:"+i+"diff:"+diff+"range:"+range+"f_range:"+f_range);
			f_range = (int)(f_range*(f_range+1))/2;
			index = i + f_range - 1;
			System.out.println("i:"+i+"diff:"+diff+"range:"+range+"f_range:"+f_range+"index:"+index);
			loc_max = pref[index] - pref[i-1];
			if(loc_max > maxi)
				maxi = loc_max;
			System.out.println(loc_max);
		}

		System.out.println(maxi);

	}
}
