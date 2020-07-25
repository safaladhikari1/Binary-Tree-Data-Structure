public interface SongList
{
   public void add(Song data);
   public void add(int index, Song data);
   public void remove(int index);
   public int size();
   public Song get(int index);
   public int indexOf(Song data);
   public String toString();
   public int totalDuration();
}