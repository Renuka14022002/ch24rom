class VehicleRegistration{

public static void main(String[] args){

String koramangala = "KA01 MH0005";
String rajajinagar = "KA02 D8005";
String Indiranagar = "KA03 KD6106";
String yeshwanthpur = "KA04 K4943";
String jayanagar= "KA05 BH5432";
String tumkur = "KA06 M0001";
String kolar = "KA07 AS5412";
String kolarGoldFields = "KA08 FH5000";
String Mysore= "KA09 TS3942";
String chamrajnagar = "KA10 MH0001";

String[] registrations = {koramangala,rajajinagar,Indiranagar,yeshwanthpur,jayanagar};

int range = registrations.length;
System.out.println("Number of vehicles applied for registration :"+range);

String removed = registrations[4];
System.out.println("Vehicle not elegible for registration :"+removed);
}
}