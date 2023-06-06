package in.ineuron;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
		transposeMatrix(matrix);
		for(int[] arr: matrix) {
			for(int num: arr)
				System.out.print(num+" ");
			System.out.println();
		}
		
		
	}

	private static void transposeMatrix(int[][] matrix) {
		
		//boolean[][] check=new boolean[matrix.length][matrix[0].length];
		for(int i=0; i<matrix.length; i++) {
			for(int j=i+1; j<matrix[0].length; j++) {
				
				int temp= matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
					
				
				//System.out.print(" After "+matrix[i][j]+" "+matrix[j][i]);
			}
		}
		
	}

}
