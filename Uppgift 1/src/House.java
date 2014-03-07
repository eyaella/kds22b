//Klassvariabel
public class House {
	//instansvariabel
	private int year;
	private int size;
	private static int nbrOfHouses;
	public static final int MIN_SIZE = 10;

	//Konstruktor
	public House(int _year, int _size) {
		year = _year;
		if (_size > 10) {
			size = _size; // diverse kod
		} else {
			size = MIN_SIZE;
		}
		//instansmetoder
		nbrOfHouses = nbrOfHouses + 1;
	}
//Klassmetod
	public static int getNbrHouses() {
		return nbrOfHouses;
	}

	public int getYear() {
		return year;
		// diverse kod
	}

	public int getSize() {
		return size;
		// diverse kod
	}
}
