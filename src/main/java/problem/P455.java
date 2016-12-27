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
        /*while (index < s.length) {
           int remain = s[index++];
           while(feeded < g.length) {
               if (remain >= g[feeded]) {
                   remain -= g[feeded];
                   feeded++;
               } else {
                   break;
               }
           }
           if (feeded >= g.length) {
               break;
           }
        }
        return feeded;*/
    }
}
