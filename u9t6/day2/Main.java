package u9t6.day2;

public class Main {
    public static void main(String[] args) {
        // A. What will the following print?
        Player p1 = new Player();
        Player p2 = new Player();
        p1.increment(10);
        p2.increment(20);

        Player[] players = {p1, p2};
        for (int i = 0; i < players.length; i++) {
            Player current = players[i];
            current.increment(5);
        }
        System.out.println(p1.getScore()); // ?
        System.out.println(p2.getScore()); // ?

        Player[] players2 = {p1, p2};
        for (int i = 0; i < players2.length; i++) {
            Player current = players2[i];
            current = new Player();
        }
        System.out.println(p1.getScore()); // ?
        System.out.println(p2.getScore()); // ?

        // B. What will the following print?
        Player someone = new Player();
        int[] nums = {3, 6};
        someone.swap1(nums);
        for (int num : nums) {
            System.out.print(num + " "); // ?
        }
        System.out.println();

        int[] sameNums = {3, 6};
        someone.swap2(sameNums);
        for (int num : sameNums) {
            System.out.print(num + " "); // ?
        }
    }
}