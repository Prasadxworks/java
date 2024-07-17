class Netflix {
	
static String top10movies []    = { "The Godfather (1972) ","The Shawshank Redemption (1994)","Schindler's List (1993) ","The Dark Knight (2008)","Pulp Fiction (1994)","The Lord of the Rings: The Return of the King (2003) ","Fight Club (1999)","Forrest Gump (1994) ","Star Wars: Episode IV - A New Hope (1977)","Inception (2010)"};
static String englishmovies []	= { "The Shawshank Redemption (1994)"," The Godfather (1972) "," The Dark Knight (2008) "," Pulp Fiction (1994) ","	Schindler's List (1993) "," Forrest Gump (1994) ","	Fight Club (1999) "," Inception (2010) "," Goodfellas (1990) "," The Matrix (1999) "," Star Wars (2000) "," The Silence of the Lambs (1991) "," The Lord of the Rings (2001) "," The Shawshank Redemption (1994) "," The Godfather (1972) "," The Dark Knight (2008) "," Pulp Fiction (1994) "," Schindler's List (1993) "," Forrest Gump (1994) "," Fight Club (1999) "," Inception (2010) "," Goodfellas (1990) "," The Matrix (1999) "," Star WarsA New Hope (1977) "," The Silence of the Lambs (1991)"};
static String hindimovies [] = {"Sholay (1975)","Dilwale Dulhania Le Jayenge (1995)"," Lagaan (2001)"," 3 Idiots (2009) ","Andaz Apna Apna (1994) "," Gangs of Wasseypur (2012) "," Mughal-e-Azam (1960) "," Queen (2013) "," Dil Chahta Hai (2001) "," Zindagi Na Milegi Dobara (2011) "," Pyaasa (1957) "," Black (2005) "," PK (2014) "," Kabhi Khushi Kabhie Gham (2001) "," Swades (2004) "," Devdas (2002) "," Taare Zameen Par (2007) "," Chak De! India (2007) "," Om Shanti Om (2007) "," Shahid (2012) "," Barfi! (2012) "," Drishyam (2015) "," Gully Boy (2019) "," Uri: The Surgical Strike (2019) "," Dangal (2016)"};
static String koreanSeries [] = {" Crash Landing on You (2019-2020) "," Descendants of the Sun (2016) "," Goblin (2016-2017) "," Itaewon Class (2020) "," Reply 1988 (2015-2016) "," Hotel del Luna (2019) "," Vincenzo (2021) "," My Love from the Star (2013-2014) "," Kingdom (2019-2021) - A historical zombie thriller "," What's Wrong with Secretary Kim (2018) "," Strong Woman Do Bong Soon (2017) ","Signal (2016)"," Moon Embracing the Sun (2012) "," Mr. Sunshine (2018) "," The Heirs (2013) "," W - Two Worlds (2016) "," The King: Eternal Monarch (2020) "," Hospital Playlist (2020-present) "," My Mister (2018) "," Scarlet Heart: Ryeo (2016)"};
static String kannadamovies []	= {"Mungaru Male (2006)","Rangitaranga (2015)","Ulidavaru Kandanthe (2014)","Lucia (2013)","Dweepa (2002)","Thithi (2015)","Kirik Party (2016)","Chowka (2017)","Mata (2021)","KGF: Chapter 1 (2018)","Shhh! (1993)","Gaalipata (2008)","Ganeshana Maduve (1990)","Aa Dinagalu (2007)","Mysore Mallige (1992)","Chomana Dudi (1975)","Ganeshana Galate (1995)","Upendra (1999)","Bettada Hoovu (1985)","Bangarada Manushya (1972)","Mathadana (2001)","Accident (1985)","Nagarahavu (1972)","America America (1995)","Kaviratna Kalidasa (1983)"};


public static void main ( String movies []){

System.out.println( "Top 10 movies Are");
for(int index = 0;index<top10movies.length-1;index++){
	System.out.println(top10movies[index]);
}
System.out.println ("  English Movies Are" );
for(int index=0;index<englishmovies.length-1;index++){
	System.out.println(englishmovies[index]);
}

System.out.println(" Kannada Movies Are " );
for(int index=0;index<kannadamovies.length-1;index++){
	System.out.println(kannadamovies[index]);
}

System.out.println(" The Hindi Movies Are");
for(int index=0;index<hindimovies.length-1;index++){
	System.out.println(hindimovies[index]);
}

System.out.println( "The Koreans Series Are");
for(int index =0;index<koreanSeries.length-1;index++){
	System.out.println(koreanSeries[index]);
}
}


}


