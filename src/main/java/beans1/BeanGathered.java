package beans1;

import beans4.OtherBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanGathered {
    private OtherBean otherbeanA;
    private OtherBean otherbeanB;
    private OtherBean otherbeanC;

    @Autowired
    BeanGathered(OtherBean bean1, @Qualifier("otherBeanB") OtherBean bean2, @Qualifier("otherBeanC") OtherBean bean3) {
        otherbeanA = bean1;
        otherbeanB = bean2;
        otherbeanC = bean3;
    }

    @Override
    public String toString() {
        return "BeanGathered{" +
                "otherbeanA=" + otherbeanA +
                ", otherbeanB=" + otherbeanB +
                ", otherbeanC=" + otherbeanC +
                '}';
    }
}
