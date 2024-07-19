class Shampoo{

 int idNo;
 String brandName ;
 String mgfDate;
 String expDate;
 int price ;


public boolean creatingList (int idNo, String brandName,String mgfDate,
String expDate,int price){
	boolean isShampooList = false;
	if(idNo > 0 && brandName!=null && mgfDate!=null && expDate!=null && price > 0 ){
		this.idNo = idNo ;
		this.brandName = brandName;
		this.mgfDate = mgfDate;
		this.expDate = expDate;
		this.price = price;
	isShampooList = true;
	}
	return isShampooList;
}
public  void cover () {
	System.out.println("The ID Number :- "+ this.idNo);
	System.out.println("The Brand Name :- "+ this.brandName);
	System.out.println("The Manufactring Date :-"+ this.mgfDate);
	System.out.println("The Exp Date :- "+ this.expDate);
	System.out.println("The Price :- "+ this.price);
	
}


}