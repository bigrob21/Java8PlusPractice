package functions.test1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import models.Track;

public class StreamAndFunctions {

	private List<Track> trackList1;
	
	@BeforeEach
	public void init() {
		if(trackList1 != null)
			trackList1.clear();
		Track t1 = Track.builder().title("Thriller").runningTime(Duration.ofSeconds(120).toMillis()).build();
		Track t2 = Track.builder().title("Smooth Criminal").runningTime(Duration.ofMinutes(3).toMillis()).build();
		Track t3 = Track.builder().title("X Gon Give It To Ya").runningTime(Duration.ofSeconds(300).toMillis()).build();
		Track t4 = Track.builder().title("Like Whoa").runningTime(Duration.ofSeconds(90).toMillis()).build();
		trackList1 = Arrays.asList(t1, t2, t3, t4);
	}

	@Test
	@DisplayName("Test showing classic PRE-Java 8 interation and printing")
	public void test1() {
		for(Track tr : trackList1) {
			System.out.println(tr.getTitle());
		}
		
		System.out.println("========================");
	}
	
	@Test
	@DisplayName("Test showing streaming pattern to extract the names")
	public void test2() {
		trackList1.stream()
			//Note the method reference syntax this is the equivalence of a Java Function<Track, String> based on its usage
			.map(Track::getTitle)
			.forEach(System.out::println);
	}
	
	//TODO: Perform a stream operation like test 2 by add a function that Upper Cases All the characters and prints it. 
	
	//TODO: Stream through tracks and sort the list of tracks from longest to shortest and print the print the track data. 
	
}
