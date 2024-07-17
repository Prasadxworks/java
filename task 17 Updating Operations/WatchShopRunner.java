class WatchShopRunner {

public static void main (String time []){

boolean kala = WatchShop.addWatchShop("FastTrack");
System.out.println(" The Time Showing  "+ kala);
kala = WatchShop.addWatchShop("Rolex");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("G-Shock");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("Casio");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop(" TIMEWEAR ");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("ZEBSTER");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("Matrix");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("REDUX");
System.out.println("The Time Showing "+ kala);
Kala = WatchShop.addWatchShop("LOUIS DEVIN");
System.out.println("The Time Showing "+ kala);
kala = WatchShop.addWatchShop("Noise");
System.out.println("The Time Showing "+ kala);


boolean seetime = WatchShop.upDate("REDUX","boAt");
System.out.println("The Time Showing"+seetime);
WatchShop.getAllWatchBrands();
}
}