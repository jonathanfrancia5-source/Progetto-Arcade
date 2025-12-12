package services;
import java.util.ArrayList;
import models.Game;

public class GameServices {
	private ArrayList<Game> games = new ArrayList<Game>();
	
	public void insertGame(String n, int ry, int d) {
		Game game = new Game(n, ry, d);
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
			else {
				System.out.println("Nessun gioco corrisponde al seguente nome");
			}
		}
	}
	
	public void printDifficultGames() {
		for(int i=0; i<this.games.size(); i++) {
			if(this.games.get(i).getDifficulty()>=4) {
				System.out.println(this.games.get(i));
			}
		}
	}
	
}
