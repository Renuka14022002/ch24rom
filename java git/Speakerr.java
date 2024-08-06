class Speakerr {

String brand="Sony"; //liter
char size; // ref
double cost; //con
String output; //shetter

Speakerr(double cost){
this.cost = cost;

System.out.println("class speaker created");
}
void setoutput(String output){
	this.output=output;
}
public static void main(String[] value){
	
	Speakerr ref=new Speakerr(5000);
	ref.setoutput("loud");
	System.out.println("the brand is :"+ref.brand);
	System.out.println("the cost is :"+ref.cost);
	System.out.println("the output is :"+ref.output);
	ref.size='s';
	System.out.println("the size is :"+ref.size);
	
	Speakerr ref1=new Speakerr(15000);
	ref1.setoutput("medium");
	System.out.println("the brand is :"+ref1.brand);
	System.out.println("the cost is :"+ref1.cost);
	System.out.println("the output is :"+ref1.output);
	ref1.size='l';
	System.out.println("the size is :"+ref1.size);
	
	Speakerr ref2=new Speakerr(50000);
	ref2.setoutput("loud");
	System.out.println("the brand is :"+ref2.brand);
	System.out.println("the cost is :"+ref2.cost);
	System.out.println("the output is :"+ref2.output);
	ref2.size='L';
	System.out.println("the size is :"+ref2.size);
	
}
}