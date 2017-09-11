import java.util.ArrayList;
import java.util.List;


public class EventLog extends Event{

    private List<Event> eventList;

    public EventLog(){
        eventList = new ArrayList<>();
    }

    public boolean addEvent (Event event) throws IllegalArgumentException {
        //We'll write the function after we've written our unit tests
        //This is TDD: Test Driven Development.
        //get rid of try catch and actually throw the event exception to test each part.
        if (event == null) {
            throw new IllegalArgumentException();
        }
        if (event.getName () == null) {
            throw new IllegalArgumentException ();
        } if (event.getAction () == null){
            throw new IllegalArgumentException ();}
            if (event.getAction ().equals ("Face2Face") ||
                    event.getAction ().equals ("PhoneCall") ||
                    event.getAction ().equals ("TextMessage") ||
                    event.getAction ().equals ("Unknown")){
            eventList.add(event);
                System.out.println (eventList);
            return true;
        }else{
            throw new IllegalArgumentException ();
        }
    }

    public int getNumEvents(){
        return eventList.size();
    }



}
