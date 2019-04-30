//import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestRunSvg {

	@Test
	public void testMain() {
		String[] argsArray = {
			"-gui"
		};
		try {
			net.sourceforge.plantuml.Run.main(argsArray);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
