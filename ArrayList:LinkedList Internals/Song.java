public class Song
{
   //private fields
   private String name;
   private String artist;
   private int duration;
   
   //constructor  
   public Song()
   {
      this("N/A", "N/A", 0);
   }
   
   public Song(String name, String artist, int duration)
   {
      setSong(name, artist, duration);
   }  
     
   //methods
   public void setSong(String name, String artist, int duration)
   {
      //checks if someone gives us empty string for name or artist or negative duration
      if(name.length() <= 0 || artist.length() <= 0 || duration < 0)
      {
         throw new IllegalArgumentException();
      }
      
      this.name = name;
      this.artist = artist;
      this.duration = duration;
   }
   
   public String getName()
   {
      return this.name;
   }
   
   public String getArtist()
   {
      return this.artist;
   }
   
   public int getDuration()
   {
      return this.duration;
   }
   
   @Override
   public String toString()
   {
      return "(" + this.name + ", " + this.artist + ", " + this.duration + ")";
   }
   
   @Override
   public boolean equals(Object obj)
   {
      if(obj instanceof Song)
      {
         //check the type of obj to make sure it is a Song
         //create a temporary Song variable
         
         Song other = (Song)obj;
         
         if(this.getName().equals(other.getName()) 
            && this.getArtist().equals(other.getArtist())
            && this.getDuration() == other.getDuration())
         {
            return true;
         }            
      }
      
      return false;   
   }     
}