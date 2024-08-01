class Order{
public static void assign(String name,String price,String date,boolean urgent){

System.out.println("start assigning in order");
System.out.println("name :"+name);
System.out.println("price :"+price);
System.out.println("date :"+date);
System.out.println("urgent :"+urgent);
Myntra.deliver(name,date,urgent);
}
}