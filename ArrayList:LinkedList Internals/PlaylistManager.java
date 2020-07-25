/*
   @author Safal Adhikari
   @class IT 220
   @date 05/20/2020
   @Midterm Review Assignment: This is a PlayListManager Class that 
   has main method to test out my SongList implementations.
*/

public class PlaylistManager
{
   public static void main(String[] args)
   {
      SongList chillPlayList = new ArraySongList();
      SongList countryPlayList = new LinkedSongList();
      
      playChillStuff(chillPlayList);
      playCountryStuff(countryPlayList);               
   }
   
   public static void playChillStuff(SongList list)
   {
      System.out.println("---Chill Play List---");
      Song mySong1 = new Song("Lose Yourself", "Eminem", 180);
      Song mySong2 = new Song("Hips Don't Lie", "Shakira", 230);
      Song mySong3 = new Song("Fix You", "ColdPlay", 210);
      Song mySong4 = new Song("With or Without You", "U2", 190);
      
      list.add(mySong1);
      list.add(1, mySong2);
      list.add(mySong3);
      list.add(3, mySong4);
      
      System.out.println(list);
      System.out.println("The index of Song: Fix You by ColdPlay is " + list.indexOf(mySong3));
      
      int totalDuration = list.totalDuration();
      int hours = totalDuration/3600;
      int minutes = (totalDuration%3600)/60;
      int seconds = (totalDuration%3600)%60;
         
      System.out.println("The total duration of the playlist is " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");   
      System.out.println();
   }
   
   public static void playCountryStuff(SongList list)
   {
      System.out.println("---Country Play List---");
      Song mySong1 = new Song("In Case You Didn't Know", "Brett Young", 210);
      Song mySong2 = new Song("Beautiful Crazy", "Luke Combs", 220);
      Song mySong3 = new Song("Blue Ain't Your Color", "Keith Urban", 242);
      Song mySong4 = new Song("H.O.L.Y.", "Florida Georgia Line", 200);
      
      list.add(mySong1);
      list.add(1, mySong2);
      list.add(mySong3);
      list.add(3, mySong4);
      
      System.out.println(list);
      System.out.println("The index of Song: Beautiful Crazy by Luke Combs is " + list.indexOf(mySong2));
      
      int totalDuration = list.totalDuration();
      int hours = totalDuration/3600;
      int minutes = (totalDuration%3600)/60;
      int seconds = (totalDuration%3600)%60;
      
      System.out.println("The total duration of the playlist is " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds.");   
   }
}