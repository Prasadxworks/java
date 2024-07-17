import java.util.*;

class RedChilliesEntertainment{
	static String movieActors[] = {null,null,null,null,null,null,null,null,null};
	static int index ;
	// Create Operation
	public static boolean addMovieActors(String actorNames){
	System.out.println("The Actors Name is Creating");
	boolean isActorsNameCreated = false;
	if (actorNames != null ){
		movieActors[index]=actorNames;
		index++;
		isActorsNameCreated = true;
	}else{
		System.out.println("Please Provide Actors Names");	
	}
	return isActorsNameCreated;
	}
	
	// UpDate Operation
	public static boolean update(String oldList ,String newList){
		boolean isActorsNameUpdated = false;
		for( int index = 0;  index < movieActors.length; index++ ){
			if( oldList == movieActors [index]){
				movieActors[index]= newList;
				isActorsNameUpdated= true;	
			}
		}
		if (isActorsNameUpdated ==false){
			System.out.println(oldList +"Not Found");
		}
		return isActorsNameUpdated;
		}
	
	public static boolean deleteRedchilliactors(String actorNamestoDeleted){
		System.out.println(" delete Actor name ");
		boolean isActorNameDeleted = true;
		int newindex, oldindex;
		for (newindex = 0, oldindex = 0; oldindex < movieActors.length ; oldindex ++){
			if (movieActors[oldindex]!=actorNamestoDeleted)
			{
			movieActors[newindex]=movieActors[oldindex];	
				newindex++;
				
			}
			}
			movieActors=Arrays.copyOf(movieActors,newindex);
		if(movieActors!=null){
			
			
		
			isActorNameDeleted=true;
		}else{
				System.out.println(actorNamestoDeleted+"not Found");
			 isActorNameDeleted=false;
		}
		return isActorNameDeleted;
	
	
	
	
	
	// Read Operation 
	public static void getMovieActors(){
		System.out.println("The RedChilliesEntertainment Actors Are ");
	    for (String movieActor : movieActors){
		 System.out.println(movieActor);
	
	    }
	}
	
	}
	
	
	
	
	
	
