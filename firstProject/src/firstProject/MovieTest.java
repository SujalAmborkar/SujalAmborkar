package firstProject;

public class MovieTest {
	public static void main(String[] args) {
		
		Movie movieObj1 = new Movie(101,"Sairat","Nagraj MAnjule",20000000,5,2014);
		Movie movieObj2 = new Movie(101,"Sairat","Nagraj MAnjule",20000000,5,2014);
		Movie movieObj3= new Movie(101,"Sairat","Nagraj MAnjule",20000000,5,2014);
		Movie movieObj4 = new Movie(101,"Sairat","Nagraj MAnjule",20000000,5,2014);
		Movie movieObj5 = new Movie(101,"Sairat","Nagraj MAnjule",20000000,5,2014);
		
		
		
		movieObj1.printMoview();
	
			
	}
	
}


class Movie
{
	private int movieNumber; //data member | field [java]
	private String movieName ;
	private String director;
	private float budget;
	private float ratings;
	private int year;
	
	

	public Movie(int movieNumber, String movieName, String director, float budget, float ratings, int year) {
		super();
		this.movieNumber = movieNumber;
		this.movieName = movieName;
		this.director = director;
		this.budget = budget;
		this.ratings = ratings;
		this.year = year;
	}



	public void printMoview()  { //accessor
		System.out.println("movie number  : "+movieNumber);
		System.out.println("movie Name    : "+movieName);
		System.out.println("Director      : "+director);
		System.out.println("Budget        : "+budget);
		System.out.println("Ratrings      : "+ratings);
		System.out.println("Year          : "+year+"\n");
	}
}


 
 