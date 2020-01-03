package movies;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import movies.FilmArchive;
import movies.Movie;

//It's ok to add movies to a HashSet because Movie has 
//mutually compatiable equals() and hashCode() methods.
public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {

	//do something similar to ListFilmArchive
	public ArrayList<Movie> getSorted() {
		HashSet<Movie> hashSet = new HashSet<Movie>(this);
		ArrayList<Movie> newArrayListMovies = new ArrayList<Movie>(hashSet);
		return newArrayListMovies;
	}

	//main pasted from the instructions
	public static void main(String[] args) {
		HashFilmArchive archive = new HashFilmArchive();
		for (Movie m : Movie.getTestMovies())
			archive.add(m);
		for (Movie m : archive)
			System.out.println(m);
		System.out.println("**************");
		for (Movie m : archive.getSorted())
			System.out.println(m);
	}
}