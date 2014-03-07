
public abstract class mamel extends Animal {
	
private int nursingTime;

public mamel (String latinName, int nursingTime) {
	
super (latinName);
this.nursingTime = nursingTime;
}

public int getnursingTime() {
	return nursingTime;
	
}

public void setnursingTime ( int nursingTime) {
	this.nursingTime = nursingTime;
 }

}

