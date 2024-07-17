class InstagramRunner{
	
	
	
	
public static void main (String[] info){

 boolean isaccountcreated=Instagram.createaccount("Prasad","1998prasadhiremath@gmail.com",0L,"prasad123","prasad$123");
 if(isaccountcreated == true){
 Instagram.getinfo();
 }else {
	 System.out.println("Please Provide Correct Details");
 }



}


}