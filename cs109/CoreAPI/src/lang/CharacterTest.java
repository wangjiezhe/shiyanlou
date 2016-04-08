package lang;

public class CharacterTest {

  public static void main(String[] args) {
    int count;
    char[] values = { '*', '_', '%', '8', 'L', '1' };
    for (count = 0; count < values.length; count++) {
      if (Character.isDigit(values[count]))
        System.out.println(values[count] + " is a number");
      if (Character.isLetter(values[count]))
        System.out.println(values[count] + " is a letter");
      if (Character.isUpperCase(values[count]))
        System.out.println(values[count] + " is uppercase");
      if (Character.isLowerCase(values[count]))
        System.out.println(values[count] + " is lowercase");
      if (Character.isUnicodeIdentifierStart(values[count]))
        System.out.println(values[count] + " is a first valid character of Unicode");
    }
  }

}
