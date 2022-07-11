package Collection;

public class ArrayList0 {
	
	/*1. ArrayList - It is one the the class which is implemented in list interface.
	AL is the best choice if we want to perform retrieve operation (Get method).

	1. Store duplicate values/elements.
	2. Store Heterogenous type of data.
	3. Maintains Insertion order.
	4. Allow any no null values.
	5. Incremental capacity =(Current Capacity*3/2)+1
	6. Default size of array list is 10.
	7. DS - Growable
	8. Best choice - Retrieval operation (Random access interface is implemented in arraylist) 
	9. Worst choice - Manipulation operation i.e. insertion or deletion between arralist.*/
	
	
	/*LinkedList - It is one the the class which is implemented list interface.
		1. LL is the best choice if our frequent operation is insertion or deletion in the middle.
		2. Worst choice - Retival opeation
		2. Duplicate are allowed.
		3.Null insertion is possible
		4. Insertion order is preserved
		6. Underlaying DS - Doubly linked list


		Diff B/w ArrayList and LinkedList
		ArrayList                                                 LinkedList
		1.Best choice - Retrieval operation               1. Best Choice - Insertion & deletion in the middle.
		2.Worst Chice - Insertion & deletion              2. Worst choice - Retrieval Operation
		3. DS - Growable & Resizable                      3. DS - Doubly linked & Linear type 
		4.Deafault capactiy - 10                          4. No Default capacity.
		5. It takes less memory                           5. it takes more memory.


==========================================================================================================================================================================================
		Difference B/w ArrayList and Vector
		ArrayList                                           Vector
		1.Not Legecy class                             1. Legecy Class
		2.Performance high                             2. Performance Low
		3.DS -Growable & Resizable                     3. Doubly type
		4.IC - (CC*3/2)+1                              4. IC -CC*2

==========================================================================================================================================================================================

		Set Interface

		Set interface is present in java.util.package& it extened the collection interface
		it represent the unorder set of element which doesn't allow to to duplicate element & we can store only one null value.

		Implemented class
		1. Hashet
		2. LinkedHasset
		3. TreeSet
	
============================================================================================================================================================================================
		Diff B/w HashSet and LinkedHasset

					Hshset                                       LinkedHasset
		1.Insertion order not preserved              	1. Insertion order preserved
		2.Duplicate element are not allowed      		2.Duplicate element are not allowed
		3.DS- Hashtable                                 3.DS - Hashtable+Linkedlist

===========================================================================================================================================================================================

		Difference B/W Set and Listinterface
 
				List                                         			 Set
		1. Duplicate are allowed                         1. Duplicate are not allowed
		2. Insertion order is preserved                  2. Insertion order is not preserved
		3. Multiple null element can be stored         	 3. Null element can store only once
		4.List implementations class are
		ArrayList,LinkedList,Vector & stack              4. Set Implementations classes are HashSet , LinkedList, TreeSet
		5. Element by their position can be access     	 5. Element by their position can not access. 

============================================================================================================================================================================================

		Queue  - java queue interface orders the element in FIFI (First in first out)*/

}
