import java.util.*;
/* input 4 even 
output
1  2  3  4
9  10 11 12
13 14 15 16
5  6  7  8

input 5
1 2 3 4 5 
11 12 13 14 15 
21 22 23 24 25 
16 17 18 19 20 
6 7 8 9 10 
*/


class Mymain{
	public static void main(String[] args) {
		int n = 5;
		int a[] = new int[n/2];

		for(int i=0;i<n/2;i++){
			for(int j=(2*i*n+1);j<(2*i*n+1+n);j++){
				System.out.print(j+" ");
				if(j==(2*i*n+n))
					a[i] = j;
			}
		System.out.print("\n");	
		}

		if((n%2)!=0){
			for(int q=n*(n-1)+1;q<n*(n-1)+1+n;q++)
				System.out.print(q+" ");
		System.out.print("\n");	
		}

		/*for(int k : a)
			System.out.print(k+" ");*/


		for(int p=a.length-1;p>=0;p--){
			for(int q=a[p]+1;q<=a[p]+n;q++)
				System.out.print(q+" ");
			System.out.print("\n");
		}	
	}
}
