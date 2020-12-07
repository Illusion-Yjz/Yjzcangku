
public class Find {
 void findZero( int array2d[][]){
	 for (int row = 0; row < array2d.length; row++) {
			for (int coulnm = 0; coulnm < array2d[0].length; coulnm++) {
				if (array2d[row][coulnm]==0) {
					System.out.print("R_zero("+coulnm+","+row+")\r");
					System.out.print("R_left("+(coulnm-1)+","+row+")\r");
					System.out.print("R_right("+(coulnm+1)+","+row+")\r");
					System.out.print("R_up("+coulnm+","+(row+1)+")\r");
					System.out.print("R_down("+coulnm+","+(row-1)+")\r");
				
			}
	 }
	 }		
	 }
}
 

