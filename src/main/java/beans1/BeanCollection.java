package beans1;

import beans4.OtherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanCollection {
    private List<OtherBean> otherBeans;

    @Autowired
    BeanCollection(List<OtherBean> lst) {
        otherBeans = lst;
    }

    @Override
    public String toString() {
        return "BeanCollection{" +
                "otherBeans=" + otherBeans +
                '}';
    }
}
