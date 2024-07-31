class MainRunner {
public static void main(String[] value){
System.out.println("start main in MainRunner");
Watch ref = new Watch(10000,"rose gold");
	ref.cost =10000;
	ref.color ="rose gold";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);

	ref.cost =15000;
	ref.color ="gold";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in MainRunner");

}
}