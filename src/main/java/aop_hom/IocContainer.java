/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/7 14:52
 */
package aop_hom;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class IocContainer {
    private final Car car;
    private final Bus bus;
    private final Truck truck;

    public Vehicle getBean(String vehicleType) {
        switch (vehicleType.toLowerCase()) {
            case "car":
                return car;
            case "bus":
                return bus;
            case "truck":
                return truck;
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + vehicleType);
        }
    }
}
