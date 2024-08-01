class ShoeFactory{
	public static double order(String brand)
	{
		System.out.println("start price in ShoeFactory");
		System.out.println("brand is"+brand);
		if(brand=="puma"){
			return 1500;
		}
		if(brand=="nike"){
			return 2000;
		}
		return 0;
	}
}