/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 16:37
 */
package annotation;

@MyTest3(value = "蜘蛛精", aaa = 999, bbb = {"机器人", "原神"})
public class Demo {

    @MyTest3(value = "牛魔王", aaa = 99, bbb = {"汽车人", "威震天"})
    public void test1() {

    }
}
