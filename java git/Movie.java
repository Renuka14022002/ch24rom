class Movie{
	
	public static void main(String[] args){
		
		String name1 = "Majestic";
		String name2 = "Mr.Airavata";
		String name3 = "Chakravarthy";
		String name4 = "Kaatera";
		String name5 = "Kranti";
		String name6 = "Robert";
		String name7 = "Jaggu Dada";
		String name8 = "Chingari";
		String name9 = "chowka";
		String name10 = "Kranthiveera Sangoli Rayanna";
		String name11 = "Tarak";
		String name12 = "Saarathi";
		String name13 = "Navagraha";
		String name14 = "Arjun";
		String name15 = "Odeya";
		String name16 = "Devil The Hero";
		String name17 = "Kurukshetra";
		String name18 = "Kalasipalya";
		String name19 = "Kariya";
		String name20= "Yajamana";
		
	String[] names = {name1,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15,name16,name17,name18,name19,name20};
	
	for(int store=names.length-1;store>=0;store--)
		
	{
	String ref = names[store];
    System.out.println("The movie names are :"+ref);	
	}		
		
	}
}