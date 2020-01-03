package movies;
import java.util.ArrayList;
import movies.Movie;

//FilmArchive defines two methods, getSorted and add

public interface FilmArchive {
	
	public ArrayList<Movie> getSorted(); 
	
	public boolean add(Movie film);

}
