package com.sb.tutorial.slf4jsamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Test class to test the MessagePrinter
 */
public class MessagePrinterTest {

    /**
     * This is the method to test the printMessage method.
     * @param The message param to this test method.
     */
    @Test(dataProvider = "sampleMessagesDataProvider")
    public void printMessage(String message) {
        
        MessagePrinter messagePrinter = new MessagePrinter();
        messagePrinter.print(message);
    }
    
    /**
     * The sample messages data provider
     */
    @DataProvider(name = "sampleMessagesDataProvider")
    public Object[][] sampleMessagesDataProvider() {
        
        return new Object[][]{
                {"Sample Message 1"},
                {"Sample Message 2"},
                {"Sample Message 3"}};
    }
}
