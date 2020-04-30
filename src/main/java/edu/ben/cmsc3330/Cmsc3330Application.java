package edu.ben.cmsc3330;

import edu.ben.cmsc3330.data.basicfuntions.Inserts;
import edu.ben.cmsc3330.data.model.Destination;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cmsc3330Application {

	public static void main(String[] args) {
		//SpringApplication.run(Cmsc3330Application.class, args);

		Destination d = new Destination();
		d.setAirport("United");
		d.setCity("Algonquin");
		d.setState("IL");

		Inserts i = new Inserts();
		i.insertDestination(d);
	}

}
