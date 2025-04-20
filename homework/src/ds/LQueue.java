package ds;


import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class LQueue<E> extends AbstractQueue<E> {

    protected LinkedList<E> data;

    public LQueue() {
        data=new LinkedList<>();
    }

    public LQueue(Collection<? extends E> other) {
        data=new LinkedList<> (other);
    }

    @Override
    public boolean offer(E e) {
        return data.add(e);
    }

    @Override
    public E poll() {
        if(data.size()==0)
            return null;
        else
            return data.remove(0);
    }

    @Override
    public E peek() {
        if(data.size()==0)
            return null;
        else
            return data.get(0);
    }

    public E remove() {
        E e=poll();
        if(e==null)
            throw new NoSuchElementException();
        else
            return e;
    }

    @Override
    public Iterator<E> iterator() {
        return new LQueueIterator();
    }

    @Override
    public int size() {
        return data.size();
    }


    @SuppressWarnings("unchecked")
    public boolean equals(Object other) {
        if(this==other) {
            return true;
        }
        if(other instanceof LQueue<?>)
            return this.data.equals(((LQueue<E>)other).data);
        else
            return false;

    }

    private class LQueueIterator implements Iterator<E>

    {
        public LQueueIterator() {
            this.thing=data.listIterator();

        }
        ListIterator<E> thing;
        @Override
        public boolean hasNext() {

            return thing.hasNext();
        }

        @Override
        public E next() {
            return thing.next();
        };
    }
}
