package day11;

class Car
{
	private String name;
	private int mileage;
	private int cost;
	
	public Car()//zero parameterized constructors
	{
		name = "BMW";
		mileage = 70;
		cost = 7777777;
	}
	public Car(String name, int mileage, int cost) { // Parameterized constructors
		
		this(name);
	}
	public Car(String name)
	{
		this();
		this.name = name;
	}
   
	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
	}
}

public class ExampleForLocalChaining1{

	public static void main(String[] args) {
		Car c2 = new Car("Swift",30,400000);
		System.out.println(c2.getName());
		System.out.println(c2.getMileage());
		System.out.println(c2.getCost());
		
		}

}
