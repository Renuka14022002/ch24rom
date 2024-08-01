class Song{


public static void main(String[] args){

String song1 = "Baby";
String song2 = "Love Yourself";
String song3 = "Yummy";
String song4 = "Stay";
String song5 = "Company";
String song6 = "Hold On";
String song7 = "I'm The One";
String song8 = "Bad Guy";
String song9 = "Favorite";
String song10 = "What do you mean?";

String[] songs = {song10,song9,song8,song7,song6,song5,song4,song3,song2,song1};

for(int name=0;name<songs.length;name++)
{
String ref = songs[name];
System.out.println("The songs name are :"+ref);
}
}
}