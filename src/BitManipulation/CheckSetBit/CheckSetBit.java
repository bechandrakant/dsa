package BitManipulation.CheckSetBit;

public class CheckSetBit {

    public boolean checkSetBit(int num, int position) {
        return ((num >> position) & 1) == 1;
    }

    public boolean checkSetBit2(int num, int position) {
        return (num & (1 << position)) != 0;
    }

    public boolean checkSetBit3(int num, int position) {
        return (num & (1 << position)) == (int)Math.pow(2, position);
    }

    public boolean checkSetBit4(int num, int position) {
        return (num & (1 << position)) == (1 << position);
    }


}
