package lottery;

import java.util.Scanner;

public class LotteryTest {

  public static void main(String[] args) {
    Lottery l = new Lottery();
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input the number of lottery group(s) that you want to generate: ");
    String groupNum = scan.nextLine();
    l.generateLottery(groupNum);
  }

}
