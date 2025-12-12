import java.util.Scanner;

import services.GameServices;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		
		GameServices gameService = new GameServices();
		
		while(isRunning) {
			System.out.println("GIOCHI ARCADE");
			System.out.println("1) Aggiungi gioco");
			System.out.println("2) Visualizza lista giochi");
			System.out.println("3) Cerca gioco");
			System.out.println("4) Visualizza lista giochi difficili");
			System.out.println("5) Esci");
			System.out.println("Seleziona: ");
		
			if (!scanner.hasNextInt()) {
			    System.out.println("Scelta non valida, devi inserire un numero tra 1 e 5.");
			    scanner.nextLine(); 
			    continue; 
			}

			int choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1: {
			    System.out.println("inserisci nome gioco: ");
			    String Name = scanner.nextLine();

			    System.out.println("inserisci anno uscita gioco: ");
			    int ReleaseYear;
			    while (true) {
			        if (!scanner.hasNextInt()) {
			            System.out.println("Errore: devi inserire un numero valido per l'anno!");
			            scanner.nextLine();
			            continue;
			        }
			        ReleaseYear = scanner.nextInt();
			        scanner.nextLine();
			        break;
			    }

			    int Difficulty;
			    while (true) {
			        System.out.println("inserisci difficoltà (1-5): ");
			        
			        if (!scanner.hasNextInt()) {
			            System.out.println("Errore: devi inserire un numero!");
			            scanner.nextLine();
			            continue;
			        }

			        Difficulty = scanner.nextInt();
			        scanner.nextLine(); 

			        if (Difficulty < 1 || Difficulty > 5) {
			            System.out.println("Errore: la difficoltà deve essere tra 1 e 5.");
			            continue;
			        }

			        break; 
			    }

			    gameService.insertGame(Name, ReleaseYear, Difficulty);
			    break;
			}

			case 2: {
				gameService.printGameList();
				break;
			}
			case 3: {
				System.out.println("Quale Gioco vuoi cercare? ");
				String name = scanner.nextLine();
				gameService.searchGames(name);
				break;
			}
			case 4: {
				gameService.printDifficultGames();
				break;
			}
			case 5:{
				isRunning = false;
			}
			default:
				System.out.println("Scelta sbagliata, inserire valore valido");
			}
			
		}
		System.out.println("Programma terminato");
		System.exit(0);
		
		scanner.close();
	}

}
