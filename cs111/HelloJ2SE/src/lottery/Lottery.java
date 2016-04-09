package lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

  public List<String> getHeadNumber() {
    List<String> list = new ArrayList<>();
    String lotteryNumber = "";

    for (int i = 1; i < 36; i++)
      if (i < 10)
        list.add("0" + i + " ");
      else
        list.add("" + i + " ");

    int roundIndex = 0;
    List<String> lotteryList = new ArrayList<>();

    for (int j = 0; j < 5; j++) {
      int amount = list.size();
      Random r = new Random();
      roundIndex = r.nextInt(amount);
      lotteryNumber = list.get(roundIndex);
      lotteryList.add(lotteryNumber);
      list.remove(roundIndex);
    }

    Collections.sort(lotteryList);
    return lotteryList;
  }

  public List<String> getRearNumber() {
    List<String> list = new ArrayList<>();
    String lotteryNumber = "";
    for (int i = 1; i < 13; i++)
      if (i < 10)
        list.add("0" + i + " ");
      else
        list.add("" + i + " ");

    int roundInex = 0;
    List<String> lotteryList = new ArrayList<>();
    for (int j = 0; j < 2; j++) {
      int amount = list.size();
      Random r = new Random();
      roundInex = r.nextInt(amount);
      lotteryNumber = list.get(roundInex);
      lotteryList.add(lotteryNumber);
      list.remove(roundInex);
    }

    Collections.sort(lotteryList);
    return lotteryList;
  }

  public void generateLottery(String groupNum) {
    int groupNumber = 0;
    groupNumber = Integer.parseInt(groupNum);
    StringBuilder sBuilder = new StringBuilder();
    for (int i = 0; i < groupNumber; i++) {
      List<String> startList = getHeadNumber();
      List<String> endList = getRearNumber();
      for (int m = 0; m < startList.size(); m++)
        sBuilder.append(startList.get(m));
      sBuilder.append("\t");
      for (int n = 0; n < endList.size(); n++)
        sBuilder.append(endList.get(n));
      sBuilder.append("\n");
    }

    System.out.println(sBuilder.toString());
  }

}
