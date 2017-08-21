package org.jointheleague.rhyme;
import java.util.Collection;

public interface LinkedListInterface <T>

{

	Node start = null;

	Node end = null;

	int size = 0;

	/* Function to check if list is empty */
	public boolean isEmpty();

	   /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
	public int size();

	/* Function to insert an element at begining */

	public void addFirst(T data);

	/* Function to insert an element at end */

	public void addLast(T data);

	/**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param data object to be appended to this list
     * @return {@code true} (as specified by {@link Collection#add})
     */
	public void add(T data, int index);

	/**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
	public void remove(int index);
	


	/* Function to display elements */

	public String toString();

}
