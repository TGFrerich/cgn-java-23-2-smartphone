import org.example.BusinessContact;
import org.example.Smartphone;
import org.junit.jupiter.api.Test;
import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;


public class testing{

    @Test

    public void isStartRadioTrue(){
        Smartphone neu = new Smartphone();
        assertTrue(neu.startRadio());
    }

    @Test
    public void isStopRadioFalse(){
        Smartphone neu = new Smartphone();
        assertFalse(neu.stopRadio());
    }
    @Test
    public void isPositionCorrect(){
        Smartphone neu = new Smartphone();
        assertEquals("Köln", neu.getPosition());

    }
    @Test
    public void hasContactCompanyName(){
        BusinessContact contact = new BusinessContact();

    }
}



