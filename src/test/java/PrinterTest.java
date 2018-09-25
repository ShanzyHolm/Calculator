import org.junit.Before;

import org.junit.Test;

import static org.junit.Assert.assertEquals; //alt enter on assert equals below and select junit OR type out

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer();
    }

    @Test
    public void getSheetsOfPaper() {
        int paper = printer.getSheetsOfPaper();
        assertEquals(100, paper);
    }

    @Test
    public void totalPagesToPrint() {
        int paperNeeded = printer.printMultiplePageDocuments(3, 5);
        assertEquals(15, paperNeeded);
    }

    @Test
    public void canPrinter( ) {
        printer.print(2, 5);
        assertEquals(10, printer.getSheetsOfPaper());
    }

}


