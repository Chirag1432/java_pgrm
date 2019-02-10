// integer combination means subsets
import java.util.*;
class Mymain{
	public static void main(String[] args) {
		//String s1 = "AB";
		/* number of permutation = 4!/2! = 12 */
		/*for(char c : s1) Error
			System.out.println(c);*/
		int[] s1 = {1,2,3,4};
		mapping(s1);
	}
	public static void mapping(int[] s1){
		Map<Integer, Integer> countmap = new TreeMap<>();
		//char[] input = s1.toCharArray();
		for(int ch : s1){
			countmap.compute(ch, (key, val) -> {
				if(val == null)
					return 1;
				else
					return val + 1;
			});
		}
		System.out.println(countmap.size());//return no. of distinct elements 
		
		int[] count = new int[countmap.size()];
		int[] str = new int[countmap.size()];
		int index = 0;
		
		for(Map.Entry<Integer, Integer> entry : countmap.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
			str[index] = entry.getKey();
			count[index] = entry.getValue();
			index ++;
		}
		int[] result = new int[s1.length];
		//permutation_pattern_printing(str, count, result, 0);
		combination_pattern_printing(str, count, result, 0, 0);
	}


	public static void combination_pattern_printing(int[] str, int[] count, int[] result, int level, int continue_from_index){
		if(level < result.length && level==2){
			printArraycombination(result, level);
		}/*else{
			printArraycombination(result, level);
			return;
		}*/

		for(int i=continue_from_index; i<str.length; i++){
			if(count[i]==0)
				continue;
			result[level] = str[i];
			count[i]--;
			combination_pattern_printing(str, count, result, level+1, i);
			count[i]++;
		}
	}

	public static void printArraycombination(int[] result, int level){
		//void print(char result[],int pos){
        for(int i=0; i < level; i++){
            System.out.print(result[i] + " ");
        }
       // System.out.println();
    //}
		System.out.print("\n");
	}
}