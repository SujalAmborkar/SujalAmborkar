
public class InstrumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Flute flute = new Flute();
//		flute.use();
//		flute.play();
//		flute.blowAir();
//		flute.moveFingers();
//	}

}


interface Instrument {
		void use();
}
abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}
abstract class SurgicalInstrument extends MedicalInstrument
{
	abstract void sterile();
}



abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}


abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
	

class Flute extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Flute...");
	}
	void play() {
		System.out.println("Playing Flute...");

	}
	void blowAir() {
		System.out.println("Blowing air in Flute...");

	}
	void movingFingers() {
		System.out.println("Moving Fingers in Flute...");

	}
}

class Harmonium extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Harmonium...");
	}
	void play() {
		System.out.println("Playing Harmonium...");

	}
	void blowAir() {
		System.out.println("Blowing air in Harmonium...");

	}
	void moveHand() {
		System.out.println("Moving Hand in Harmonium...");

	}
}

class SurgicalCutter extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using Surgical Cutter");
	}
	void operate() {
		System.out.println("Operating Surgical Cutter");
	}
	void sterlize() {
		System.out.println("Surgical cutter is sterlizing...");
	}
	void cuts() {
		System.out.println("Surgical cutter is cutting...");
	}
}


class SurgicalNeedle extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using Surgical Needle");
	}
	void operate() {
		System.out.println("Operating Surgical Needle");
	}
	void sterlize() {
		System.out.println("Surgical Needle is sterlizing...");
	}
	void inserts() {
		System.out.println("Surgical Needle is inserting..");
	}
}


class Glucometer extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using Glucometer");
	}
	void operate() {
		System.out.println("Operating Glucometer");
	}
	void reader() {
		System.out.println("Glucometer is reading...");
	}
	void measuresugar() {
		System.out.println("Glucometer is measuring Sugar level..");
	}
}

class ECGMachine extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using ECGMachine");
	}
	void operate() {
		System.out.println("Operating ECGMachine");
	}
	void reader() {
		System.out.println("ECGMachine is reading...");
	}
	void showHeartActivity() {
		System.out.println("ECGMachine is showing heart activity..");
	}
}
