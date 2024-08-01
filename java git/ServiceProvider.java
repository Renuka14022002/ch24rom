class ServiceProvider{
	public static boolean send(String name,String msg){
		System.out.println("start send in service proviser");
		boolean ref = MessageProvider.send(name,msg);
		return ref;
	}
}