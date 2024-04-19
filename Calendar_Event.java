package ACTIVITY;
public class Calendar_Event {
	    private String eventTitle;
	    private String eventDate;
	    private String eventLocation;

	    public Calendar_Event(String eventTitle, String eventDate, String eventLocation) {
	        this.eventTitle = eventTitle;
	        this.eventDate = eventDate;
	        this.eventLocation = eventLocation;
	    }
	    public void setEventTitle(String eventTitle) {
	        this.eventTitle = eventTitle;
	    }
	    public String getEventTitle() {
	        return eventTitle;
	    }
	    public void setEventDate(String eventDate) {
	        this.eventDate = eventDate;
	    }
	    public String getEventDate() {
	        return eventDate;
	    }
	    public void setEventLocation(String eventLocation) {
	        this.eventLocation = eventLocation;
	    }
	    public String getEventLocation() {
	        return eventLocation;
	    }
	    public void displayEventDetails() {
	        System.out.println("Event Title: " + eventTitle);
	        System.out.println("Event Date: " + eventDate);
	        System.out.println("Event Location: " + eventLocation);
	    }
	}
