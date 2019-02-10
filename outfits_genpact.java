import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Mymain ob = new Mymain();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(8);
		//al.get(3) run time exception
		System.out.println(al.get(2));
		int money = 2;

		ob.outfits(al,money);
	}
	public void outfits(List<Integer> l, int money){
		System.out.println(l+" "+ money);
		Collections.sort(l);
		System.out.println(l+" "+ money+" "+l.size());
		int count = 0;
		for(int i=0;i<l.size();i++){
			if(l.get(i)<=money){
				count++;
				money = money - l.get(i); 
			}
		}
		System.out.println(count);

	}
}