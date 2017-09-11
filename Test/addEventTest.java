import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;


public class addEventTest{

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    EventLog eventLogTest = new EventLog();

    @Test
    public void doesItEvenRun(){

        thrown.expect(IllegalArgumentException.class);
        Assert.assertTrue(eventLogTest.addEvent(null));

    }
//
//    @Test
//    //this will fail after refactor
//    public void willItRunWithoutException(){
//
//
//        Event workingEvent = new Event("name","action"){};
//        eventLogTest.addEvent (workingEvent);
//
//        assertEquals(1, eventLogTest.getNumEvents ());
//    }

    @Test
    public void okTestingForReallyNow(){
//lol
    }

    @Test
    public void noNameException(){
        Event noNameEvent = new Event(null, "action");
        thrown.expect (IllegalArgumentException.class);

        eventLogTest.addEvent (noNameEvent);

    }

//    @Test
//    //this will fail after refactor with actions in place.
//    public void workingWithNameBeforeRefactor(){
//        Event workingEvent = new Event("name","action"){};
//        eventLogTest.addEvent (workingEvent);
//
//        assertEquals(1, eventLogTest.getNumEvents ());
//
//    }

    @Test
    public void nullActionEventThrowingException(){
        Event nullActionEvent = new Event("name", null);

        //not working with getter.isEmpty()
        thrown.expect(IllegalArgumentException.class);
        eventLogTest.addEvent(nullActionEvent);
    }

    @Test
    public void testJustFace2Face(){
        Event fNotworking = new Event ("whatever", "face");
        thrown.expect(IllegalArgumentException.class);
        eventLogTest.addEvent(fNotworking);
    }


    @Test
    public void testFace2FaceWorks(){
        Event f2fWorks = new Event ("haha", "Face2Face");
        eventLogTest.addEvent (f2fWorks);
        assertEquals (1, eventLogTest.getNumEvents ());
    }

//    @Test
// //haha this fails cause im expecting an exception and the rule is no exceptions!!! lol
//    public void testTheOtherActions(){
//        Event boolTest = new Event("name", "TextMessage");
//        thrown.expect (IllegalArgumentException.class);
//        eventLogTest.addEvent (boolTest);
//
//    }

        @Test

    public void testTheOtherActions(){
        Event boolTest = new Event("name", "TextMessage");
        eventLogTest.addEvent (boolTest);
        assertEquals (1, eventLogTest.getNumEvents ());

    }

    @Test
    //for two events
    public void addTwoEvents(){
        Event oneEvent = new Event("name", "PhoneCall");
        Event twoEvent = new Event("name", "Unknown");
        eventLogTest.addEvent (oneEvent);
        eventLogTest.addEvent (twoEvent);
        assertEquals (2, eventLogTest.getNumEvents ());
    }

    @Test
    public void nowGoBeAwesomeWITHTESTS(){
        eventLogTest.addEvent (new Event ("hah", "PhoneCall"));
        assertEquals (1, eventLogTest.getNumEvents ());
    }



}