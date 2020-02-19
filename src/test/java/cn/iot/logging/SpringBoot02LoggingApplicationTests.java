package cn.iot.logging;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot02LoggingApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	void contextLoads() {
		
		//日志的级别，有低到高
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
		//springboot默认root级别的日志，也叫info级别
		logger.info("这是info日志...");
		logger.warn("这是warn的日志...");
		logger.error("这是error日志...");
	}

}
