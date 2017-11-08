package org.example.java8;

import java.time.Duration;
import java.time.Instant;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		
		Thread.sleep(10000);
		
		Instant end= Instant.now();
		
		Duration duration= Duration.between(start, end);
		System.out.println(duration.toMillis());

	}

}
