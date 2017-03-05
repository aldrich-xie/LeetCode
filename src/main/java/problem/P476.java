package problem;

public class P476 {
    public int findComplement(int num) {
        int total = 0;
        int pow = 1;
        int length = Integer.toBinaryString(num).length();
        for (int i = 0; i< length; i++) {
            if ((1 & num) == 0) {
                total += pow;
            }
            num = num >> 1;
            pow *= 2;
        }
        return total;
    }
}
