package problem;

import java.util.ArrayList;
import java.util.List;

public class P500 {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        String[] rows = new String[] {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        for(String word : words) {
            String tmp = word.toUpperCase();
            for(int i=0; i<rows.length; i++) {
                boolean found = true;
                for(int j=0; j<tmp.length(); j++) {
                    if (rows[i].indexOf(tmp.charAt(j)) < 0) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    result.add(word);
                }
            }
        }
        return result.toArray(new String[result.size()]);

    }
}
