/* @author Chirag Gupta 9/2/19 */
import java.util.*;
class NQueenProblem{

	class Position{
		int row, col;
		Position(int row,int col){
			this.row = row;
			this.col = col;
		}
	}

	public Position[] solveNQueenOneSolution(int n){
		Position[] positions = new Position[n];
		boolean hasSolution = solveNQueenOneSolutionUtil(n, 0, positions);
		if(hasSolution){
			System.out.println("Has Solution --> Yes");
			return positions;
		}
		else{
			System.out.println("Has Solution --> No");
			return new Position[0];
		}
	}

	public boolean solveNQueenOneSolutionUtil(int n, int row, Position[] positions){
		if(n == row)
			return true;

		int col;
		for(col=0;col<n;col++){
			boolean issafe = true;

			//check if this row and col is not under attack from any previous queen.
			for(int queen=0;queen<row;queen++){
				if((positions[queen].col == col) || (positions[queen].row - positions[queen].col == row - col) || (positions[queen].row + positions[queen].col == row + col)){
					issafe = false;
					break;
				}
			}
			if(issafe){
				positions[row] = new Position(row, col);
				if(solveNQueenOneSolutionUtil(n, row+1, positions))
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		NQueenProblem s = new NQueenProblem();
		Position[] p = s.solveNQueenOneSolution(4);
		Arrays.stream(p).forEach(xyz -> System.out.println(xyz.row + " " +xyz.col));
	}
}