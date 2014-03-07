public class hund extends mamel {

	private boolean stupid;

	public hund(String latinName, int nursingTime, boolean stupid) {

		super(latinName, nursingTime);
		this.stupid = stupid;
	}
	
	public boolean stupid() {
		return stupid;
		
	}
	
	public void setStupid(boolean stupid) {
		this.stupid = stupid;
	}

	
	@Override
	public String getInfo() {
		String s;
		if (stupid){
			s ="" ;
		}else{
			s = " not ";
		}
		return " The dog \" " + super.getLatinName() +"\" nurses for "
				+super.getnursingTime() + "months and is " + s + "stupid." ;
	}
	
}
