class MessageRunner{
	public static void main(String[] args){
		System.out.println("start main in message runner");
		String ref = Spoorthi.sendMsg("Ambani","Do well",3);
		System.out.println("ref is :"+ref);
	}
}