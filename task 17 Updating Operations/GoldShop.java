class GoldShop {


static String goldNames[]= {null,null,null,null,null,null,null};
static int index;

// Create Operation 
public static boolean addGoldItem(String gold){
	System.out.println("The GoldShop Names Creating");
	boolean isGoldshopdetilscorrect = false;
	if (gold !=null){
		goldNames[index]=gold;
		index++;
		isGoldshopdetilscorrect=true;
		}else{
			System.out.println("Please Provid GoldShopDeatils ");
		}	
		return 	isGoldshopdetilscorrect = true;
	}
	
	// Read Operation
	public static void getGoldShopName(){
		System.out.println("The Gold Shop Names Are");
		for (String goldName:goldNames)
			System.out.println(goldName);
	}
		
		
	// Update Operations 
	public static boolean update (String oldlist , String  newList){
	boolean isGoldItemsUpDate = false;
	for  ( int index =0 ; index < goldNames.length;index++){
		if (oldlist == goldNames [index]){
			goldNames [index] = newList;
			isGoldItemsUpDate = true;	
		}
	}
		if(isGoldItemsUpDate==false){
			System.out.println(oldlist+"NOt Found");
		}
		
		return isGoldItemsUpDate;
		}
		




}