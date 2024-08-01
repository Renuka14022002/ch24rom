class ParcelRunner{
public static void main(String[] args){

System.out.println("start parcelRunner in main");

Parcel.sendGift("Renu","2000","08/07/24",false);
Parcel.sendGift("Vidya","1000","09/07/24",true);
Parcel.sendGift("jujju","5000","10/07/24",true);
Parcel.sendGift("Aishu","1500","11/07/24",true);
Parcel.sendGift("Appu","1500","12/07/24",true);
Parcel.sendGift("Ammu","2000","13/07/24",false);
Parcel.sendGift("Tom","3000","14/07/24",true);
Parcel.sendGift("Doraemon","6500","15/07/24",true);
Parcel.sendGift("Dora","1800","16/07/24",true);
Parcel.sendGift("jerry","500","17/07/24",false);

System.out.println("end parcelRunner in main");
}
}