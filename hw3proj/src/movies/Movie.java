package movies;

public class Movie implements Comparable<Movie> {
	private String title = "";
	private int year = 0;

	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}

	// A method that satisfies the Comparable<Movie> interface
	public int compareTo(Movie that) {
		//int value determines if titles and year are the same
		
		//first test the years, then compare the years
		int titleInt = this.title.compareTo(that.title);

		if (titleInt != 0) {
			return titleInt;
		} 
		else if (titleInt == 0 && this.year == that.year) {
			return titleInt;
		}


		else if (this.year < that.year) {
			return -1;

		}		
		else {
			return 1;
		}
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	//has to satisfy the Comparable<Movie> interface
	public boolean equals(Object ob) {
		if (ob instanceof Movie) {
			Movie that = (Movie) ob;
			return this.compareTo(that) == 0;
		} else
			return false;
	}

	// should look something like:
	// Movie The Maltese Falcon (1941)
	public String toString() {
		return "Movie " + title + " (" + year + ")";
	}

	public static Movie[] getTestMovies() {
		Movie[] allMovies = new Movie[10];
		allMovies[0] = new Movie("True Grit", 1969);
		allMovies[1] = new Movie("True Grit", 2010);
		allMovies[2] = new Movie("Black Panther", 2018);
		allMovies[3] = new Movie("Avengers: Infinity War", 2018);
		allMovies[4] = new Movie("Frozen", 2013);
		allMovies[5] = new Movie("Frozen", 2013);
		allMovies[6] = new Movie("Gone with the Wind", 1939);
		allMovies[7] = new Movie("Black Panther", 2018);
		allMovies[8] = new Movie("Shrek 2", 2004);
		allMovies[9] = new Movie("Finding Nemo", 2003);
		return allMovies;

	}

	public int hashCode() {
		return title.hashCode() + year;
	}

}
