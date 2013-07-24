package objectAdapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorAdapter implements Enumeration {

    private Iterator iterator;
    IteratorAdapter(Iterator iterator) {
        this.iterator = iterator;   
    }
	@Override
	public boolean hasMoreElements() {
        return iterator.hasNext();
	}

	@Override
	public Object nextElement() throws NoSuchElementException{
        return iterator.next();
	}

}
