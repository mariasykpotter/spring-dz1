package beans1;

import beans4.OtherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanC{
    @Autowired
    @Qualifier("otherBeanC")
    public OtherBean otherBeanC;

    @Override
    public String toString() {
        return "BeanC{" +
                "otherBeanC=" + otherBeanC +
                '}';
    }
}
