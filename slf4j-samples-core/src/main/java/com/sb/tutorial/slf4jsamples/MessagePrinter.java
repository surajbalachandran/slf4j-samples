/**
 * 
 */
package com.sb.tutorial.slf4jsamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Simple Message Printer Implementation 
 */
public class MessagePrinter {
    
    /**
     * The logger instance
     */
    private Logger logger = LoggerFactory.getLogger(MessagePrinter.class);
    
    /**
     * Simple method to print a message
     * @param The message to be printed
     */
    public void print(String message) {
        
        logger.info("Message: {}", message);
    }
}
