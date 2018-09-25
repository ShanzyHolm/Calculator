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

    @Test
    public void totalPagesToPrint() {
        int paperNeeded = printer.printMultiplePageDocuments(3, 5);
        assertEquals(15, paperNeeded);
    }

}


