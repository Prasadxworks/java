class GymRunner{

public static void main (String [] workout){
boolean work = Gym.createGymEquipment("Dumbells");
System.out.println("The Equipment Added to list "+work);
work = Gym.createGymEquipment("Barbell");
System.out.println("The Equipment Added to list"+work);
work = Gym.createGymEquipment("Weights");
System.out.println("The Equipment Added to list"+work);
work = Gym.createGymEquipment("Bands");
System.out.println("The Equipment Added to List"+work);
work = Gym.createGymEquipment("SplitMachine");
System.out.println("The Equipment Added to List"+ work);
work = Gym.createGymEquipment("LegPress"+work);
System.out.println("The Equipment Added to list"+work);
work =Gym.createGymEquipment("BenchPressMachine"); 
System.out.println("The Equipment Added to list"+ work);
work = Gym.createGymEquipment("Boxing Bag");
System.out.println("The Equipment Added to list"+ work);

Gym.getGymEquipments();

}



}