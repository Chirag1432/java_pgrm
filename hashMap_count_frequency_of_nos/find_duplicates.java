import java.util.*;
class Mymain{
	public static void main(String[] args) {
		int a[] = {1, 2, 2, 3, 5, 6, 7};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				System.out.println("Duplicate value " + a[i]);
				break;
			}
			else
				hm.put(a[i],1);
		}
	}
}