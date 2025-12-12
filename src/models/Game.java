package models;

public class Game {
		private String Name;
		private int ReleaseYear;
		private int Difficulty;
		public Game(String name, int releaseYear, int difficulty) {
			super();
			Name = name;
			ReleaseYear = releaseYear;
			Difficulty = difficulty;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getReleaseYear() {
			return ReleaseYear;
		}
		public void setReleaseYear(int releaseYear) {
			ReleaseYear = releaseYear;
		}
		public int getDifficulty() {
			return Difficulty;
		}
		public void setDifficulty(int difficulty) {
			Difficulty = difficulty;
		}
		@Override
		public String toString() {
			return "Game [Name=" + Name + ", ReleaseYear=" + ReleaseYear + ", Difficulty=" + Difficulty + "]";
		}
			
}
