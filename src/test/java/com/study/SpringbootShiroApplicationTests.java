package com.study;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootShiroApplicationTests {

	@Test
		public void contextLoads() {
			int n=1;
			int count=0;
			while(n!=0){
				n= (n - 1) & n;
				count++;
			}
	}

}
