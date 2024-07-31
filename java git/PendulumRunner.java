class PendulumRunner {
public static void main(String[] value){
System.out.println("start main in PendulumRunner");
Pendulum ref = new Pendulum(500,4.8);
	ref.cost =500;
	ref.weight =4.8;
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref weight :"+ref.weight);
	System.out.println("ref type :"+ref.type);
	
	ref.material = "steel";
	System.out.println("ref material :"+ref.material);

	ref.cost =800;
	ref.weight =7;
	System.out.println("ref cost :"+ref.cost);
	System.out.println("ref weight :"+ref.weight);
	System.out.println("ref type :"+ref.type);
	
	ref.material = "metal";
	System.out.println("ref material :"+ref.material);
	
	System.out.println("end main in PendulumRunner");

}
}