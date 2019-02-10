import java.util.*;
class Mymain{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String s = a.next();
		Boolean b = is_circle_exist(s);
		System.out.println(b); 
	}
	public static Boolean is_circle_exist(String s){
		int dir = 0;
		int x=0, y=0;
		for(int i=0;i<s.length;i++){
			if(s[i]=="L"){
				dir = (dir+1)%4;
			}else if(s[i]=="R"){
				dir = (4+dir-1)%4;
			}else{
				if(dir==0){
					x++;
				}else if(dir==1){
					y++;
				}else if(dir==2){
					x--;
				}else if(dir==3){
					y++;
				}
			}
		}
		return((x==0)&&(y==0));
	}
}