package io.pivotal.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZipkinStreamServerApplication.class)
public class SimulatorRegistryApplicationTests {

	@Test
	public void contextLoads() {
	}

}