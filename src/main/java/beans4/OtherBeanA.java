package beans4;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Primary
@Order(3)
public class OtherBeanA implements OtherBean{
    @Override
    public String toString() {
        return "otherBeanA";
    }
}
