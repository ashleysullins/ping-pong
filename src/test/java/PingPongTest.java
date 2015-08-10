import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void pingPongTestResults_printPingForThree_true() {
        PingPong testPingPong = new PingPong();
        assertEquals("ping", testPingPong.pingPongTestResults(3));
    }

}
