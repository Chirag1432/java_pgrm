import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int[] a = { 20,21,22 };
		int res = lcm(a);//4620
		System.out.println("Lcm of the Array is:"+res);
		int gcd_res = hcf(a);
		System.out.println("HCF of the Array is:"+gcd_res);
	}
	public static int lcm(int a[]){
		int ans = a[0];
		for(int i=1;i<a.length;i++){
			ans = (a[i]*ans)/(gcd(a[i],ans));//a*b=hcf*lcm
		}
		return ans;
	}

	public static int gcd(int n1, int n2){
		if((n1==0)||(n2==0))
			return 0;
		if(n1==n2)
			return n1;
		if(n1>n2)
			return gcd(n1-n2,n2);
		else
			return gcd(n1,n2-n1);
	}
	public static int hcf(int a[]){
		int ans = a[0];	
		for(int i=1;i<a.length;i++){
			ans = gcd(a[i],ans);
		}
		return ans;

	}

}