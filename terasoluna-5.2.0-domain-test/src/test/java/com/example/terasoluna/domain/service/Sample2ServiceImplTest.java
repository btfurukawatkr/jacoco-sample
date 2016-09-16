package com.example.terasoluna.domain.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:test-context.xml")
public class Sample2ServiceImplTest {

	@Autowired
	Sample2Service service;

	@Test
	public void test1() {
		boolean result = service.exec(false, false);
		assertFalse(result);
	}

	@Test
	public void test2() {
		boolean result = service.exec(true, false);
		assertTrue(result);
	}

	@Test
	public void test3() {
		boolean result = service.exec(false, true);
		assertTrue(result);
	}

}
