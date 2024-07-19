class ShampooRunner{

public static void main(String []fome){

Shampoo ref = new Shampoo ();
boolean clean = ref.creatingList(20,"Mysore Sandle","20/05/2024","20/12/2024",50);
System.out.println("The Shampoo List Creating :-"+ref);
ref.cover();

Shampoo ref1 = new Shampoo ();
clean = ref1.creatingList(55,"Dove","02/12/2024","06/05/2025",30);
System.out.println("The Shampoo List Creating :-"+clean);
ref.cover();

Shampoo ref2 = new Shampoo ();
clean = ref2.creatingList(66,"head and shoulders","03/05/2024","03/06/2025",35);
System.out.println("The Shampoo List Creating :-"+clean);
ref.cover();

Shampoo ref3 = new Shampoo ();
clean = ref3.creatingList(99,"himalayan","02/04/2023","06/07/2024",60);
System.out.println("The Shampoo List Creating :-"+clean );
ref.cover();


Shampoo ref4 = new Shampoo();
clean = ref4.creatingList(77,"Herbel","08/09/2024","09/10/2025",90);
System.out.println("The Shampoo List Creating :-"+clean);
ref.cover();


}




}