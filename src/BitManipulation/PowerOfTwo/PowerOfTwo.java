package BitManipulation.PowerOfTwo;

public class PowerOfTwo {

    public boolean isPowerOfTwo(int input) {
        return ((input & (input - 1)) == 0);
    }
}
