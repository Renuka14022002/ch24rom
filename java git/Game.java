class Game{

public static void main (String[] args){
	
	
String game1 = "Cricket";
String game2 = "Hockey";
String game3 = "Foot Ball";
String game4 = "Volley Ball";
String game5 = "Throw Ball";
String game6 = "PUBG";
String game7 = "Free Fire";
String game8 = "Chess";
String game9 = "Basket Ball";
String game10 ="Running";

String[] games = {game10,game9,game8,game7,game6,game5,game4,game3,game2,game1};

for(int first=0;first<games.length;first++)
{
	String ref = games[first];
	System.out.println("the game name is :"+ref);
}
}
}