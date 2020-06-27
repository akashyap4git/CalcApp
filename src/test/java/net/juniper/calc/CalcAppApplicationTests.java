package net.juniper.calc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan({
	"net.juniper.calc.service"
})
class CalcAppApplicationTests {

	@Test
	void contextLoads() {
	}

}
