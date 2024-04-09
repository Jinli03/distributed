/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 14:27
 */
package aop_hom;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Data
@Component
public class Truck implements Vehicle{

    private int weight;

    @Override
    public double tollFee(int distance) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入重量");
        weight = sc.nextInt();
        return 1 * weight * distance;
    }
}
