/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/3 21:37
 */
package reflect;

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //有参构造类
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造器执行了");
    }

    //无参构造类
    public Cat() {
        System.out.println("无参构造器执行了");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void run() {
        System.out.println("跑的贼快");
    }

    private String eat(String name) {
        return "吃的" + name;
    }
}
