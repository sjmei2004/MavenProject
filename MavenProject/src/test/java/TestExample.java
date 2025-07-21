import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExample {

	 @Test
	    public void testAppMessage()
	    {
	        //Example example = new Example();
	        Example example = new Example();
	        assertEquals("Hello World!Hello World!", example.getMessage());
	        assertEquals("Hello World!Hello World!", example.getMessage());
	    }

}
