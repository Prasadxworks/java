class FoodPanda{
	
public static double foodOrder(String foodItem){

System.out.println("the food list");

if(foodItem == "White Bread"){
       return 70.00;
} if(foodItem == "hot dog bun"){
       return 60.00;
} if(foodItem == "Choconuts"){
       return 100.00;
} if(foodItem == "Peanut Butter"){
       return 85.00;  
} if(foodItem == "oats "){
       return 200.00;
} if(foodItem == "Honey"){
       return 79.00;
} if(foodItem== "Ginger Paste"){
       return 50.00;
} if(foodItem == "Pointer Ground"){
       return 105.00;
} if(foodItem == "Soya Chunks"){
       return 58.00;
} if(foodItem == "Cauliflower fry"){
       return 35.00;
} if(foodItem == "Radish"){
       return 20.00;
} if(foodItem == "Gobi Manchurian"){
       return 80.43;
} if(foodItem == "Puliyogre"){
       return 70.90;
} if(foodItem == "Cold drinks"){
       return 85.00;
} if(foodItem == "Water Melon"){
       return 50.00;
}else{
System.out.println("the food not found");
return 0.00;
}

}

}