import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(20);
    }

    @Test
    public void getSheetsOfPaper() {
        int paper = printer.getSheetsOfPaper();
        assertEquals(20, paper);
    }

}


