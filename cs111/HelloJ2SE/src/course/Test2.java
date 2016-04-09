package course;

import java.io.File;
import java.lang.reflect.Constructor;

public class Test2 {

  public static void main(String[] args) {
    try {
      Constructor<File> constructor = File.class.getDeclaredConstructor(String.class);
      System.out.println("Create File Object with reflection.");
      File file = constructor.newInstance("/tmp/MyFile.txt");
      System.out.println("Use File Object to create MyFile.txt in /tmp.");
      file.createNewFile();
      System.out.println("File is created? " + file.exists());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
