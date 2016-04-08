package util;

import java.util.Date;

public class DateDemo {

  public static void main(String[] args) {
    String strDate, strTime = "";
    Date objDate = new Date();
    System.out.println("Today's date is: " + objDate);
    long time = objDate.getTime();
    System.out.println("Time interval from 1970-01-01 to now(GMT) (millisecond): " + time);
    strDate = objDate.toString();
    strTime = "Time: " + strDate.substring(0, 8);
    System.out.println(strTime);
  }
}
