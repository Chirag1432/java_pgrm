import java.util.*;
class BFS{
	private Queue<Integer> queue;
	public BFS(){
		queue = new LinkedList<Integer>();
	}
	public void bfs(int adj[][], int source){
		int num_of_columns = adj[source].length - 1;//array we considered from 1
		int[] visited = new int[num_of_columns+1];
		
		visited[source]=1;
		int i, element;
		queue.add(source);
		
		while(!queue.isEmpty()){
			element = queue.remove();
			int j = element;
			System.out.print(j+" ");
			i = 1;
			while(i<=num_of_columns){
				if(adj[element][i]==1 && visited[i]==0){
					queue.add(i);
					visited[i] = 1;				
				}
				i++;
			}
		}

	}
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int num_of_nodes, source;
		try{
			System.out.println("Enter the number of nodes in the graph");
			num_of_nodes = myscan.nextInt();
			int adj[][] = new int[num_of_nodes+1][num_of_nodes+1];
			//matrix started from 1 index
			for(int i=1;i<=num_of_nodes;i++){
				for (int j=1;j<=num_of_nodes;j++) {
					adj[i][j] = myscan.nextInt();
				}
			}
			System.out.println("Enter the source for the graph");
			source = myscan.nextInt();
			System.out.println("BFS TRAVERSAL IS");
			
			BFS ob = new BFS();
			ob.bfs(adj,source);
		}catch(Exception e){
			System.out.println("Exception");
		}
	}
}