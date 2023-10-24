import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test
    public void testPrepend() {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        ll.prepend(2);
        assertEquals(ll.first(), 2);
    }

    @Test
    public void testAppend() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        assertEquals(ll.first(), 1);
    }

    @Test
    public void testFirst() {
        LinkedList ll = new LinkedList();
        ll.prepend(1);
        assertEquals(ll.first(), 1);
    }

    @Test
    public void testLast() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        assertEquals(ll.last(), 2);
    }

    @Test
    public void testToString() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        assertEquals("1 2", ll.toString());
    }

    @Test
    public void testLength() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        assertEquals(2, ll.length());
    }
}
