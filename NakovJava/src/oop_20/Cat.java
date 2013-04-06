package oop_20;

public class Cat {
	private boolean male;
	
	protected Cat(boolean male){
		this.male = male;
	}
	
	protected Cat(){
		this(true);
	}
	
	public boolean isMale(){
		return this.male;
	}
	
	public void setMale(boolean male){
		this.male = male;
	}

}
