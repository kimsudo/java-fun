package next.fp;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

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
		assertThat(sum).isEqualTo(21);
	}
	
	@Test
	public void sumAllEven() throws Exception {
		int sum = Lambda.sumAllEven(numbers);
		assertThat(sum).isEqualTo(12);
	}
	
	@Test
	public void sumAllOverThree() throws Exception {
		int sum = Lambda.sumAllOverThree(numbers);
		assertThat(sum).isEqualTo(15);
	}
}
