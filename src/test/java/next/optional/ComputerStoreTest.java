package next.optional;

import static org.junit.Assert.*;

import org.junit.Test;

import next.optional.Computer;
import next.optional.ComputerStore;
import next.optional.Computer.Soundcard;
import next.optional.Computer.USB;

public class ComputerStoreTest {

	@Test
	public void getVersion() {
		String version = "pobi's usb";
		Soundcard soundcard = new Soundcard(new USB(version));
		Computer computer = new Computer(soundcard);
		assertEquals(version, ComputerStore.getVersion(computer));
	}
	
	@Test
	public void getVersionWhenComputerIsNull() throws Exception {
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion(null));
	}

	@Test
	public void getVersionWhenSoundcardIsNull() throws Exception {
		Computer computer = new Computer(null);
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion(computer));
	}
	
	@Test
	public void getVersionWhenUSBIsNull() throws Exception {
		Computer computer = new Computer(new Soundcard(null));
		assertEquals(ComputerStore.UNKNOWN_VERSION, ComputerStore.getVersion(computer));
	}
}
