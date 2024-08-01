class ShoeRunner{
	public static void main(String[] args){
		System.out.println("start main in shoe runner");
		double price =ShoeShop.purchase("puma");
		System.out.println("price is"+price);
		double pric =ShoeShop.purchase("nike");
		System.out.println("price is"+pric);
		double pricee =ShoeShop.purchase("sparx");
		System.out.println("price is"+pricee);
	}
}