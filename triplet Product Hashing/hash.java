import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6,8};
		int product = 24;
		int res = fun(a,product);
		System.out.println(res);
	}
	public static int fun(int a[], int product){
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		int i=0,count=0;
		for(int n:a){
			hm.put(n,i);//(key, value)pair
			i++;
		}
		//get method returns value corresponds to key
		//take care of map properties that does not hold duplicate elements see line 22 first two conditions
		for(int j=0;j<i-1;j++){
			for(int k=j+1;k<i;k++){
				if((a[j]*a[k]<=product)&&(a[j]*a[k]!=0)&&(product%(a[j]*a[k]))==0){
					int div = product/(a[j]*a[k]);
					if((div!=a[j])&&(div!=a[k])&&(hm.containsKey(div))&&(hm.get(div)>j)&&(hm.get(div)>k)){
						count++;
					}
				}
			}
		}
		return count;
	}
}
/*final class A{
	A()
	{
		System.out.println("inside A class");
	}
}

class Point extends A {
	int m_x, m_y; 
	public Point(int x, int y) { m_x = x; m_y = y; }
	public static void main(String args[]) 
	{
	Point p = new Point(2,2);

	}
}
*/

