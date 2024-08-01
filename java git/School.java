class School
{
	public static void voting(int age)
	{
		System.out.println("start voting in School");
		System.out.println("age: "+age);
		if(age>=18){
			System.out.println("eligible for voting");
		}
		else{
			System.out.println("Not eligible for voting");
		}
		System.out.println("end voting in School");
	}
	public static void marriage(String name,int age)
	{
		System.out.println("start marriage in School");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		if(age>=21&&age<=35)
		{
			System.out.println("valid age for marriage");
		}
		else{
			
			System.out.println("Invalid age for marriage");
		}
		System.out.println("end marriage in School");
		
	}
	public static void policeService(double height,double weight,int age)
	{
		System.out.println("start policeService in School");
		System.out.println("height: "+height);
		System.out.println("weightt: "+weight);
		System.out.println("age: "+age);
		if(height>=157&&weight>=45&&age>=18){
			System.out.println("eligible for police Service");
		}
		else{
			System.out.println("Noteligible for police Service");
		}
		
		System.out.println("end policeService in School");
	}
	public static void product(double price,int quantity,int pincode)
	{
		System.out.println("start product in School");
		System.out.println("price:"+price);
		System.out.println("quantity:"+quantity);
		System.out.println("pincode:"+pincode);
		if(price>=10&&price<=500&&quantity>=1&&quantity<50&&pincode>=560040&&pincode<560042){
			System.out.println("valid");
			
		}else{
			System.out.println("invalid");
		}
		
		System.out.println("end product in School");
	}
	//public ststic void verification(long adharno){
		//System.out.println("start verif in School");
		//System.out.println("adharno:"+adharno)
		//if(adharno>=90055398021&&adharno<626395321424){
			//System.out.println("valid");
			
		//}else{
	    //System.out.println("invalid");
		//}
		
		//System.out.println("end verif in School");
		
	//}
}