package esercizio1;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("inserisci un Numero");
		int n = input.nextInt();
		System.out.println("inserisci le parole da stampare");
		

		
		Set<String> paroleInStampa = new HashSet<>();
		Set<String> paroleDoppie = new HashSet<>();
		
		for(int i = 0; i<= n; i++) {
			
			String word = input.nextLine();
			if(!paroleInStampa.add(word)) {
				paroleDoppie.add(word);
			}
		
		}
		
		System.out.println("Parole Stampate" + paroleInStampa);
		System.out.println( "Parole Stampate e doppiate" + paroleDoppie);
	}

}
