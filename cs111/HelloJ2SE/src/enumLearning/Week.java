package enumLearning;

public enum Week {

  MONDAY("MON"), TUESDAY("TUES"), WEDNESDAY("WED"), THURSDAY("THUR"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

  private String abbr;

  private Week(String abbr) {
    this.abbr = abbr;
  }

  public String getAbbr() {
    return abbr;
  }

}
