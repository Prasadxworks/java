class Aadhaar{

static String yourname;
static String yourdateofbirth;
static String yourfathername;
static String yourmothername;
static long yourcell;
static String youraddress;
static long youraadhaarcardno;

public static boolean aadhaarcard(String name, String dob, String fathername,String mothername,long cellno,
	String address,long aadhaarcardno){
	
	boolean aadhaarcardiscreated= false;
	
	yourname = name;
	yourdateofbirth = dob;
	yourfathername = fathername;
	yourmothername = mothername;
	yourcell= cellno;
	youraddress = address;
	youraadhaarcardno= aadhaarcardno;
	
	return aadhaarcardiscreated;
	
}
public static void aadhaarcardiscreated(){

System.out.println("Your Name : "+ yourname);
System.out.println("Your Date of birth : "+yourdateofbirth);
System.out.println("Your Father Name : " + yourfathername );
System.out.println("Your Mother Name : " + yourmothername );
System.out.println("Your Cell no : " + yourcell );
System.out.println("Your Address : " + youraddress );
System.out.println("Your Aadhaar Card Number : "+ youraadhaarcardno);
	
}	
}
