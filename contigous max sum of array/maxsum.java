import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int[] a = {-2,-3,-1,-2,-3};

		//logic Kadane algorithm
		int max_abi_tak = Integer.MIN_VALUE;
		int max_ending_here=0;
		for(int i=0;i<a.length;i++){
			max_ending_here = max_ending_here + a[i];
			if(max_ending_here>max_abi_tak)
				max_abi_tak=max_ending_here;
			if(max_ending_here<0)
				max_ending_here = 0;
		}
		System.out.println(max_abi_tak);

	}
}