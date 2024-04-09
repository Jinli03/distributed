/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 14:35
 */
package aop_hom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class TollGate {
    private final IocContainer container;

    @Autowired
    public TollGate(IocContainer container) {
        this.container = container;
    }

    public void charge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入车辆类型（Car、Bus、Truck）：");
        String vehicleType = scanner.nextLine();
        int distance = 0;
        System.out.println("请输入行驶里程数（公里）：");
        distance = scanner.nextInt();

//        if (vehicleType.equals("Car")) {
//            System.out.println("请输入行驶里程数（公里）：");
//            distance = scanner.nextInt();
//        } else if (vehicleType.equals("Bus")) {
//            System.out.println("请输入载客人数：");
//            int capacity = scanner.nextInt();
//            System.out.println("请输入行驶里程数（公里）：");
//            distance = scanner.nextInt();
//            Bus bus = (Bus) container.getBean(vehicleType);
//            bus.setCapacity(capacity);
//        } else if (vehicleType.equals("Truck")) {
//            System.out.println("请输入承载重量（吨）：");
//            int weight = scanner.nextInt();
//            System.out.println("请输入行驶里程数（公里）：");
//            distance = scanner.nextInt();
//            Truck truck = (Truck) container.getBean(vehicleType);
//            truck.setWeight(weight);
//        }

        Vehicle vehicle = container.getBean(vehicleType);
        double fee = vehicle.tollFee(distance);
        System.out.println("过路费金额：" + fee + "元");
    }
}
