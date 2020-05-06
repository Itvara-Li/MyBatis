/**
 * <p>Title: testlogger.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-5-13  
* @version 1.0  
 */
package com.coffee.a2;
import org.apache.log4j.Logger; 
/**
 * @author coffeeliu
 *
 */
public class testlogger {

	/**
	 * @param args
	 */
	 private static final Logger LOG = Logger.getLogger(testlogger.class);  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 LOG.info("this is log");
	}

}
