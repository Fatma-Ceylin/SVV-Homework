package ds;

import java.util.Collection;
import java.util.Comparator;

public class PriorityLQueue<E> extends LQueue<E>
{
    Comparator<? super E> c;

    public PriorityLQueue()
    {
        super();
    }

    public PriorityLQueue(Comparator<? super E> c)
    {
        super();
        this.c=c;
    }

    public PriorityLQueue(Collection<? extends E> other)
    {
        super(other);
        sortQueue();
    }


    public PriorityLQueue(Collection<? extends E> other, Comparator<? super E> c)
    {
        super(other);
        this.c=c;
        sortQueue();
    }
    public boolean offer(E e) {
        boolean result = super.offer(e);
        sortQueue();
        return result;
    }

    private void sortQueue() {
        data.sort(this::myCompare);

    }
    @SuppressWarnings("unchecked")
    private int myCompare(E e1, E e2) {
        if (c == null) { // No external comparator, use natural order
            if (!(e1 instanceof Comparable<?>))
                throw new RuntimeException("E does not implement Comparable");
            return ((Comparable<E>) e1).compareTo(e2); // Use natural order
        } else {
            return c.compare(e1, e2); // Use external comparator
        }
    }


}