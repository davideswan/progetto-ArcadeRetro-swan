package services;

import java.util.ArrayList;
import models.Game;

public class GameService {
	private ArrayList<Game> games = new ArrayList<Game>();
	
	Game game;
	
	public void insertGame(String n, int r, int d)
	{
		game = new Game(n, r, d);
		this.games.add(game);
		System.out.println();
	}
	
	public void printGameList() {
		for(int i = 0; i < games.size(); i++){
			System.out.println("Il " + (i+1) + " gioco è: " + games.get(i));
		}
		System.out.println();
	}
	
	public void searchGame(String name) {
		boolean exist = false;
		for(int i = 0; i < games.size(); i++) {
			if(games.get(i).getName().contains(name)) {
				System.out.println("Il gioco che hai cercato: " + games.get(i));
				exist = true;
			}
		}
		if(exist != true) {
			System.out.println("Il gioco non esiste");
		}
		System.out.println();
	}
	
	public void gameDifficulty(int levelDifficulty) {
		System.out.println("Giochi con difficoltà maggiore uguale a 4");
		for(int i = 0; i < games.size(); i++) {
			if(games.get(i).getDifficulty() >= levelDifficulty) {
				System.out.println((i+1) + " " +  games.get(i));
			}
		}
		System.out.println();
	}
}
