import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * class Swap for swap string
 */
public class Swap {
    /**
     * function doSwap, swaps strings if they are not empty and the first letters match
     *
     * @param list of input lines
     * @return swapList - list of swap strings
     * @throws IOException when lines are empty
     */
    public List doSwap(final List<String> list) throws IOException {
        if (list.isEmpty()) {
            throw new IOException("list is empty");
        }
        List<String> swapList = new ArrayList<>(list);
        Map<Character, String> map = new HashMap<>();
        String rewriteString;
        for (int i = 0; i < list.size(); i++) {
            if ((!list.get(i).isEmpty()) && map.containsKey((list.get(i).charAt(0)))) {
                if (map.get(list.get(i).charAt(0)) != "") {
                    rewriteString = list.get(i);
                    swapList.set(i, map.get(list.get(i).charAt(0)));
                    swapList.set(swapList.indexOf(map.get(list.get(i).charAt(0))), rewriteString);
                    map.put(list.get(i).charAt(0), "");
                }
            } else {
                map.put(list.get(i).charAt(0), list.get(i));
            }

        }
        return swapList;

    }
}
