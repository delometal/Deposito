/* ho pensato così: 
 * assegno i = 1. Se (numInput / i) é numero intero  allora (i) ed il quoziente sono divisori del 
 * numero input. Li salvo in un array, incremento il numero (i) e assegno a DivLim il valore del 
 * quoziente. Ripeto la procedura finchè (i < DivLim).*/


import java.util.*;

public class Divisori {
	
	public static void main(String[] args){
		int i = 1;   
		int j = 2;  // conta il numero di divisori
		int DivLim, input;
		ArrayList<Integer> divisori = new ArrayList<Integer>(); // creo un ArrayList di interi perché voglio i divisori ordinati
		
		System.out.println("Inserisci il numero: ");
		Scanner reader = new Scanner(System.in);
		input = reader.nextInt();
		DivLim = input;
		
		while(i < DivLim){
			if(input % i == 0){
				DivLim = input / i;
				divisori.add(divisori.size() / 2, i);
				divisori.add((divisori.size() / 2) + 1, DivLim);
				j = j + 2;
				i++;
			}
			else {
				i++;
			}
		}
		
		for(i = 0; i < divisori.size(); i++){
		      System.out.print(divisori.get(i) + " ");
		}
		System.out.println("    Numero di divisori: " + j);
		
		
	}

}
