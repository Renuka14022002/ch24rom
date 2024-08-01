class Hospital
{
	public static String name(String hospitalName)
	{
		System.out.println("start name in hospital");
		System.out.println("hospitalname is"+hospitalName);
		System.out.println("start name in hospital");
		return hospitalName;
		
	}
	public static String specialisation(String splname)
	{
		System.out.println("start specialisation in hospital");
		System.out.println("splname:"+splname);
		System.out.println("start specialisation in hospital");
		return splname;
	}
	public static String area(String areaName)
	{
		System.out.println("start area inn hospital");
		System.out.println("areaname is :"+areaName);
		System.out.println("end area inn hospital");
		return areaName;
	}
	public static int time(int timeprint)
	{
		System.out.println("start time inn hospital");
		if(timeprint<=8){
			System.out.println("close");
		}else{
			System.out.println("open");
		}
		System.out.println("end time inn hospital");
		return timeprint;
	}
	public static int general(int generalConsultant)
	{
		System.out.println("start general in hospital");
		System.out.println("general consultancy is:"+generalConsultant);
		System.out.println("end general in hospital");
		return generalConsultant;
	}
}
