import java.util.*;
class Spiral{
	public static void main(String[] args) {
		int a[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16},
		};
		int rows = a.length ;
		int columns = a[0].length ;
		System.out.println("rows:"+rows+"\ncolumns:"+columns);
		print_spiral(a, rows, columns);
	}

	public static void print_spiral(int[][] a, int rows, int columns){
		int dir = 0;
		int row_index = 0;
		int column_index = columns-1;
		int last_row_index = a.length-1 ;
		int left_column_index = 0;
		System.out.println("");

		while(left_column_index<=column_index && row_index <= last_row_index){
			if(dir == 0){
				for(int i=row_index;i<=column_index;i++)
					System.out.print(a[row_index][i]+" ");
				dir++;
				row_index++;
				System.out.println("");
			}
			if(dir == 1){
				for(int j=row_index;j<=last_row_index;j++)
					System.out.print(a[j][column_index]+" ");
				dir++;
				column_index--;
				System.out.println("");
			}
			if(dir == 2){
				for(int k=column_index;k>=left_column_index;k--)
					System.out.print(a[last_row_index][k]+" ");
				dir++;
				last_row_index--;
				System.out.println("");
			}
			if(dir == 3){
				for(int l=last_row_index;l>=row_index;l--)
					System.out.print(a[l][left_column_index]+" ");
				dir = 0;
				left_column_index++;
				System.out.println("");
			}

			//System.out.println("row chnge\n");	

		}

	}
}