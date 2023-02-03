package com.codestates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class Section2Week3ApplicationTests {
	
	public void initialize() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void contextLoads() {
	}

}
