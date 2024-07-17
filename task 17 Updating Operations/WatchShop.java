class WatchShop {

static String watchNames []={null,null,null,null,null,null,null,null,null,null}
static  int index;

// Create Operation
public static boolean addWatchShop(String time ){
	System.out.println("Creating Watch list");
	boolean iswatchdetailscorrect=false;
	if(time!=null){
		watchNames[index]=time;
		index++;
		iswatchdetailscorrect = true;	
	}else{
		System.out.println("Please Provide Details");
	}
	return 	iswatchdetailscorrect;		
}

// Reading Operation

 public static void (){
	 System.out.println("The Time names are ");
	 for (String watchName:watchNames){
	 System.out.println(watchName); 
	 } 
 }

// UpDate Operation
public static boolean upDate (String oldList,String newlist ){
	boolean iswatchdetailUpdated=false;
	for (int index = 0 ;index < watchNames.length;index++)
		if (oldList == watchNames[index]){
			watchNames[index]= newlist;
			iswatchdetailUpdated = true;	
		}	
	if ()iswatchdetailUpdated ==false){
		
		System.out.println(oldList+ "NOt Found" );	
	}
	return iswatchdetailUpdated;
	}

}