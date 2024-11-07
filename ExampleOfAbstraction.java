package com.day14;

abstract class Plane{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane
{
	void takeoff()
	{
		System.out.println("Cargoplane is taking off from a long sized runway");
	}
	void fly()
	{
		System.out.println("Cargoplane is flying at low heights");
	}
	void land()
	{
		System.out.println("CargoPlane is landing");
	}
}
class PassengerPlane extends Plane
{
	void takeoff()
	{
		System.out.println("PassengerPlane is taking off");
	}
	void fly()
	{
		System.out.println("PassengerPlane is flying at medium heights");
	}
	void land()
	{
		System.out.println("PassengerPlane is landing");
	}
}
class Airport
{
	void permit(Plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class ExampleOfAbstraction {

	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		
		Airport a = new Airport();
		a.permit(pp);
		a.permit(cp);
	}

}
