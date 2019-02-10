import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		String source = "longest";
		String target = "stone";//common
		String s1 = source + source;
		//System.out.println(s1);
		String s2 = "";
		Mymain ob = new Mymain();
		int m = source.length();
		int n = target.length();
		/*for(int i=0;i<source.length();i++){
			for(int j=i;j<i+source.length();j++){
				s2 = s2 + s1.charAt(j);
			}
			System.out.println(s2);
			ob.lcs(s2,target,m,n);
			s2 = "";
		}*/
		ob.lcs(source,target,m,n);
		
	}
	public void lcs(String source, String target, int m, int n){
		int[][] a = new int[n+1][m+1];

		for(int i=0;i<=n;i++){
			for(int j=0;j<=m;j++){
				if((i==0)||(j==0))
					a[i][j] = 0;
				else if(target.charAt(i-1)==source.charAt(j-1))
					a[i][j] = 1 + a[i-1][j-1];
				else
					a[i][j] = Math.max(a[i][j-1],a[i-1][j]);
			}
		}
		System.out.println(a[n][m]);
		//isequaltotarget(source, target, a);
		

	}

	public void isequaltotarget(String source, String target, int a[][]){
		String s = "";
		//System.out.println(a.length+" "+a[0].length);
		for(int i=a.length-1;i>0;i--)
		{
			//System.out.println("row no:"+i);
			int j=a[i].length-1;
			while(j>0){
				//System.out.println("col no:"+i);
				if((Math.max(a[i][j-1],a[i-1][j])==a[i][j])&&(a[i][j]!=0)){
					System.out.println(j);
					j--;
					if(j<0)
						break;
				}
				else{	
						System.out.println(source.charAt(j-1));
						s = s + source.charAt(j-1);
						i--;
						j--;
						if(j<0)
						break;
					}
				}
		}
		System.out.println("s  "+ s);
		System.out.println("target  "+ target);
		if(s.equals(target)){
			System.out.println("both are equal");
		}
		else
			System.out.println("NOT equal");
		s = "";

	}
}