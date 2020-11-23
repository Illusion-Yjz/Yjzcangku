package pac;

import java.util.Scanner;

public class App {
public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{5,6},
			{300,500},
			{999,666},
			{7,0},
			
			
	};
	while(true){
		Thread.sleep(1000);
		System.out.println("又浪费了一秒");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		
	}
	
}
}
