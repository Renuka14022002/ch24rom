class CableRunner {
public static void main(String[] value){
System.out.println("start main in CableRunner");
Cable ref = new Cable(100,"gold");
	ref.cost =100;
	ref.color ="gold";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);

	ref.cost =150;
	ref.color ="black";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "fiber";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in CableRunner");

}
}