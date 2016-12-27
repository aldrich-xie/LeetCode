package problem;

import java.util.Arrays;

public class P455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int feeded = 0;
        int index = 0;
        while (index < s.length && feeded < g.length) {
            if (s[index] >= g[feeded]) {
                index++;
                feeded++;
            } else {
                index++;
            }
        }
        return feeded;        
    }
}
