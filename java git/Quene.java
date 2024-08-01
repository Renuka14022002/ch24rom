class Quene{
	public static String accept(String name,String msg,int quantity){
		System.out.println("start accept in quene");
		System.out.println("int is"+quantity);
		boolean ref=ServiceProvider.send(name,msg);
		if(ref==true){
			return"msg is sent";
		}
		return "msg is not sent";
	}
}