package org.jointheleague.rhyme;

public class LinkedList<T> implements LinkedListInterface<T> {
	Node<T> first;
	Node<T> last;
	protected int size = 0;

	public LinkedList() {

	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	@Override
	public void addFirst(T data) {
		first = new Node<T>(data, first);
		if(size == 0)
			last = first;
		size++;
	}

	@Override
	public void addLast(T data) {
		if (size == 0)
			first = new Node<T>(data);
		else {
			Node<T> last;
			for (last = first; last.getNext() != null; last = last.getNext()) {
			}
			last.setNext(new Node<T>(data));
		}
		size++;
	}

	@Override
	public void add(T data, int index) {
		if (index == 0)
			addFirst(data);
		else {
			index--;
			Node<T> destination = first;
			for (int i = 1; i <= index; i++) {
				if (destination == null)
					throw new ArrayIndexOutOfBoundsException();
				destination = destination.getNext();
			}
			destination.setNext(new Node<T>(data, destination.getNext()));
		}
		size++;
	}

	public void remove(int index) {
		Node<T> prior = first;
		for (int i = 1; i < index; i++)
			prior = prior.getNext();
		if (prior == null)
			throw new ArrayIndexOutOfBoundsException();
		prior.setNext(prior.getNext().getNext());
		if(index == size - 1)
			last = prior;
		size--;
	}

	@Override
	public String toString() {
		String ret = "";
		for (Node<T> current = first; current != null; current = current.getNext()) {
			ret += current.getData().toString();
		}

		return ret;
	}

}
