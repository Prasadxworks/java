class Ipl {

static String  iplteamnames [] = { "Royal Challengers Bangalore"," Chennai Super Kings "," Delhi Capitals  "," Gujarat Titans "," Kolkata Knight Riders "," Lucknow Super Giants "," Mumbai Indians "," Punjab Kings "," Rajasthan Royals "," Sunrisers Hyderabad ",};

static String top10batsmen [] ={" Virat Kohli "," Faf du Plessis "," Rajat Patidar "," Saurav Chauhan "," Cameron Green "," Glenn Maxwell "," Mohammed Siraj "," Dinesh Karthik "," Lockie Ferguson "," Vijaykumar " };
static String top10bowlers [] ={ " Kuldeep Yadav "," Yuzvendra Chahal "," Harbhajan Singh "," Ravi Bishnoi "," Bhuvneshwar Kumar "," Axar Patel "," Ashish Nehra "," James Anderson "," Washington Sundar "," Daniel Vettori " };
static String top10iccteamnames [] ={ " England "," India "," New Zealand "," Australia "," South Africa "," West Indies "," Sri Lanka "," Bangladesh "," Afghanistan "," Pakistan ", };


public static void main ( String iplindia []){

System.out.println(" IPL Teams Are");
for(int index = 0; index < iplteamnames.length-1;index++ ){
	System.out.println(iplteamnames[index]);
}

System.out.println(" Top 10 Batsmen");
	for(int index=0;index < top10batsmen.length-1;index++ ){
		System.out.println(top10batsmen[index]);
	}
	

System.out.println(" Top 10 bowlers");
for(int index =0;index<top10bowlers.length-1;index++){
	System.out.println(top10bowlers[index]);
}

System.out.println(" Top ICC Teams");

for(int index=0;index < top10iccteamnames.length-1;index++){

System.out.println(top10iccteamnames[index]);

}	
}
}