class Snack{

public static void main(String[] args){
	
String snack1 = "Lays";
String snack2 = "ice-cream";
String snack3 = "biscuit";
String snack4 = "choclet";
String snack5 = "kurkure";
String snack6 = "lolipop";
String snack7 = "pizza";
String snack8 = "burger";
String snack9 = "sandwitch";
String snack10 = "peanut";
String snack11 = "vada pav";
String snack12 = "pakora";
String snack13 = "dhokla";
String snack14 = "samosa";
String snack15 = "chaat";
String snack16 = "poha";
String snack17 = "kachori";
String snack18 = "smoothie";
String snack19 = "edamame";
String snack20= "banana chips";
String snack21 = "cottage cheese and fruits";
String snack22 = "aloo chaat";
String snack23= "dried fruit";
String snack24= "trail mix";
String snack25= "homemade cheese crackers";

String[] snacks = {snack25,snack24,snack23,snack22,snack21,snack20,snack19,snack18,snack17,snack16,snack15,snack14,snack13,snack12,snack11,snack10};
for(int name=snacks.length-1;name>=0;name--)
{
	String ref = snacks[name];
	System.out.println("the name of the snack is :"+ref);
}

}
}