import java.util.Scanner;

import services.GameService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isRunning = true;
		
		GameService gameService = new GameService();
		
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
					String name = scanner.nextLine();
	
					System.out.println("inserisci anno uscita gioco: ");
					int releaseYear;
					while (true) {
						if (!scanner.hasNextInt()) {
							System.out.println("Errore: devi inserire un numero valido per l'anno!");
							scanner.nextLine();
							continue;
						}
						releaseYear = scanner.nextInt();
						scanner.nextLine();
						break;
					}
	
					int difficulty;
					while (true) {
						System.out.println("inserisci difficoltà (1-5): ");
	
						if (!scanner.hasNextInt()) {
							System.out.println("Errore: devi inserire un numero!");
							scanner.nextLine();
							continue;
						}
	
						difficulty = scanner.nextInt();
						scanner.nextLine(); 
	
						if (difficulty < 1 || difficulty > 5) {
							System.out.println("Errore: la difficoltà deve essere tra 1 e 5.");
							continue;
						}
	
						break; 
					}
	
					gameService.insertGame(name, releaseYear, difficulty);
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
					System.out.println("Da quale livello di difficoltà vuoi vedere i giochi?");
					int level = scanner.nextInt();
					scanner.nextLine();
					gameService.printDifficultGames(level);
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
