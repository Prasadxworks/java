class  Girias {
static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null}; 	
static int index;
public static boolean createhomeAppliance(String appliances){
System.out.println("Create Home Appliance");
boolean isHomeApplianceAvialible = false;
    if(appliances!= null){
	homeAppliances[index]=appliances;
	index++;
	isHomeApplianceAvialible=true;
	}else{
	System.out.println("Unavialible Home Appliance");	
}
return isHomeApplianceAvialible;
}
public static void getHomeAppliances(){
	System.out.println("The Home Appliance Available");
	for (String appliances:homeAppliances){
		System.out.println(appliances);
	}	
}
public static boolean  update(String oldAppliances,String newAppliance){
		boolean isHomeApplianceupdated = false;	
	for ( int index= 0; index < homeAppliances.length; index++){
	    if( oldAppliances == homeAppliances[index]){
		  homeAppliances[index] =	newAppliance;
		  isHomeApplianceupdated= true;
		}
		
	}
	if(isHomeApplianceupdated == false){
		System.out.println(oldAppliances +" is Not Found");
	}
	return isHomeApplianceupdated;
	
	
	
}



}


	
	
	
	

