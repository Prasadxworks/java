class GiriasRunner {
	

public static void main(String [] home){
	
boolean house = Girias.createhomeAppliance("Washing Machine");
System.out.println("The Home Appliances"+ house);
house = Girias.createhomeAppliance("Vaccum Cleaner");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("Dinning Table");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("Fridge");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("TV");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance(" ");
System.out.println("The Home  Appliances"+ house);
house = Girias.createhomeAppliance("Sofa");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("chair");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("Bed");
System.out.println("The Home Appliances"+house);
house= Girias.createhomeAppliance("Plates");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("Lamps");
System.out.println("The Home Appliances"+house);
house = Girias.createhomeAppliance("BedSheets");
System.out.println("The Home Appliances"+house);



boolean raw = Girias.update("Speakers","Fan");
System.out.println("The Home Appliances"+raw);
Girias.getHomeAppliances();
}


}