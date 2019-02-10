import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan =  new Scanner(System.in);
		System.out.println("Binary Search");
		int a[] = {1,5,10,15,20,30};
		System.out.println("search element");
		int n1 = myscan.nextInt();
		int b = binSearch(a,0,a.length-1,n1);
		if(b ==-1)
			System.out.println("search element not present");
		else
			System.out.println("present");
	}

	public static int binSearch(int a[],int l,int r,int n1){
		if(l<r){
			int mid = (l+r)/2;

			if(a[mid]==n1)
				return 1;

			if(a[mid]>n1)
				return binSearch(a,l,mid,n1);
			else
				return binSearch(a,mid+1,r,n1);
		}
		else
			return -1;
	}
}
