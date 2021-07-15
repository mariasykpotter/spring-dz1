import beans1.BeanA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        AnnotationConfigApplicationContext ac2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        //Task1
        System.out.println(ac1.containsBean("beanA"));
        System.out.println(ac1.containsBean("beanB"));
        System.out.println(ac1.containsBean("beanC"));
        System.out.println(ac2.containsBean("roseFlower"));
        System.out.println(ac2.containsBean("catAnimal"));
        System.out.println(ac2.containsBean("narcissusFlower"));
        System.out.println(ac2.containsBean("beanD"));
        System.out.println(ac2.containsBean("beanE"));
        System.out.println(ac2.containsBean("beanF"));
        //Task2
        System.out.println(ac1.getBean("beanA"));
        System.out.println(ac1.getBean("beanB"));
        System.out.println(ac1.getBean("beanC"));
        //Task3
        System.out.println(ac1.getBean("beanCollection"));
        //Task4
        System.out.println(ac1.getBean("beanGathered"));

    }
}