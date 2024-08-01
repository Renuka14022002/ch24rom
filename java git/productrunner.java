class ProductRunner{
	public static void main(String[] args)
	{
		System.out.println("start main");
		Product.productN("buddy");
		String ref=Product.productN("buddy");
		System.out.println(ref);
		
		Product.productP(123.4);
		
		Product.quantity(2);
		
		Product.quality("good");
		
		Product.manf("14/07/2024");
		
		Product.brand("H&M");
		System.out.println("end main");
	}
}