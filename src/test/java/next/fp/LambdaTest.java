package next.fp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import next.fp.Lambda;

public class LambdaTest {
	private List<Integer> numbers;
	
	@Before
	public void setup() {
		numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	public void printAllOld() throws Exception {
		Lambda.printAllOld(numbers);
	}
	
	@Test
	public void printAllLambda() throws Exception {
		Lambda.printAllLambda(numbers);
	}
	
	@Test
	public void runThread() throws Exception {
		Lambda.runThread();
	}
	
	@Test
	public void sumAll() throws Exception {
		int sum = Lambda.sumAll(numbers);
		assertEquals(21, sum);
	}
	
	@Test
	public void sumAllEven() throws Exception {
		int sum = Lambda.sumAllEven(numbers);
		assertEquals(12, sum);
	}
	
	@Test
	public void sumAllOverThree() throws Exception {
		int sum = Lambda.sumAllOverThree(numbers);
		assertEquals(15, sum);
	}
}
