package pahakia.hi;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void replyTest() {
        HelloWorld hw = new HelloWorld();
        String reply = hw.reply("there");
        assertEquals("Hi there", reply);
    }
}
