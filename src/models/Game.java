package models;

public class Game {
	private String name;
	private int releaseYear;
	private int difficulty;
	
	public Game(String name, int releaseYear, int difficulty) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.difficulty = difficulty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	@Override
	public String toString() {
		return name + " Anno di uscita: " + releaseYear + " Difficoltà: " + difficulty;
	}
}
