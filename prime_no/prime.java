import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int n = 353;
		String s = n+"";
		//System.out.println(s.length()+" "+(int)((int)s.charAt(0)-48));
		int[] b = new int[s.length()+1];
		for(int i=0;i<s.length()+1;i++)
			b[i] = 0;
		b[0] = isPrime(n);
		if(b[0]==0){
			System.out.println("NO");
			System.exit(0);
		}
		for(int j=1;j<s.length()+1;j++){
			b[j] = isPrime((int)((int)s.charAt(j-1)-48));
			if(b[j]==0){
				System.out.println("NO");
				System.exit(0);
			}
		}

		/*for(int x : b)
			System.out.print(x+" ");*/
		System.out.println("YES");
	}
	public static int isPrime(int n){
		int count = 0;
		if(n<=1)
			return 0; 
		for(int i=2;i<n;i++){
			if((n%i)==0)
				count++;
			if(count>=1)
				return 0;
		}
		return 1;
	}
}