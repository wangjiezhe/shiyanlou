package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
  public Map<String, Course> courses;

  public MapTest() {
    this.courses = new HashMap<String, Course>();
  }

  public void testPut() {
    @SuppressWarnings("resource")
    Scanner console = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.println("请输入课程 ID：");
      String ID = console.next();
      Course cr = courses.get(ID);
      if (cr == null) {
        System.out.println("请输入课程名称：");
        String name = console.next();
        Course newCourse = new Course(ID, name);
        courses.put(ID, newCourse);
        System.out.println("成功添加课程：" + courses.get(ID).name);
      } else {
        System.out.println("该课程 ID 已被占用");
        continue;
      }
    }

    // console.close();
  }

  public void testKeySet() {
    Set<String> keySet = courses.keySet();
    for (String crID : keySet) {
      Course cr = courses.get(crID);
      if (cr != null)
        System.out.println("课程：" + cr.name);
    }
  }

  public void testRemove() {
    @SuppressWarnings("resource")
    Scanner console = new Scanner(System.in);
    while (true) {
      System.out.println("请输入要删除的课程 ID！");
      String ID = console.next();
      Course cr = courses.get(ID);
      if (cr == null) {
        System.out.println("该 ID 不存在！");
        continue;
      }
      courses.remove(ID);
      System.out.println("成功删除课程" + cr.name);
      break;
    }

    // console.close();
  }

  public void testEntrySet() {
    Set<Entry<String, Course>> entrySet = courses.entrySet();
    for (Entry<String, Course> entry : entrySet) {
      System.out.println("取得键：" + entry.getKey());
      System.out.println("对应的值为：" + entry.getValue().name);
    }
  }

  public void testModify() {
    System.out.println("请输入要修改的课程 ID：");
    @SuppressWarnings("resource")
    Scanner console = new Scanner(System.in);
    while (true) {
      String crID = console.next();
      Course course = courses.get(crID);
      if (course == null) {
        System.out.println("该 ID 不存在！请重新输入！");
        continue;
      }
      System.out.println("当前该课程 ID，所对应的课程为：" + course.name);
      System.out.println("请输入新的课程名称：");
      String name = console.next();
      Course newCourse = new Course(crID, name);
      courses.put(crID, newCourse);
      System.out.println("修改成功！");
      break;
    }

    // console.close();
  }

  public static void main(String[] args) {
    MapTest mt = new MapTest();
    mt.testPut();
    mt.testKeySet();
    mt.testRemove();
    mt.testModify();
    mt.testEntrySet();
  }
}
