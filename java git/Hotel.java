class HotelRunner{
	public static void main(String[] args)
	{
		System.out.println("start main in runner");
		Hotel.first("idli");//ref to string:arguments //implicit
		String item="dose";
		Hotel.first(item);//explicit 
		Hotel.first("kulcha");
		
		
		Hotel.second("dose",25.05);
		Hotel.second("idli",30.05);
		String item1="kulcha";
		double itemprice=36.9;
		Hotel.second(item1,itemprice);
		
		Hotel.third("dose",32.7,2);
		Hotel.third("idli",39.7,3);
		String item3="kulcha";
		double price=52.9;
		int quantity=2;
		Hotel.third(item3,price,quantity);
		
		Hotel.forth("curry",250.0,1,true);
		Hotel.forth("biryani",350.0,1,false);
		String item4="egg";
		double cost=40;
		int quantity1=2;
		boolean value=true;
		Hotel.forth(item4,cost,quantity1,value);
		
		
		System.out.println("end main in runner");
		
		
		
		
	}
}