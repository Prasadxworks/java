class Gym  {

static String gymEquipments[]= {null,null,null,null,null,null,null,null};
static int index;

public static boolean createGymEquipment(String equipment){

System.out.println("Create Gym Equipment Started");

boolean isGymEquipmentavialible = false;
    if( equipment!=null){
	 gymEquipments[index]=equipment;
	  index++;
	  isGymEquipmentavialible=true;
     }else{
		 System.out.println("Unavialible Equipment");
	 }
System.out.println("Create Gym Equipment  Ended ");
return isGymEquipmentavialible;	
}
public static void getGymEquipments (){
	System.out.println(" The Gym Equipment Avialible ");
	for(String gymEquipment:gymEquipments){
		System.out.println(gymEquipment);
	}
	
}


}