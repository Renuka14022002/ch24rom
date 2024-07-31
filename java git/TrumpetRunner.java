class TrumpetRunner {
public static void main(String[] value){
System.out.println("start main in TrumpetRunner");
Trumpet ref = new Trumpet(4000,"silver");
	ref.cost =4000;
	ref.color ="silver";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);

	ref.cost =5500;
	ref.color ="gold";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in TrumpetRunner");

}
}