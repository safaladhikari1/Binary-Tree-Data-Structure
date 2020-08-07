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








