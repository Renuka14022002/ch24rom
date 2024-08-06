class Candle {

 double lenght;
String fragrance;
double cost;

Candle(double lenght,double cost,String fragrance){
	
	this.lenght=lenght;
	this.cost=cost;
	this.fragrance=fragrance;
	
	System.out.println("Candle class created");

}
Candle(double lenght,String fragrance){
	this.lenght=lenght;
	this.fragrance=fragrance;
}
Candle(double lenght,double cost){
	this.lenght=lenght;
	this.cost=cost;
}
Candle(double cost){
	this.cost=cost;
}
Candle(String fragrance){
	this.fragrance=fragrance;
}
Candle(){
	
}
}