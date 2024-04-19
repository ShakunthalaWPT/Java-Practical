package ACTIVITY;
public class Calendar_Event_2 {	
	 public static void main(String[] args) {
	 	Calendar_Event event = new Calendar_Event("Java Conference", "2024-04-20", "Tokyo, Japan");

	     event.setEventTitle("International Java Symposium");
	     event.setEventDate("2024-05-15");
	     event.setEventLocation("Kyoto, Japan");

	     event.displayEventDetails();
	 }
	}