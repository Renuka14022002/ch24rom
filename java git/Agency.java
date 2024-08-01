class Agency{
public static boolean advanceBook(){
System.out.println("start advanceBook in Agency");
boolean cnfrm=Company.booked();
System.out.println("cnfrm :"+cnfrm);
return cnfrm;

}
}