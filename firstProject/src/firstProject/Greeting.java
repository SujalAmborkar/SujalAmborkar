package firstProject;

public class Greeting {
	public static void main(String[] args) {
		System.out.println("hello world of java");
		
		Cricket cric = new Cricket();
		cric.printScore();
		cric.hitSixer();
		cric.hitSixer();
		cric.hitSixer();
		cric.printScore();
		cric.hitSixer();
		cric.hitSixer();
		
		cric.printScore();
		
		cric.hitFour();
		cric.printScore();
		
	}
}


class Cricket{
	
	int score;
	
	public void hitSixer() {
		System.out.println("sixer is hit ");
		score = score+6;
	}
	public void hitFour() {
		System.out.println("four is hit ");
		score = score+4;
	}
	
	void printScore() {
		System.out.println("score : "+score);
	}
}