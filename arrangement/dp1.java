import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int num_of_arrangement = fun(4);
		System.out.println(num_of_arrangement);
	}

	public static int fun(int n){
		if(n<0)
			return 0;
		if(n==0)
			return 1;
		else
			return(fun(n-1)+fun(n-3)+fun(n-5));
	}
}