class SaloonRunner{
	public static void main(String[] args)
	{
		System.out.println("start in saloonRunner");
		double ref=Saloon.price("haircut");
		System.out.println(ref);
		
		double ref1=Saloon.price("spa");
		System.out.println(ref1);
		
		double ref2=Saloon.price("facial");
		System.out.println(ref2);
		
		double ref3=Saloon.price("pedicure");
		System.out.println(ref3);
		
		double ref4=Saloon.price("headmassage");
		System.out.println(ref4);
		
		double ref5=Saloon.price("haircolor");
		System.out.println(ref5);
		
		double ref6=Saloon.price("trimming");
		System.out.println(ref6);
		
		double ref7=Saloon.price("Nothing");
		System.out.println(ref7);
		System.out.println("end in saloonRunner");
	}
}