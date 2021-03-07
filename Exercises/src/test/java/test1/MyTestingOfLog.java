package test1;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyTestingOfLog {

	@Test
	public void test1() {
		log.error("This is only a test....");
	}
	
}
