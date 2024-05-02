import java.util.*;

public class Student1

{

String name;

int age;

String address;

public Student1()

{

this.name="unknown";

this.age=0;

this.address="not avaliable";

}

public void setinfo(int age,String name)

{

this.name=name;

this.age=age;

}

public void setinfo(int age ,String name,String address)

{

this.name=name;

this.age=age;

this.address=address;

}

@Override

public String toString()

{

return "Student1 [name=" + name + ", age=" + age + ", address=" + address + "]";

}

public static void main(String[] args)

{

List<Student1> stu=new ArrayList<>();

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.add(new Student1());

stu.get(0).setinfo(1, "Vaishnavi");

stu.get(2).setinfo(2, "Srujal","Shedbal,India");

stu.get(3).setinfo(3, "Tejas","Bagalkot,India");

stu.get(5).setinfo(4, "Tt","Sindhadurg,India");

stu.get(6).setinfo(5, "Palak","Nipani,India");

stu.get(8).setinfo(6, "Yogita");

for(Student1 s :stu)

{

System.out.println(s);

}

}

}