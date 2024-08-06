class Rocket {

String country; //con
double speed; //sh
int fuelCapacity=20000; // li
String thruster; //ref

Rocket(String country){
this.country=country;

System.out.println("Rocket class created");
}

void setspeed(double speed){
this.speed=speed;
}

public static void main(String[] args){

Rocket ref=new Rocket("India");
ref.setspeed(7.9);
System.out.println("the Rocket country is: "+ref.country);
System.out.println("the Rocket speed is: "+ref.speed);
System.out.println("the Rocket fuelCapacity is: "+ref.fuelCapacity);

ref.thruster="low";
	System.out.println("the Rocket thruster is: "+ref.thruster);

Rocket ref1=new Rocket("US");
ref1.setspeed(8.0);
System.out.println("the Rocket country is: "+ref1.country);
System.out.println("the Rocket speed is: "+ref1.speed);
System.out.println("the Rocket fuelCapacity is: "+ref1.fuelCapacity);

ref1.thruster="high";
	System.out.println("the Rocket thruster is: "+ref1.thruster);

Rocket ref2=new Rocket("India");
ref2.setspeed(7.8);
System.out.println("the Rocket country is: "+ref2.country);
System.out.println("the Rocket speed is: "+ref2.speed);
System.out.println("the Rocket fuelCapacity is: "+ref2.fuelCapacity);

ref2.thruster="low";
	System.out.println("the Rocket thruster is: "+ref2.thruster);
}

}