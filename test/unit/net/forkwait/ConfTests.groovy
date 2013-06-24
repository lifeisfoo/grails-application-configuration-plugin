package net.forkwait

import grails.test.mixin.TestFor

@TestFor(Conf)
class ConfTests {

	void testPut() {
		assert Conf.valuePut("key","value"), "Simple put failed"
	}

	void testGet() {
		Conf.valuePut("get","value")
		assert Conf.valueGet("get"), "Simple get failed"
	}

	void testNullGet() {
		assert !Conf.valueGet("getnull"), "Not inserted value cannot exists"
	}
}
