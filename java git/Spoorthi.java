class Spoorthi{
	public static String sendMsg(String name,String msg,int quantity){
		System.out.println("start sendmsg in spoorthi");
		String ref = Quene.accept(name,msg,quantity);
		return ref;
		
	}
}