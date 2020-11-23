package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
	while(true){
		Scanner c=new Scanner(System.in);
		String b=c.next();
		int x=(int)(Math.random()*100);
		int y=(int)(Math.random()*100);
		if(b.equals("a")){
			System.out.println("R"+"("+((int)x)+","+((int)y)+")");
		}
	}
	
}
}
