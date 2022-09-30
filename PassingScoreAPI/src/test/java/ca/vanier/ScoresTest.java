package ca.vanier;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ScoresTest{
    //when the case is true
    @Test
    public void testResultTrue(){
    String args = "7";
    boolean answer = Scores.result(args);
    assertNotNull(answer);
    assertTrue("Checking if scores grater than 6", answer == true);
}

//when the case is false
@Test
    public void testResultFalse(){
    String args = "8";
    boolean answer = Scores.result(args);
    assertNotNull(answer);
    assertFalse("Checking if scores less than 6", answer == false);
    }
}