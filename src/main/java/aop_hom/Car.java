/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 14:21
 */
package aop_hom;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    @Override
    public double tollFee(int distance) {

        return 0.5 * distance;
    }
}
