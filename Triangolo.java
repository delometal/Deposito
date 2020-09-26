package triangolo;

import java.util.*;

public class Triangolo {
	
	public static void main(String[] args){
		int[] lati = new int[3];
		Scanner reader = new Scanner(System.in);
		boolean b;
		
		for(int i = 0; i < 3; i++){
		System.out.println(i+1 + "° lato: ");
		lati[i] = reader.nextInt();
		}
		
		b = esistenza(lati[0], lati[1], lati[2]);
		
		System.out.println("esistenza del triangolo: " + b);
		
	}
	
	public static boolean esistenza(int i, int j, int k){
		if(i+j >= k && i+k >= j && j+k >= i){
			return true;
		}
		else{
			return false;
		}
	}
   
}
