class Saloon{
	public static double price (String service)
	{
		System.out.println("start in saloon");
		if(service=="haircut")
		{
			return 500;
		}
		if(service=="spa")
		{
			return 1500;
		}
		if(service=="facial")
		{
			return 400;
		}
		if(service=="pedicure")
		{
			return 800;
		}
		if(service=="headmassage")
		{
			return 200;
		}
		if(service=="haircolor")
		{
			return 1000;	
		}
		if(service=="trimming")
		{
			return 200;
		}
		System.out.println("start in saloon");
		return -1;
	}
	
	
	
}