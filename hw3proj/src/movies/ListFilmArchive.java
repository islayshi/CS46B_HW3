package movies;

import java.util.ArrayList;
import java.util.TreeSet;

import movies.FilmArchive;
import movies.Movie;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive {

	//check every movie in the array list for deep equality to the arg of add()
	public boolean add(Movie that) {
		//remember that the add() method from the ArrayList superclass is being overridden
		for (Movie temp : this) {
			if (temp.getYear() == that.getYear() && temp.getTitle().equals(that.getTitle())) {
				return false;
			}
		}
		
		boolean reallyAdded = super.add(that);
		return reallyAdded;
	}

	//implement getSorted() from FilmArchive
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> tree = new TreeSet<Movie>(this);
		ArrayList<Movie> newArrayListMovies = new ArrayList<Movie>(tree);
		return newArrayListMovies;
	}

	//pasted from the instructions
	public static void main(String[] args) {
		ListFilmArchive archive = new ListFilmArchive();
		for (Movie m : Movie.getTestMovies())
			archive.add(m);
		for (Movie m : archive)
			System.out.println(m);
		System.out.println("**************");
		for (Movie m : archive.getSorted())
			System.out.println(m);
	}

}
