class Car{

public static void main(String[] args){
	
	
	String car1 = "benz";
	String car2 = "audi";
	String car3 = "glanza";
	String car4 = "baleno";
	String car5 = "kia";
	String car6 = "Ferris Bueller Ferrari";
	String car7 = "tata harrier";
	String car8 = "Toyota Fortuner";
	String car9 = "thar";
	String car10 = "scorpio";
	String car11 = "volkswagen";
	String car12 = "ford";
	String car13 = "toyota";
	String car14 = "honda";
	String car15 = "mitsubishi";
	
	String[] cars = {car10,car9,car8,car7,car6,car5,car4,car3,car2,car1};
	
	for(int start=0;start<cars.length;start++)
	{
		String ref = cars[start];
		System.out.println("the car name is :"+ref);
	}
	
}
}