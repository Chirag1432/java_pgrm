import java.util.*;
interface Phone{
	void show();
}
class Mymain implements Phone{
	public static void main(String[] args) {
		
		Phone p = new Phone(){
			public void show(){
				System.out.println("hello annoynomous inner class");
			}
		};
		
		p.show();
	}
}