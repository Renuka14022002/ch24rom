class Parcel{
public static void sendGift(String name,String price,String date,boolean urgent){

System.out.println("start sending gift in parcel");
System.out.println("name :"+name);
System.out.println("price :"+price);
System.out.println("date :"+date);
System.out.println("urgent :"+urgent);
Order.assign(name,price,date,urgent);

}
}