package net.dskim.desingpattern.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorTest {


	@Test
	void listIteratorTest() {
		List<String> names = new ArrayList<String>();
		names.add("Roberto");
		names.add("Leo");
		names.add("Marcelo");
		names.add("Quezia");
		names.add("Tim");

		Iterator<String> namesIterator = names.iterator();
		int i = 0;
		while (namesIterator.hasNext()) {
			assertEquals(names.get(i++), namesIterator.next());
		}
	}

	@Test
	void arrayIteratorTest() {
		String[] names = {
			"Roberto"
			,"Leo"
			,"Marcelo"
			,"Quezia"
			,"Tim"
		};
		
		MyIterable arrayContainer = new ArrayContainer(names);

		int i = 0;
		Iterator<Object> arrayIterator = arrayContainer.iterator();
		while (arrayIterator.hasNext()) {
			assertEquals(names[i++], arrayIterator.next());
		}

		i = 0;
		Iterator<Object> reverseArrayIterator = arrayContainer.reverseIterator();
		while (reverseArrayIterator.hasNext()) {
			assertEquals(names[names.length - (++i)], reverseArrayIterator.next());
		}
	}	
}
