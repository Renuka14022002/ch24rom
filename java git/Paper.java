class Paper {
 double thickness; //ref
 String quality; //con
 String color="white"; //li
 char size; //sh
 
 Paper(String quality){
	this.quality=quality;
	 
	 System.out.println("class created");
 }
 
 void setsize(char size){
	 this.size=size;
 }

public static void main(String[] args){
	Paper ref=new Paper("high");
	ref.setsize('L');
	System.out.println("the Paper color is: "+ref.color);
	System.out.println("the Paper quality is: "+ref.quality);
	System.out.println("the Paper size is: "+ref.size);
	
	ref.thickness=0.8;
	System.out.println("the Paper thickness is: "+ref.thickness);
	
	Paper ref1=new Paper("low");
	ref1.setsize('l');
	System.out.println("the Paper color is: "+ref1.color);
	System.out.println("the Paper quality is: "+ref1.quality);
	System.out.println("the Paper size is: "+ref1.size);
	
	ref1.thickness=0.09;
	System.out.println("the Paper thickness is: "+ref1.thickness);
	
	Paper ref2=new Paper("medium");
	ref2.setsize('s');
	System.out.println("the Paper color is: "+ref2.color);
	System.out.println("the Paper quality is: "+ref2.quality);
	System.out.println("the Paper size is: "+ref2.size);
	
	ref2.thickness=0.7;
	System.out.println("the Paper thickness is: "+ref2.thickness);
	
}

}