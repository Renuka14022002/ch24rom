class Aadhar{

public static void main(String[] args){


String madan = "2713 6867 3834";
String rahulVerma ="3842 4568 9009";
String pavan = "1908 2981 1009";
String mohan = "2167 0000 8435";
String charan = "3784 0921 1587";


String[] aadhars = {madan,rahulVerma,pavan,mohan,charan};
int length = aadhars.length;
System.out.println("No of aadhars used :"+length); 

String name = aadhars[0];
System.out.println("Removed aadhar number :"+name);


}
}