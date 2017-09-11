public class Event {
    private String name;
    private String action;

Event(){


}

Event(String name, String action){
    this.name = name;
    this.action = action;
}

    public void setAction(String action) {
        this.action = action;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public String getName() {
        return name;
    }
}
