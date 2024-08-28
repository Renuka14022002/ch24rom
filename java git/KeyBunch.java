class KeyBunch {
String material;
Key1 key;


KeyBunch(String material,Key1 key){
	this.material=material;
	this.key=key;
}
public void details(){
	
	System.out.println("material :"+this.material);
	System.out.println("brand :"+this.key.brand);
	System.out.println("weight :"+this.key.weight);
	
	
}
}