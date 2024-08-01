class Hotell{
	public static double price(String item)
	{
		System.out.println("start in hotel");
		if(item =="idli")
		{
			return 20;
		}
		if(item =="vada")
		{
			return 10;
		}
		System.out.println("end in hotel");
		return 0;
	}
	public static String fact(int quantity)
	{
		System.out.println("start fact in hotel");
		if(quantity>1&&quantity<10)
		{
			return "yes";
		}
			return"no";
	}
}