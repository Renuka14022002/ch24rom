class RadioRunner {
public static void main(String[] value){
System.out.println("start main in RadioRunner");
Radio ref = new Radio(1000,"black");
	ref.cost =1000;
	ref.color ="black";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "plastic";
	System.out.println("ref material :"+ref.material);

	ref.cost =1500;
	ref.color ="black";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in RadioRunner");

}
}