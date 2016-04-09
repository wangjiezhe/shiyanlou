package enumLearning;

public class EnumPractice {

  public static void main(String[] args) {

    for (Week week : Week.values()) {
      System.out.println("The order of " + week + " is " + week.ordinal());
      System.out.println("Compare to MONDAY : " + week.compareTo(Week.MONDAY));
      System.out.println("Equal to MONDAY ? " + week.equals(Week.MONDAY));
      System.out.println("Equal to MONDAY by == ? " + (week == Week.MONDAY));
      System.out.println("Name : " + week.name());
      System.out.println("Abbrivation : " + week.getAbbr());
      System.out.println("-------------------");
    }
  }

}
