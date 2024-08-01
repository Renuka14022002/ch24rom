class CableRunner {
public static void main(String[] value){
System.out.println("start main in CableRunner");
Cable ref = new Cable(100,"gold");
	
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);

Cable ref1 = new Cable(150,"black");
	System.out.println("ref cost :"+ref1.cost);
	System.out.println("ref color :"+ref1.color);
	System.out.println("ref brand :"+ref1.brand);
	
	ref.material = "fiber";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in CableRunner");

}
}