import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(110,50);

    }

    @Test
    public void hasPaper(){
        assertEquals(110, printer.getPaper());
    }

//    @Test
//    public void canGetPrintInfo(){
//        assertEquals(10,2,printer.getPrintInfo());
//    }


}
