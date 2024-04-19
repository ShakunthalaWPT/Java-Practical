package ACTIVITY;
public class Main_Traff {
			class Main {
		    public static void main(String[] args) {
		    	Traffic_Light trafficLight = new Traffic_Light();
		        trafficLight.setRed("ON");
		        trafficLight.setYellow("OFF");
		        trafficLight.setGreen("OFF");
		        System.out.println("THE STATUS OF EACH LIGHT IS");
		        System.out.println("Red light: " + trafficLight.getRed());
		        System.out.println("Yellow light: " + trafficLight.getYellow());
		        System.out.println("Green light: " + trafficLight.getGreen());
		    }
		}
	}
