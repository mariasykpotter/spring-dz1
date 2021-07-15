package beans1;

import beans4.OtherBeanB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private OtherBeanB otherBeanB;
    @Autowired
    public void setBean(OtherBeanB beanB){
        otherBeanB = beanB;
    }

    @Override
    public String toString() {
        return "BeanB{" +
                "otherBeanB=" + otherBeanB +
                '}';
    }
}
