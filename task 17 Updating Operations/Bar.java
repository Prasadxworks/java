class Bar  {

 static String wineNames []={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
 static int index ;
 
 public static boolean addWineBrands(String nasha){
	 boolean iswinebrandcreated=false;
	 if(nasha!=null ){
		wineName [index]= nasha;
		index++;
		iswinebrandcreated = true;
	 }else{
		 System.out.println("Please provide Details"); 
	 }return 
		iswinebrandcreated=true; 
 }


public static boolean deleteBar(String BarNameDelete){
	System.out.println("The Bar Name is Deleted");
	boolean isbarNameDeleted=true;
	int newindex,oldindex;
	for (newindex=0,oldindex=0;oldindex<wineNames.length;oldindex++){
		if(wineNames [oldindex]!=BarNameDelete){
			wineNames[newindex]=wineNames[oldindex];
			newindex++;
		}	
		}
		wineNames=Array.copyOf(wineNames,newindex);
		if(wineNames!=null){
			isbarNameDeleted= true;
		
			
		}
		
		
}






// Read Opration 


public static void getAllBrands(){
	System.out.println("The Brands Names Are");
	for (String  brandName:brandNames);
	System.out.println(brandName);
}















}
