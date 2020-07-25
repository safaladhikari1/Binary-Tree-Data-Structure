public class ArraySongList implements SongList
{
   //constants
   public static final int DEFAULT_CAPACITY = 100;
   
   //fields
   private Song[] elementData;
   private int size;
   
   //constructor
   public ArraySongList()
   {
      this(DEFAULT_CAPACITY);
   }
   
   public ArraySongList(int capacity)
   {
      elementData = new Song[capacity];
      size = 0;
   }
   
   //methods
   public void add(Song data)
   {
      elementData[size] = data;
      size++;
   }
   
   public void add(int index, Song data)
   {
      for(int i=size; i >= index+1; i--)
      {
         elementData[i] = elementData[i-1];
      }
      
      elementData[index] = data;
      
      size++;
   }
   
   public void remove(int index)
   {
      for(int i=index; i<size-1; i++)
      {
         elementData[i] = elementData[i+1];     
      }
      
      size--;   
   }
   
   public int size()
   {
      return size;
   }
   
   public Song get(int index)
   {
      return elementData[index];   
   }
   
   public int indexOf(Song data)
   {
      for(int i=0; i < size; i++)
      {
         if(elementData[i].equals(data))
         {
            return i;
         }
      }
      
      return -1;   
   }
   
   @Override
   public String toString()
   {
      if(size == 0)
      {
         return "[]";
      }
      else
      {
         String result = "[";
         
         result += elementData[0];
         
         for(int i=1; i<size; i++)
         {
            result += ", " + elementData[i];
         }
         
         result += "]";
         return result;   
      }
   }
   
   public int totalDuration()
   {
      int totalDuration = 0;
      Song currentSong = null;
      
      for(int i=0; i<size; i++)
      {
         currentSong = elementData[i];
         totalDuration += currentSong.getDuration();
      }
      
      return totalDuration;
   }   
}