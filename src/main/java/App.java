import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        Cat tempCat1 = (Cat) applicationContext.getBean("Cat");
        Cat tempCat2 = (Cat) applicationContext.getBean("Cat");
        System.out.println(bean == bean2);
        System.out.println(tempCat1 == tempCat2);
    }
}