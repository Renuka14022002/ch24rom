class BusNo{

public static void main(String[] args){

String no1 = "KA14 EZ9999";
String no2 = "KA14 RE9663";
String no3 = "KA14 F799";
String no4 = "KA14 R123";
String no5 = "KA14 RE9845";

String[] nos = {no5,no4,no3,no2,no1};

for(int name=nos.length-1;name>=0;name--)
{
	String ref = nos[name];
	System.out.println("The bus no is given as :"+ref);
}

}
}