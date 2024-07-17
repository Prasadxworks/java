class Bikelicence{
	
 static String 	yourname;
static long	yourcellno;
 static String	yourdlno;
 static String	yourdob;
 static boolean	yourvalidtill;
 static String	yourbloodgroup;
	
	
public static boolean drivinglicence(String name,long cellno, String dlno, String dob, boolean validtill,
String  bloodgroup ){
boolean isdrivinglicence=true;  

// System.out.println("The Owner Name : " + name);
// System.out.println("The owner cell NO : " + cellno );
// System.out.println("Driving licence NO :"+ dlno);
// System.out.println("Date Of Birth :" + dob );
// System.out.println("Valid Till :" + validtill );
// System.out.println("Blood Group :" + bloodgroup );
 
 
 if( yourbloodgroup && name !=null &&  cellno >0)
	yourname=name;
	yourcellno=cellno;
	yourdlno=dlno;
	yourvalidtill=validtill;
	yourbloodgroup=bloodgroup;




return isdrivinglicence;

}
public static void detailsOfLicence(){
	
 System.out.println("The Owner Name : " + yourname);
 System.out.println("The owner cell NO : " + yourcellno );
 System.out.println("Driving licence NO :"+ yourdlno);
 System.out.println("Date Of Birth :" + yourdob );
 System.out.println("Valid Till :" + yourvalidtill );
 System.out.println("Blood Group :" + yourbloodgroup );
	
	
}




}