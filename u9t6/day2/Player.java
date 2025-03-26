package u9t6.day2;

public class Player {

    private int score;

    public Player() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void increment(int amt) {
        score += amt;
    }

    // swaps array of two numbers
    // PRECONDITION: arr.length == 2
    public void swap1(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }


    // swaps array of two numbers
    // PRECONDITION: arr.length == 2
    public void swap2(int[] arr) {
        int[] temp = new int[2];
        temp[0] = arr[1];
        temp[1] = arr[0];
        arr = temp;
    }
}