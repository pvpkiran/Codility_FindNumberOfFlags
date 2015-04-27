public class FindNumberOfFlags{
	
	public static void main(String[] args) {
		int[][] A = new int[][]{
				{5, 4, 4},
				{4, 3, 4},
				{3, 2, 4},
				{2, 2, 2},
				{3, 3, 4},
				{1, 4, 4},
				{4, 1, 1}
		};
		int rows=A.length;
		int columns=A[0].length;
		
		boolean[][] visited= new boolean[rows][columns];
		
		int totalCount=rows*columns;
		
		Main m = new Main();
		for(int i=0; i<rows ;i++)
		{
			 for (int j = 0; j < columns; j++){
				int count = m.recur(i, j, A, rows, columns, visited, 0);
				  //System.out.println("Count = " + count);
				if(count>0)	
					totalCount= totalCount-count;
			 }
		}

		System.out.println("Total Count = " + totalCount);	
	}
	
	public int recur(int i, int j, int  A[][], int rows, int columns, boolean[][] visited, int totalCount){
		visited[i][j] = true;
		if(j+1 < columns && !visited[i][j+1] && A[i][j] == A[i][j+1]){
			visited[i][j+1] = true;
			totalCount = recur(i, j+1, A, rows, columns, visited, totalCount+1);
		}
		if(i+1 < rows && !visited[i+1][j] && A[i][j] == A[i+1][j]){
			visited[i+1][j] = true;
			totalCount =recur(i+1, j, A, rows, columns, visited, totalCount+1);
		}
		if(i-1 >=0 && !visited[i-1][j] && A[i][j] == A[i-1][j]){
			visited[i-1][j] = true;
			totalCount =recur(i-1, j, A, rows, columns, visited, totalCount+1);
		}
		if(j-1 >=0 && !visited[i][j-1] && A[i][j] == A[i][j-1]){
			visited[i][j-1] = true;
			totalCount =recur(i, j-1, A, rows, columns, visited, totalCount+1);
		}
		return totalCount;
	}
}