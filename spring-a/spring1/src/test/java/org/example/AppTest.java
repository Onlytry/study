package org.example;

import static org.junit.Assert.assertTrue;

import com.dz.spring.SpringTest;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.xml");
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest",true);
        springTest.watch();



    }
}
