package day9;

import java.io.Serializable;

public class Movie implements Serializable {
	private String title, genre;
	private int year;
	
	public Movie() {
		
	}
	
	public Movie(String title, String genre, int year) {
		this.title = title;
		this.genre = genre;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [title = " + title + ", genre = " + genre + ", year = " + year + "]";
	}
	
	
	
	
}
