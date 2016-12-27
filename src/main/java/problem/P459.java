package problem;

public class P459 {
    public boolean repeatedSubstringPattern(String str) {
        for(int i = str.length() / 2; i >= 1; i--) {
            if (str.length() % i == 0) {
                int m = str.length() / i;
                String sub = str.substring(0, m);
                StringBuilder strB = new StringBuilder();
                for (int j = 0; j < m; j++) {
                    strB.append(sub);
                }
                if (strB.toString().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
