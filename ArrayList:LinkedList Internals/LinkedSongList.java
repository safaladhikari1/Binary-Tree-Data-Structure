public class LinkedSongList implements SongList
{
   //fields
   private SongListNode front;
   
   //constructor
   public LinkedSongList()
   {
      front = null;
   }
   
   //methods
   public void add(Song data)
   {
      if(front == null)
      {
         front = new SongListNode(data, null);
      }
      
      else
      {
         SongListNode current = front;
         
         while(current.next != null)
         {
            current = current.next;
         }
         
         current.next = new SongListNode(data, null);
      }      
   }
   
   public void add(int index, Song data)
   {
      if(index == 0)
      {
         front = new SongListNode(data, front);
      }
      
      else
      {
         SongListNode current = front;
         
         for(int i=0; i<index-1; i++)
         {
            current = current.next;
         }
         
         current.next = new SongListNode(data, current.next);
      }   
   }
   
   public void remove(int index)
   {
      if(index == 0)
      {
         front = front.next;
      }
      
      else
      {
         SongListNode current = front;
         
         for(int i=0; i<index-1; i++)
         {
            current = current.next;
         }
         
         current.next = current.next.next;
      }   
   }
   
   public int size()
   {
      SongListNode current = front;
      
      int count = 0;
      
      while(current != null)
      {
         count++;
         current = current.next;
      }
      
      return count;   
   }
   
   public Song get(int index)
   {
      SongListNode current = front;
      
      for(int i=0; i<index; i++)
      {
         current = current.next;
      }
      
      return current.data;
   }
   
   public int indexOf(Song data)
   {
      int index = 0;
      SongListNode current = front;
      
      while(current != null)
      {
         if(current.data.equals(data))
         {
            return index;
         }
         
         index++;
         current = current.next;
      }
      
      return -1;      
   }
   
   public int totalDuration()
   {
      int totalDuration = 0;
      
      SongListNode current = front;
      
      while(current != null)
      {
         totalDuration += current.data.getDuration();
         current = current.next;
      }
      
      return totalDuration;     
   }
   
   @Override
   public String toString()
   {
      if(front == null)
      {
         return "[]";
      }
      
      else
      {
         String result = "[";
         
         result += front.data;
         
         SongListNode current = front.next;
         
         while(current != null)
         {
            result += ", " + current.data;
            current = current.next;
         }
         
         result += "]";
         
         return result;
      }
   }      
}//end of class