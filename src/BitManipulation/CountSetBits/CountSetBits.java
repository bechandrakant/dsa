package BitManipulation.CountSetBits;

public class CountSetBits {

    public int countSetBits(int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((num & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }

    public int countSetBits2(int num) {
        int count = 0;
        while(num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public int countSetBits3(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num & (num - 1);
        }
        return count;
    }

}
