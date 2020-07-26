package JUNIT.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRemovalTest {
	
	Removal rem;
	@BeforeEach
	   void setup() 
     {
		     rem = new Removal();
	   }
	
	@Test
	    void testNChars() {
	       	assertEquals("BCD",rem.remove("ABCD"));
		      assertEquals("CD",rem.remove("AACD"));
		      assertEquals("BCD",rem.remove("BACD"));
		      assertEquals("BBAA",rem.remove("BBAA"));
		      assertEquals("BAA",rem.remove("AABAA"));
	      }
	
	void test1Char() {
		assertEquals("",rem.remove("A"));
		assertEquals("B",rem.remove("B"));		
	}
	
	void testNoChar() {
		assertEquals("",rem.remove(""));
	}
}

public class Removal {
	String remove(String input){
		       String result = input;
		       int len = input.length();
		       if(len>=2) {
		               	if(input.charAt(0) == 'A' && input.charAt(1) == 'A')
		                        		result = result.substring(2);
		              	else if(input.charAt(0) == 'A' && input.charAt(1) != 'A')
		                         		result = result.substring(1);
	              		else if(input.charAt(0) != 'A' && input.charAt(1) == 'A')
		                        		result = result.substring(0,1) + result.substring(2);
	                  	}
	       	else if(len == 1) {
		               	result = input.charAt(0) == 'A' ? "" : result; 
                		}
      		return result;
			}
}
