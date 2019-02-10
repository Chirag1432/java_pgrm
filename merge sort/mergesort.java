import java.util.*;

class Mymain {
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.println("----------Merge Sort--------------");
		System.out.println("Enter the number of elements in Array");
		int n = myscan.nextInt();
		int a[] = new int[n+1];
		for(int i=1;i<=n;i++)
			a[i] = myscan.nextInt();

		mergesort(a,1,n);//array start from one index

		for(int i=1;i<a.length;i++)
			System.out.print(a[i]+" ");

	}

	public static void mergesort(int a[], int s, int e){
		if(s<e){
			int mid = (s+e)/2;
			mergesort(a,s,mid);
			mergesort(a,mid+1,e);
			merge(a,s,mid,e);

		}
	}



	public static void merge(int a[], int s, int mid, int e){
		int max = 9999;
		int n1 = mid - s + 1;
		int n2 = e - mid;
		int left[] = new int[n1+2];
		int right[] = new int[n2+2];
		
		for(int i=1;i<=n1;i++)
			left[i]=a[s+i-1];
		
		for(int j=1;j<=n2;j++)
			right[j]=a[mid+j];
		left[n1+1]=max;
		right[n2+1]=max;
		
		// int b[] = new int[n1+n2];
		int lptr=1, rptr=1;
		for(int k=s;k<=e;k++){
			if(left[lptr]<right[rptr]){
				a[k]=left[lptr];
				lptr++;
			}else{
				a[k]=right[rptr];
				rptr++;
			}


		}






	}
}