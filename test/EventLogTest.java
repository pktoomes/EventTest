import com.company.EventLog;
import com.company.Event
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class EventLogTest {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void testAddEvent throws IllegalArgumentException{
        System.out.println("testing addEvent");
        Event testEvent = new Event();
        EventLog testLog = new EventLog();
        testEvent.setName("Lunch");
        testEvent.setAction("None");

        assertEquals("test setName", testEvent.getName(), "Lunch");
        assertEquals("test setAction", testEvent.getAction(), "None");

        testLog.addEvent();
        assertEquals("test addEvent", testLog.getNumEvents(), 1);
        assertTrue("test exception is thrown if fields left blank", testLog.addEvent(testEvent));
    }

}
