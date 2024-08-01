class HotellRunner{
	public static void main(String[] args)
	{
		System.out.println("start in hotelrunner");
		
		double ref=Hotel1.price("idli");
		System.out.println(ref);
		double ref1=Hotel1.price("vada");
		System.out.println(ref1);
		double ref2=Hotel1.price("poori");
		System.out.println(ref2);
		
		String ref3=Hotel1.fact(2);
		System.out.println(ref3);
		String ref4=Hotel1.fact(15);
		System.out.println(ref4);
		String ref5=Hotel1.fact(1);
		System.out.println(ref5);
		System.out.println("end in hotelrunner");
	}
}