package pac;

public class App  implements Y1{
	public static void main(String[] args) {
	System.out.println(Y1.boy_filePath);
	System.out.println(Y1.girl_filePath);
	for (int row = 0; row < array2d.length; row++) {
		for (int column = 0; column < array2d[0].length; column++) {
			System.out.print(Y1.array2d[row][column]+"");
		}
	}
	System.out.println();
}
}
