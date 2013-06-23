package net.forkwait



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Conf)
class ConfTests {

    void testPut() {
    	if(Conf.valuePut("key","value")){

    	}else{
       		fail "Simple put failed"
       	}
    }

    void testGet() {
    	Conf.valuePut("get","value")
    	if(Conf.valueGet("get")){

    	}else{
       		fail "Simple get failed"
       	}
    }

    void testNullGet() {
    	if(Conf.valueGet("getnull")){
    		fail "Not inserted value cannot exists"
    	}else{
       	
       	}
    }
}
