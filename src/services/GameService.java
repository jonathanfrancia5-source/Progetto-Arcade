package services;
import java.util.ArrayList;
import models.Game;

public class GameService {
	private ArrayList<Game> games = new ArrayList<Game>();
	
	public void insertGame(String name, int releaseYear, int difficulty) {
		Game game = new Game(name, releaseYear, difficulty);
		this.games.add(game);
	}
	
	public void printGameList() {
		for(int i=0; i<this.games.size(); i++) {
			System.out.println(this.games.get(i));
		}
	}
	
	public void searchGames(String search) {
		for (int i = 0; i <this.games.size(); i++) {
			if (this.games.get(i).getName().contains(search) ) {
				System.out.println(this.games.get(i));
			}
			
		}
	}
	
	public void printDifficultGames(int level) {
		for(int i=0; i<this.games.size(); i++) {
			if(this.games.get(i).getDifficulty()>=level) {
				System.out.println(this.games.get(i));
			}
		}
	}
	
}
