package beans4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class OtherBeanC implements OtherBean{
    @Override
    public String toString() {
        return "otherBeanC";
    }
}
