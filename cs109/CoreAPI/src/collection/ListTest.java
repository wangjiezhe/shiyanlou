package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

  public List<Student> students;

  public ListTest() {
    this.students = new ArrayList<>();
  }

  public void testAdd() {
    Student st1 = new Student("1", "张三");
    students.add(st1);
    Student temp = students.get(0);
    System.out.println("添加了学生：" + temp.id + ":" + temp.name);

    Student st2 = new Student("2", "李四");
    students.add(0, st2);
    Student temp2 = students.get(0);
    System.out.println("添加了学生：" + temp2.id + ":" + temp2.name);

    Student[] student = { new Student("3", "王五"), new Student("4", "马六") };
    students.addAll(Arrays.asList(student));

    Student[] student2 = { new Student("5", "周七"), new Student("6", "赵八") };
    students.addAll(2, Arrays.asList(student2));
  }

  public void testGet() {
    int size = students.size();
    for (int i = 0; i < size; i++) {
      Student st = students.get(i);
      System.out.println("学生：" + st.id + ":" + st.name);
    }
  }

  public void testIterator() {
    Iterator<Student> it = students.iterator();
    System.out.println("有如下学生（通过迭代器访问）：");
    while (it.hasNext()) {
      Student st = it.next();
      System.out.println("学生：" + st.id + ":" + st.name);
    }
  }

  public void testForEach() {
    System.out.println("有如下学生（通过for each）：");
    for (Student st : students)
      System.out.println("学生：" + st.id + ":" + st.name);
  }

  public void testModify() {
    students.set(4, new Student("3", "吴酒"));
  }

  public void testRemove() {
    Student st = students.get(4);
    System.out.println("我是学生：" + st.id + ":" + st.name + "，我即将被删除");
    students.remove(st);
    System.out.println("成功删除学生！");
    testForEach();
  }

  public static void main(String[] args) {
    ListTest lt = new ListTest();
    lt.testAdd();
    lt.testGet();
    lt.testIterator();
    lt.testModify();
    lt.testForEach();
    lt.testRemove();
  }
}
