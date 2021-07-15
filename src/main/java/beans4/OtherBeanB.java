package beans4;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class OtherBeanB implements OtherBean{
    @Override
    public String toString() {
        return "otherBeanB";
    }
}
