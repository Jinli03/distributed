/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/6 18:53
 */
package proxy_hom;

public class Division implements Calculator{

    public int divide(int a, int b){

        int result = -1;
        try{
            System.out.println("开始计算.....");
            result = a / b;
            System.out.println("计算完毕.....");
            return result;
        }catch(Exception e){ }

        return result;

    }

}
