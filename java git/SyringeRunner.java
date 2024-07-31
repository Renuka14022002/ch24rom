class SyringeRunner {
public static void main(String[] value){
System.out.println("start main in SyringeRunner");
Syringe ref = new Syringe(100,0.8);
	ref.cost =100;
	ref.weight =0.8;
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref weight :"+ref.weight);
	System.out.println("ref type :"+ref.type);
	
	ref.material = "plastic";
	System.out.println("ref material :"+ref.material);

	ref.cost =150;
	ref.weight =0.2;
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref weight :"+ref.weight);
	System.out.println("ref type :"+ref.type);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in SyringeRunner");

}
}