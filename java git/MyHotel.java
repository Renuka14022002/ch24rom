class MyHotel {

String name="clif";
Owner owner= new Owner("Ammu",28,'F');

MyHotel()
{
System.out.println("created Myhotel using no-arg const");
}

public void details()
{
System.out.println("name :"+this.name);
System.out.println("Owner :"+this.owner);

this.owner.details();
}

}