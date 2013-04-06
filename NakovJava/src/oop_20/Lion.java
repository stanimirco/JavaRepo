package oop_20;

public class Lion extends Cat implements Reproducible {
	private int weight;
	
	public Lion(boolean male, int weight) {
		super(male);
		this.weight = weight;
	}

	public Lion() {
		this(true, 50);
	}

	public int getWeight(){
		return this.weight;
	}
	
	public void setWeight(int weight){
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "Lion male: " + super.isMale() + ", weight: " + this.weight;
	}
	
	public void feedTheLion(){
		System.out.println("The lion feels better now.");
	}
}
