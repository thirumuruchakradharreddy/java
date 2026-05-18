package jaggedArray;

public class AddingColumnsToArray {

	public static void main(String[] args) {
		int newarr[][]= new int [5][];
		
		for(int i =0; i<newarr.length; i++) {
			newarr[i]= new int[i+ 1];
		}
		
		for(int i =0; i<newarr.length; i++) {
			
			for(int j=0; j<newarr[i].length; j++) {
				
				newarr[i][j]= j ;
				
			}
		}
		for(int i =0; i<newarr.length; i++) {
//			System.out.print("i="+i+" ");
			for(int j=0; j<newarr[i].length; j++) {
//				System.out.print("j="+j+" ");
				System.out.print(newarr[i][j]+" ");
			
			}
			System.out.println();
		}
	}

}
