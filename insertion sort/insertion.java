// playing cards and arranging

import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.println("----------Insertion Sort--------------");
		System.out.println("Enter the number of elements in Array");
		int n = myscan.nextInt();
		System.out.println(n);
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = myscan.nextInt();

		// System.out.println(a.length);
		/*for(int x : a)
			System.out.print(x+" ");*/

		insertion(a);
	}
	//9 4 2    4 9 2
	//0 1 2    0 1 2
	public static void insertion(int a[]){
	for (int i=1;i<a.length;i++) 
	{
		int key = a[i];
		int j=i-1; 
		while((j>=0)&&(key<a[j])){//shortcircuit operator
			// System.out.println(j);
			a[j+1] = a[j];
			j--; 
			// System.out.println(j);
		}
		a[j+1] = key;
	}

	for(int x : a)
			System.out.print(x+" ");	

	}

}
