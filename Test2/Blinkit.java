class Blinkit {

static String blinkitNames []={null,null,null,null,null,null,null,null,null,null}
static  int index;

// Create Operation
public static boolean addBlikntit(String blink ){
	System.out.println("Creating Blinkit list");
	boolean isblinkitdetailscorrect=false;
	if(blink!=null){
		blinkitNames[index]=blink;
		index++;
		isblinkitdetailscorrect = true;
	}else{
		System.out.println("Please Provide Details");
	}
	return 	isblinkitdetailscorrect;
}

// Reading Operation

 public static void (){
	 System.out.println("The Blinkit names are ");
	 for (String blinkitName:blinkitNames){
	 System.out.println(blinkitName);
	 }
 }

// UpDate Operation
public static boolean upDate (String oldList,String newlist ){
	boolean isblinkitdetailUpdated=false;
	for (int index = 0 ;index < blinkitNames.length;index++)
		if (oldList == blinkitNames[index]){
			blinkitNames[index]= newlist;
			isblinkitdetailUpdated = true;
		}
	if ()isblinkitdetailUpdated ==false){

		System.out.println(oldList+ "NOt Found" );
	}
	return isblinkitdetailUpdated;
	}

}