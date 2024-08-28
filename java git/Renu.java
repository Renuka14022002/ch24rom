class Renu {

String email;
Clip clip;

Renu(String email,Clip clip){
	
	this.email=email;
	this.clip=clip;	
}
public void details(){
	
	System.out.println("email :"+this.email);
	System.out.println("color :"+this.clip.color);
	System.out.println("clip :"+this.clip.type);
	
}
}