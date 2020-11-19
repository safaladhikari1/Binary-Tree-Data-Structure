# Java Collections Framework

A collection is an object that stores a group of other objects. Collections are used to structure, organize, and search data.

### List: An ordered collection of elements, often accessed by integer indexes or by iteration.

**ArrayList**

* Random access: any element can be accessed quickly
* Adding and removing at the end of the list is fast

**LinkedList**

* Adding and removing at either the beginning or end of the list is fast
* Adding and removing during a sequential access with an iterator is fast
* Unlike with arrays, there is no need to expand when full
* Can be more easily used as a queue than arrays can

### Set: A collection of elements that is guaranteed to contain no duplicates. 

It is like a hash map except it only stores keys, without values. Sets are usually implemented very similarly to hash maps—using hashing to index into an array—but they don't have to worry about storing values alongside keys. In Java, sets are called "hash sets." They're implemented using hash maps—each member of the set is a key in the hash map with a dummy value that gets ignored.

**HashSet**

* Extremely fast performance for add, contains, and remove tasks
* Can be used with any type of objects as its elements, are stored in an unpredictable order.

**TreeSet**

* Elements are stored in sorted order
* Must be used with elements that can be compared (such as Integer, String)

### Map: A collection of key/value pairs in which each key is associated with a corresponding value.

**TreeMap**

* Holds Comparable keys in a sorted order.

**HashMap**

* Can hold any data as its keys and performs value lookups faster, but its keys are stored in an unpredictable order.

### Stack: 

* A collection in which the last element added is the first one to be removed.

### Queue: 

* A collection in which elements are removed in the same order in which they were added.

## Comparison of Lists, Sets, and Maps

**List:**

  * Strength: A sequence of elements arranged in order of insertion
  * Weakness: Slow to search, slow to add/remove arbitrary elements
  * Usages: List of accounts; prime numbers; the lines of a file

**Set:**

  * Strength: A set of unique elements that can be searched quickly
  * Weakness: Does not have indexes; user cannot retrieve arbitrary elements
  * Usages: Unique words in a book; lottery ticket numbers

**Map:** 

  * Strength: A group of associations between pairs of "key" and "value" objects
  * Weaknesses: Not a general-purpose collection: cannot easily map backward from a value to its key
  * Usages: Word counting; phone book creation

## When hash table operations cost O(n)O(n) time

**Hash collisions**
If all our keys caused hash collisions, we'd be at risk of having to walk through all of our values for a single lookup (in the example above, we'd have one big linked list). This is unlikely, but it could happen. That's the worst case.

**Dynamic array resizing**
Suppose we keep adding more items to our hash map. As the number of keys and values in our hash map exceeds the number of indices in the underlying array, hash collisions become inevitable.

To mitigate this, we could expand our underlying array whenever things start to get crowded. That requires allocating a larger array and rehashing all of our existing keys to figure out their new position—O(n)O(n) time.

## Hash table strengths and weaknesses:

**Strengths:**

* Fast lookups. Lookups take O(1)O(1) time on average.
* Flexible keys. Most data types can be used for keys, as long as they're hashable.

**Weaknesses:** 

* Slow worst-case lookups. Lookups take O(n)O(n) time in the worst case.
* Unordered. Keys aren't stored in a special order. If you're looking for the smallest key, the largest key, or all the keys in a range, you'll need to look through every key to find it.
* Single-directional lookups. While you can look up the value for a given key in O(1)O(1) time, looking up the keys for a given value requires looping through the whole dataset—O(n)O(n) time.
* Not cache-friendly. Many hash table implementations use linked lists, which don't put data next to each other in memory.








