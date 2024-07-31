class StraightenerRunner {
public static void main(String[] value){
System.out.println("start main in StraightenerRunner");
Straightener ref = new Straightener(3000,"pink");
	ref.cost =3000;
	ref.color ="pink";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);

	ref.cost =5500;
	ref.color ="black";
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref color :"+ref.color);
	System.out.println("ref brand :"+ref.brand);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in StraightenerRunner");

}
}