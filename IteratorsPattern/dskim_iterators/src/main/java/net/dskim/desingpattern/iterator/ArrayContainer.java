package net.dskim.desingpattern.iterator;

import java.util.Iterator;


public class ArrayContainer implements MyIterable {
	Iterator<Object> arrayIterator;
	Iterator<Object> reverseArrayIterator;

	public ArrayContainer(Object[] array) {
		arrayIterator = new ArrayIterator(array);
		reverseArrayIterator = new ReverseArrayIterator(array);
	}

	@Override
	public Iterator<Object> iterator() {
		return arrayIterator;
	}

	@Override
	public Iterator<Object> reverseIterator() {
		return reverseArrayIterator;
	}
}