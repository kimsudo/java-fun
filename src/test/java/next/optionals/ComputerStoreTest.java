package next.optionals;

import static org.junit.Assert.*;

import org.junit.Test;

import next.optionals.Computer.Soundcard;
import next.optionals.Computer.USB;

public class ComputerStoreTest {

	@Test
	public void getVersion() {
		String version = "pobi's usb";
		Soundcard soundcard = new Soundcard(new USB(version));
		Computer computer = new Computer(soundcard);
		assertEquals(version, ComputerStore.getVersion1(computer));
	}
	
	@Test
	public void getVersionWhenComputerIsNull() throws Exception {
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion1(null));
	}

	@Test
	public void getVersionWhenSoundcardIsNull() throws Exception {
		Computer computer = new Computer(null);
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion1(computer));
	}
	
	@Test
	public void getVersionWhenUSBIsNull() throws Exception {
		Computer computer = new Computer(new Soundcard(null));
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion1(computer));
	}
}
