
public class MultidimensionalArray {

	public MultidimensionalArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
int a[][]= {{1,2,3},{3,4,5},{6,7,8}};
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
int b[][]= {{1},{2,3},{3,4,5}};
for(int[] a1:b) {
	for(int c:a1) {
//		System.out.println(c);
	}
}
int c[][][]= {{{1,2,3},{3,4,5}},{{8,7,6},{9,6,4}},{{0,1,2},{8,5,4}}};
//for(int[][] resul:c) {
//	for(int resultb[] :resul) {
//		for(int result:resultb) {
////			System.out.println(result);
//		}
for(int i=0;i<c.length;i++) {
	for(int j=0;j<c.length;j++) {
		for(int k=0;k<c.length;k++) {
			System.out.print(c[i][j][k]+" ");
		}
	}
	System.out.println();
}
}
}