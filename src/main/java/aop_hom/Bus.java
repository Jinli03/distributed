/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 14:22
 */
package aop_hom;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Data
@Component
public class Bus implements Vehicle{

    private int capacity;
    @Override
    public double tollFee(int distance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入人数");
        capacity = sc.nextInt();
        if(capacity > 20) {
            return 1.2 * distance;
        }else {
            return 1 * distance;
        }
    }
}
