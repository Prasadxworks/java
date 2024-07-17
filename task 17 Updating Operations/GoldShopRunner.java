class GoldShopRunner{

public static void main(String []goldi){

boolean add = GoldShop.addGoldItem("Gold ring");
System.out.println("The Gold Items  "+ add);
add = GoldShop.addGoldItem("Gold Earings");
System.out.println("The Gold Items"+ add);
add = GoldShop.addGoldItem("Gold PENDANT");
System.out.println("The Gold Items"+add);
add = GoldShop.addGoldItem("Gold BANGLE");
System.out.println("The Gold Items "+add);
add = GoldShop.addGoldItem("Gold KADA");
System.out.println("The Gold Items "+ add);
add = GoldShop.addGoldItem("Gold Coin");
System.out.println("The Gold Items "+ add);
add = GoldShop.addGoldItem("Gold Nose Ring");
System.out.println("The Gold Items "+ add);

boolean update = GoldShop.update("Gold Nose Ring "," Gold Neckles ");
System.out.println("The Gold Items"+ update);
GoldShop.getGoldShopName();

}


}