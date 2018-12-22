
public class DemoSpiralMatrix {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		int rowstart=0;
		int rowlength=a.length-1;
		int colstart=0;
		int collength=a[0].length-1;
		while(rowstart<=rowlength && colstart<=collength) {
			for(int i=rowstart;i<=collength;i++) {
				System.out.print(a[rowstart][i]+" ");
			}
			for(int j=rowstart+1;j<=rowlength;j++) {
				System.out.print(a[j][collength]+" ");
			}
			for(int k=collength-1;k>=colstart;k--) {
				System.out.print(a[rowlength][k]+" ");
			}
			for(int k=rowlength-1;k>rowstart;k--) {
				System.out.print(a[k][colstart]+" ");
			}
			rowstart++;
			rowlength--;
			colstart++;
			collength--;
		}
		
//		for (int i = rowStart; i <= colLength; i++) {
//			System.out.print(matrix[rowStart][i] + " ");
//		}
//
//		for (int j = rowStart+1; j <= rowLength; j++) {
//			System.out.print(matrix[j][colLength] + " ");
//		}
//		
////		if(rowStart+1 >= rowLength){
//			for (int k = colLength-1; k >= colStart; k--) {
//				System.out.print(matrix[rowLength][k] + " ");
//			}
////		}
////		if(colStart+1 <= colLength){
//			for (int k = rowLength-1; k > rowStart; k--) {
//				System.out.print(matrix[k][colStart] + " ");
////			}
//		}

	}

}
