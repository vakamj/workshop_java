import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SwapTest {

    /**
     * test for checking swap strings
     */
    @Test
    public void doSwap() throws IOException {
        Swap swap = new Swap();
        List<String> actualList = new ArrayList<>();
        actualList.add("as");
        actualList.add("dse");
        actualList.add("iw");
        actualList.add("de");
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "as", "de", "iw", "dse");
        assertEquals(expectedList, swap.doSwap(actualList));
    }

    /**
     *test for checking swap number strings
     */
    @Test
    public void doSwapNumber() throws IOException {
        Swap swap = new Swap();
        List<String> actualList = new ArrayList<>();
        actualList.add("12");
        actualList.add("23");
        actualList.add("33");
        actualList.add("15");
        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "15", "23", "33", "12");
        assertEquals(expectedList, swap.doSwap(actualList));
    }

    /**
     *test for checking empty list
     */
    @Test(expected = IOException.class)
    public void doSwapException() throws IOException {
        Swap swap = new Swap();
        List<String> actualList = new ArrayList<>();
        swap.doSwap(actualList);
    }

}

