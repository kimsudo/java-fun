package next.optional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import next.optional.Computer.Soundcard;
import next.optional.Computer.USB;

public class ComputerStoreTest {

	@Test
	public void getVersion() {
		String version = "pobi's usb";
		Soundcard soundcard = new Soundcard(new USB(version));
		Computer computer = new Computer(soundcard);
		assertThat(ComputerStore.getVersion(computer)).isEqualTo(version);
	}
	
	@Test
	public void getVersionWhenComputerIsNull() throws Exception {
		assertThat(ComputerStore.getVersion(null)).isEqualTo(ComputerStore.UNKNOWN_VERSION);
	}

	@Test
	public void getVersionWhenSoundcardIsNull() throws Exception {
		Computer computer = new Computer(null);
		assertThat(ComputerStore.getVersion(computer)).isEqualTo(ComputerStore.UNKNOWN_VERSION);
	}
	
	@Test
	public void getVersionWhenUSBIsNull() throws Exception {
		Computer computer = new Computer(new Soundcard(null));
		assertThat(ComputerStore.getVersion(computer)).isEqualTo(ComputerStore.UNKNOWN_VERSION);
	}
}
