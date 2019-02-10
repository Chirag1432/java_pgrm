import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = myscan.nextInt();
		System.out.println("Number of Queries ");
		int q = myscan.nextInt();

		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i] = myscan.nextInt();

		for(int j=1;j<=q;j++)
		{
			int qno = myscan.nextInt();
			int pos = myscan.nextInt();
			if((qno==0)&&(pos==0))
			{
				System.out.println("-1");
				rhs(pos,a);
			}
			else if((qno==0)&&(pos==n-1))
			{
				lhs(pos, a);
				System.out.println("-1");
			}
			else if(qno==0)
			{
				lhs(pos,a);
				rhs(pos,a);
			}else
			{
				a[pos]=1;
			}
		}
	
	}
	public static void rhs(int pos, int a[]){
		for(int i=pos+1;i<a.length;i++){
					if(a[i]==1){
						System.out.println(i);
						break;
					}
					else if((a[i]!=1)&&(i==a.length-1))
						System.out.println("-1");

				}
	}

	public static void lhs(int pos, int a[]){
		for(int i=pos-1;i>=0;i--){
					if(a[i]==1){
						System.out.println(i);
						break;
					}
					else if((a[i]!=1)&&(i==0))
						System.out.println("-1");

				}
	}
}