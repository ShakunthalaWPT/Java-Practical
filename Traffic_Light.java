package ACTIVITY;
public class Traffic_Light {	    
	    private String red;
	    private String yellow;
	    private String green;
	    public Traffic_Light() {
	        red = "OFF";
	        yellow = "OFF";
	        green = "OFF";
	    }
	    public void setRed(String status) {
	        red = status;
	    }

	    public void setYellow(String status) {
	        yellow = status;
	    }

	    public void setGreen(String status) {
	        green = status;
	    }
	    public String getRed() {
	        return red;
	    }

	    public String getYellow() {
	        return yellow;
	    }

	    public String getGreen() {
	        return green;
	    }
}