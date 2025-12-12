import java.util.Scanner;
import services.GameService;

public class ArcadeRetroApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;
		
		GameService gameService = new GameService();

		while (isRunning) {
			System.out.println("ARCADE RETRO");
			System.out.println("1) Aggiungi gioco arcade");
			System.out.println("2) Visualizza lista giochi");
			System.out.println("3) Cerca gioco");
			System.out.println("4) Livello giochi");
			System.out.println("5) Esci");
			System.out.println("Seleziona: ");
			
			String choose = scanner.nextLine();
			
			if(choose.equals("1")) {
				System.out.println("Inserisci nome gioco: ");
				String name = scanner.nextLine();
				
				System.out.println("Inserisci data uscita gioco: ");
				int realeseYear = scanner.nextInt();
				scanner.nextLine();
				
				int difficulty;
				do {
				System.out.println("Inserisci difficoltà gioco (1-5): ");
				difficulty = scanner.nextInt();
				scanner.nextLine();
				}
				while(difficulty < 1 || difficulty > 5);
				
				gameService.insertGame(name, realeseYear, difficulty);
				
			} else if(choose.equals("2")) {
				System.out.println("La lista dei giochi è: ");
				gameService.printGameList();
				
			} else if(choose.equals("3")) {
				System.out.println("Quale gioco vuoi cercare: ");
				String name = scanner.nextLine();
				gameService.searchGame(name);
				
			} else if(choose.equals("4")) {
				int levelDifficulty;
				do {
				System.out.println("Che livello di difficoltà vuoi vedere: ");
				levelDifficulty = scanner.nextInt();
				scanner.nextLine();
				}
				while(levelDifficulty < 0 || levelDifficulty > 5);
				gameService.gameDifficulty(levelDifficulty);
				
			} else if(choose.equals("5")){
				System.out.println("Programma finito");
				isRunning = false;
			}else {
				System.out.println("Hai inserito un numero sbagliato, Errore reinserisci: ");
			}
		};
		
		scanner.close();
	}

}
