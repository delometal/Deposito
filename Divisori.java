
import java.util.*;

public class Divisori {
	
	public static void main(String[] args){
		int i = 1;   
		int j = 2;  // conta il numero di divisori........... SERVE?
		int DivLim, input;
		ArrayList<Integer> divisori = new ArrayList<Integer>(); // creo un ArrayList di interi perché voglio i divisori ordinati
		
		System.out.println("Inserisci il numero: ");
		Scanner reader = new Scanner(System.in);
		input = reader.nextInt();
		DivLim = input; // un po' inutile?
		
		while(i < DivLim){  //non funziona per 0 e per 1
			if(input % i == 0){
				DivLim = input / i;
				divisori.add(divisori.size() / 2, i);                     //super difficile e non mi sembra funzionare, meglio divisori.add(input);
				divisori.add((divisori.size() / 2) + 1, DivLim);
				j = j + 2;
				i++;
			}
			else {
				i++;
			}
		}
		
		
		/** più easy
		for(i=1; i<=input; i++) {
			if(input % i == 0){
				divisori.add(i);
			}
		}
		**/
		
		for(i = 0; i < divisori.size(); i++){
		      System.out.print(divisori.get(i) + " ");
		}
		System.out.println("    Numero di divisori: " + j);  //inutile, se facciamo add di input, basta stampare divisori.size()
		
		
	}

}
