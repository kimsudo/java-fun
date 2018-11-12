package next.fp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import next.fp.StreamStudy;

public class StreamStudyTest {
	private List<Integer> numbers;
	
	@Before
	public void setup() {
		numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	public void countWords() throws Exception {
		long result = StreamStudy.countWords();
		System.out.println("result : " + result);
	}
	
	@Test
	public void printLongestWordTop100() throws Exception {
		StreamStudy.printLongestWordTop100();
	}
	
	@Test
	public void map() throws Exception {
		List<Integer> doubleNumbers = StreamStudy.doubleNumbers(numbers);
		doubleNumbers.forEach(System.out::println);
	}
	
	@Test
	public void sumAll() throws Exception {
		long sum = StreamStudy.sumAll(numbers);
		assertEquals(21, sum);
	}
	
	@Test
	public void sumOverThreeAndDouble() throws Exception {
		numbers = Arrays.asList(3, 1, 6, 2, 4, 8);
		long sum = StreamStudy.sumOverThreeAndDouble(numbers);
		assertEquals(36, sum);
	}
}
