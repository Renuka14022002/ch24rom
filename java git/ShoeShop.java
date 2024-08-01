class ShoeShop{
	public static double purchase(String brand){
		System.out.println("start purchase in shoeshop");
		double ref=ShoeFactory.order(brand);
		return ref;
	}
}