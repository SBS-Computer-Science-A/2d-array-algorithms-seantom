package hello;

public class Transpose {
	public static int[][] transpose(int[][] array) {
		int[][] ret = new int[array[0].length][array.length];
		for (int i =0; i<array[0].length;i++) {
			for (int k = 0; k<array.length;k++) {
				ret[i][k] = array[k][i];
			}
		}
		return ret;
		}
	public static void transposeInPlace(int[][] array){
		for(int i=1;i<array.length;i++) {
			for(int j=0;j<i;j++) {
				int temp=array[i][j];
				array[i][j]=array[j][i];
				array[j][i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] test = {{1,2,3,12},{4,5,6,11},{7,8,9,10}};
		int[][] ret = transpose(test);
		int[][] test2 = {{1,2,3},{4,5,6},{7,8,9}};
		transposeInPlace(test2);
		for (int i = 0;i<test2.length;i++) {
			for (int k = 0; k<test2.length;k++) {
				System.out.println(test2[i][k]);
			}
		}
		
	}
}
