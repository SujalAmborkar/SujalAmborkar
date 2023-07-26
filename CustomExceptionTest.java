
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(noCar ex2) {
			System.out.println(" Issue : "+ex2);
		}
		
	
		
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

class noCar extends Exception
{
	noCar(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class NoDocumentsPresentException extends RuntimeException
{
	NoDocumentsPresentException(String msg) {
		super(msg);
	}
}
class NoSeatbeltException extends RuntimeException
{
	NoSeatbeltException(String msg) {
		super(msg);
	}
}


class Car
{
	boolean keyFound=false;
	
	Car() throws CarKeyNotFoundException, noCar
	{
		double value = Math.random()%10;
		
		if(value>=0.80) {
			keyFound=true;
		}
		
		if(keyFound==false){
			throw new noCar("You dont have a car");
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			if(1>0.7) {
				NoSeatbeltException ex2 = new NoSeatbeltException("You dont have a seatbelt on....");
				throw ex2;
			}
			if(value>0.8) {
				NoDocumentsPresentException ex3 = new NoDocumentsPresentException("You dont have a seatbelt on....");
				throw ex3;
			}
}
}
}