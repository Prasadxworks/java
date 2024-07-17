class Dmart{


static String vegetables [] = { " Broccoli "," Spinach "," Bell peppers  "," Carrots  "," Zucchini ",
};

static String clothes [] = {	" T-shirts ",	" Pants ",	" Shirts ",	" Shorts ",	" Sweatshirts ",	
};

static String dryfruits[] = {" Raisins ",	" Hazelnuts ",	" Pistachios ",	" Chia seeds ",	" Betel nuts ",	
};

static String grocery [] = {" Oil "," Dal's "," Sauces "," Spices & herbs"," Refrigerated items ",
};

static String dairyitems[]={"Milk",	"Curd",	"Paneer",	"Butter Milk  ",	"Butter  ",	
};

static String beautyitems[]={" Lip bam  ",	" powders ",	" Face Cream ",	" Body Wash ",	" Sun Screen ",	
};

static String homeappliances[]={" Couch ",	" Pillow ",	" Pillow Covers",	" Bed Sheets ",	" Cups ",	
};

static String crockerys[]={" Tiffin Box ",	" Soup Box "," Pan  "," Cooker "," Mop Stick ",
};

static String stationery[]={" Pens ",	" staplers ",	" paperclips ",	" adhesives ",	" sticky notes ",	
};

static String homegymequipments[]={" Barbell. ",	" Weight Plates ",	" Dumbbells ",	" Kettlebells ",	" Resistance Bands ",	
};

static String shoes[]={" Sports Shoes",	" Casual Shoes  ",	" kids Shoes ",	" Men Shoes ",	" Women Shoes ",	
};

static String summerdresses [] = {" Casual Shirt  ",	" T-shirts  ",	" Shorts  ",	" Round Neck Shirt  ",	" Half Sleeve Shirts ",	
};
static String winterclothes []={" Jacket "," Sweater "," Hoodie "," Earmuffs	 "," Scarf ",	
};
static String kidstoys []={" Bus ",	" Gun "," Car "," Kitchen Top ",	
	
};
static String bags []={" Kid's Bag "," Laptop Bag ",	" Collage Bag ",	" Gym Bag ",	};

public static void main ( String []  newcollections){
	
System.out.println(" Vegetables Available Are ");
for(int index = 0 ; index < vegetables.length-1; index++ ){
	System.out.println( vegetables [index]);
}

 System.out.println(" Clothes Are Available ");
 for ( int index = 0; index < clothes.length-1 ; index++ ){
	 System.out.println( clothes [index]);
 }


 System.out.println( "Dry Fruits Are Available");
 for (int index = 0; index < dryfruits.length-1; index++){
	 System.out.println(dryfruits[index]);
	
 }

 System.out.println(" Grocery Are Available ");
 for (int index =0; index < grocery.length-1;index++ ){
	 System.out.println( grocery [index]);
 }
 System.out.println("Dairy Items Are Available ");
 for (int index = 0 ; index< dairyitems.length-1;index++){
	 System.out.println( dairyitems [index]);
 }
 System.out.println("Beauty Items Are Available ");
for (int index=0;index< beautyitems.length-1;index++ ){
	System.out.println( beautyitems [index]);	
}
 System.out.println("Home Appliances Are Available ");
 for(int index=0;index< homeappliances.length-1;index++ ){
	 System.out.println(homeappliances[index]);
 }
 System.out.println(" Crockerys Items Available ");
for(int index=0; index < crockerys.length-1;index++){
	System.out.println( crockerys[index]);
}

 System.out.println("Stationery Are Available");
for(int index=0;index < stationery.length-1;index++){
	System.out.println(stationery[index]);
}

 System.out.println(" Home Gym Equipments ");
 for(int index=0;index< homegymequipments.length-1;index++){
	 System.out.println(homegymequipments[index]);
 }


 System.out.println(" Shoes For All");
for(int index=0;index<shoes.length-1;index++){
	System.out.println(shoes[index]);
}

 System.out.println(" Summer Dress ");
 for(int index= 0;index<summerdresses.length-1;index++){
	 System.out.println(summerdresses[index]);
 }


 System.out.println(" Winter Dress");
 for(int index=0;index<winterclothes.length-1;index++){
	 System.out.println(winterclothes[index]);
 }


 System.out.println(" Kids Toys");
 for(int index=0;index<kidstoys.length-1;index++){
	 System.out.println(kidstoys[index]);
 }


 System.out.println(" Bags Are Available");
for(int index=0;index < bags.length-1;index++){
System.out.println(bags[index]);
 }
}
}