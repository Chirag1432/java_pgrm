import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int a[] = {1,2,5,4,10,2,11,1};
		int size = a.length ;
		int b[] = new int[size];//default value = 0
		for(int i=0;i<size;i++)
			b[i] = 1;

		//logic see copy IBIT
		int p, q;
		for(q=1;q<b.length;q++){
			for(p=0;p<q;p++)
			{
				if(a[p]<a[q])
					b[q] = Math.max(b[q],b[p]+1);
			}	
		}

		for(int x : b)
			System.out.print(x + " ");

		//finding maximum in array
		int max = -999;
		for(int w=0;w<b.length;w++){
			if(max < b[w])
				max = b[w]; 
		}
		System.out.println(max);
	}
}