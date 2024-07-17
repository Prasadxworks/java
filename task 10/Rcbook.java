class Rcbook {
 static String datee;
 static String chassisnoo;
 static int bikenoo;
 static String namee;
 static String colourr;
 static  String eniginenoo;
public static boolean detailsofRccard (String date,String chassisno,int bikeno,String  name , String colour,
 String enigineno){
	 
boolean isBikeRcbook = true; 
	
	
	
// System.out.println("Date :" + date);	
// System.out.println("ChassisNo : " + chassisno);
// System.out.println("Bike No : " + bikeno );
// System.out.println("Name Of Owner : " + name );	
// System.out.println("Colour : " + colour);
// System.out.println("Enigine No " + enigineno);
	
	
	datee=date;
	chassisnoo=chassisno;
	bikenoo=bikeno;
	namee=name;
	colourr=colour;
	eniginenoo=enigineno;
	
	return isBikeRcbook;


 }
	public static void registorbikedetails(){
		
System.out.println("Date :" + datee);	
System.out.println("ChassisNo : " + chassisnoo);
System.out.println("Bike No : " + bikenoo );
System.out.println("Name Of Owner : " + namee );	
System.out.println("Colour : " + colourr);
System.out.println("Enigine No " + eniginenoo);
	}
 }


























