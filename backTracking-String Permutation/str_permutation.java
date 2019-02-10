import java.util.*;
class Mymain{
	public static void main(String[] args) {
		String s1 = "AB";
		/* number of permutation = 4!/2! = 12 */
		/*for(char c : s1) Error
			System.out.println(c);*/
		mapping(s1);
	}
	public static void mapping(String s1){
		Map<Character, Integer> countmap = new TreeMap<>();
		char[] input = s1.toCharArray();
		for(char ch : input){
			countmap.compute(ch, (key, val) -> {
				if(val == null)
					return 1;
				else
					return val + 1;
			});
		}
		System.out.println(countmap.size());//return no. of distinct elements 
		
		int[] count = new int[countmap.size()];
		char[] str = new char[countmap.size()];
		int index = 0;
		
		for(Map.Entry<Character, Integer> entry : countmap.entrySet()){
			System.out.println(entry.getKey()+"->"+entry.getValue());
			str[index] = entry.getKey();
			count[index] = entry.getValue();
			index ++;
		}
		char[] result = new char[s1.length()];
		//permutation_pattern_printing(str, count, result, 0);
		combination_pattern_printing(str, count, result, 0, 0);
	}

	public static void permutation_pattern_printing(char[] str, int[] count, char[] result, int level){
		if(level == result.length){
			printArray(result);
			return;
		}

		for(int i=0; i<str.length; i++){
			if(count[i]==0)
				continue;
			result[level] = str[i];
			count[i]--;
			permutation_pattern_printing(str, count, result, level+1);
			count[i]++;
		}
	}


	public static void combination_pattern_printing(char[] str, int[] count, char[] result, int level, int continue_from_index){
		if(level < result.length){
			printArraycombination(result, level);
		}else{
			printArraycombination(result, level);
			return;
		}

		for(int i=continue_from_index; i<str.length; i++){
			if(count[i]==0)
				continue;
			result[level] = str[i];
			count[i]--;
			combination_pattern_printing(str, count, result, level+1, i);
			count[i]++;
		}
	}

	public static void printArraycombination(char[] result, int level){
		//void print(char result[],int pos){
        for(int i=0; i < level; i++){
            System.out.print(result[i] + " ");
        }
       // System.out.println();
    //}
		System.out.print("\n");
	}

	public static void printArray(char[] result){
		for(char c : result)
			System.out.print(c);
		System.out.print("\n");
	}
}