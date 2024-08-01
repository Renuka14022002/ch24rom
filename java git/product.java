class Product
{
	public static String productN(String productname)
	{
		System.out.println("start productN in product ");
		System.out.println("prdct name is"+productname);
		
		System.out.println("end productN in product ");
		return productname;
	}
	public static double productP(double productprice)
	{
		System.out.println("start price in product");
		System.out.println("prdct price is"+productprice);
		System.out.println("end price in product");
		return productprice;
		
	}
	public static int quantity(int productquantity)
	{
		System.out.println("start quantity in product");
		System.out.println("prodct quantity is:"+productquantity);
		System.out.println("end quantity in product"); 
		return productquantity;
	}
	public static String quality(String productquality)
	{
		System.out.println("start quality in product");
		System.out.println("productquality is:"+productquality);
		System.out.println("end quality in product");
		return productquality;
	}
	public static String manf(String manfdate)
	{
		System.out.println("start manf in product");
		System.out.println("manfdate :"+manfdate);
		System.out.println("end manf in product");
		return manfdate;
	}
	
	public static String brand(String brandname)
	{
		System.out.println("start brand in product");
		
		System.out.println("brandname is"+brandname);
		System.out.println("end brand in product");
		return brandname;
	}
	
}
