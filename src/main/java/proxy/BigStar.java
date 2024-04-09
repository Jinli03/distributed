/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/4 17:31
 */
package proxy;

public class BigStar implements Star{
    private String name;
    public String sing (String name) {
        System.out.println(this.name + "正在唱" + name);
        return "谢谢";
    }
    public void dance (String name) {
        System.out.println(this.name + "正在跳" + name);
    }
    public BigStar(String name) {
        this.name = name;
    }
}
