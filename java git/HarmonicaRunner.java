class HarmonicaRunner {
public static void main(String[] value){
System.out.println("start main in HarmonicaRunner");
Harmonica ref = new Harmonica(1000,"silver");
	ref.cost =1000;
	ref.color ="silver";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);

	ref.cost =500;
	ref.color ="black";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "plastic";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in HarmonicaRunner");

}
}