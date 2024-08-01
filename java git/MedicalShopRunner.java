class MedicalShopRunner{
public static void main(String[] args)
{
	System.out.println("start main in medicalshop runner");
	MedicalShop.one("Dolo");
	MedicalShop.one("Gudcef");
	String name="pantodac";
	MedicalShop.one(name);
	
	MedicalShop.two("aspirin",2);
	String name1="anacin";
	int value=4;
	MedicalShop.two(name1,value);
	MedicalShop.two("paracetamol",3);
	
	MedicalShop.three("Renu","9603366397");
	MedicalShop.three("Vidya","9640161190");
	String name2="Viji";
	String mobno="9328901491";
	MedicalShop.three(name2,mobno);
	
	
	MedicalShop.four("sihi","shi123@gmail.com","4533890488","6thcross jayanagar");
	MedicalShop.four("rukmini","ruk456@gmail.com","2678368373","6,7th cross binipet");
	String name3="sahkshi";
	String email="akty675@gmail.com";
	String mob="8722940191";
	String address="2,8th cross jd lane chickpet";
	MedicalShop.four(name3,email,mob,address);
	
	System.out.println("end n in medicalshop runner");
	
	
}
}