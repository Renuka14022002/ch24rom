class Chocolate {
 String brand; //ref
 double price; //con
 String flavour="darkChocolate"; //li
 String size; //sh
 
 Chocolate(double price){
	this.price=price;
	 
	 System.out.println("class created");
 }
 
 void setsize(String size){
	 this.size=size;
 }

public static void main(String[] args){
	Chocolate ref=new Chocolate(100);
	ref.setsize("long");
	System.out.println("the Chocolate flavour is: "+ref.flavour);
	System.out.println("the Chocolate price is: "+ref.price);
	System.out.println("the Chocolate size is: "+ref.size);
	
	ref.brand="dairyMilk";
	System.out.println("the Chocolate brand is: "+ref.brand);
	
	Chocolate ref1=new Chocolate(145);
	ref1.setsize("large");
	System.out.println("the Chocolate flavour is: "+ref1.flavour);
	System.out.println("the Chocolate price is: "+ref1.price);
	System.out.println("the Chocolate size is: "+ref1.size);
	
	ref1.brand="rum&raisins";
	System.out.println("the Chocolate brand is: "+ref1.brand);
	
	Chocolate ref2=new Chocolate(150);
	ref2.setsize("large");
	System.out.println("the Chocolate flavour is: "+ref2.flavour);
	System.out.println("the Chocolate price is: "+ref2.price);
	System.out.println("the Chocolate size is: "+ref2.size);
	
	ref2.brand="bournville";
	System.out.println("the Chocolate brand is: "+ref2.brand);
	
}

}