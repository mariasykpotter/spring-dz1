package beans1;

import beans4.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private OtherBeanA otherBean;

    @Autowired
    public BeanA(OtherBeanA otherbean) {
        otherBean = otherbean;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "otherBean=" + otherBean +
                '}';
    }
}
