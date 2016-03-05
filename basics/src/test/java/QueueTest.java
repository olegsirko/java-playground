import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class QueueTest {
	
	@Test
	public void testPush() throws Exception {
		Queue queue = new Queue(3);
		queue.push (5);
		queue.push(6);
		queue.push (7);
		try {
			queue.push(8);
			fail("Queue overflow check failed. Push of n+1 element didn't invoke exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			assertEquals(e.getMessage(), "Overflow");
		}
	}

	@Test
	public void testPop() throws Exception {
		Queue queue = new Queue(3);
		queue.push (5);
		queue.push (6);
		queue.push (7);
		assertEquals(5, queue.pop());
		assertEquals(6, queue.pop());
		assertEquals(7, queue.pop());
		try {
			queue.pop();
			throw new Exception("Queue underflow check failed. Push of 0-1 element didn't invoke exception");
		}
		catch (Exception e) {
			assertEquals(e.getMessage(), "Underflow");
		}
	}
}