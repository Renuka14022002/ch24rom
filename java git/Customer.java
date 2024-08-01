class Customer{
public static boolean travel(){

System.out.println("start travel in customer");
boolean cnfrm=Agency.advanceBook();
System.out.println("cnfrm :"+cnfrm);
return cnfrm;

}
}