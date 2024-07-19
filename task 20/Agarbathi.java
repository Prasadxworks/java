class Agarbathi {


String brandName;
int price;
String noOfSticks;
String fragnance;

public boolean createlist(String brandName,
int price,String noOfSticks,String fragnance){
	
	boolean isListCreated = false;
	if(brandName !=null && price > 0 && noOfSticks !=null && fragnance!=null){
		this.brandName=brandName;
		this.price=price;
		this.noOfSticks=noOfSticks;
		this.fragnance=fragnance;
	isListCreated = true;
	}
return isListCreated;	
}

public void diffrent(){
	System.out.println("The Brand Name is:-"+this.brandName);
	System.out.println("The Price is:-"+this.price);
	System.out.println("The Number Of Sticks Are:-"+this.noOfSticks);
	System.out.println("The Fragnance:-"+this.fragnance);
	
}






















}