import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope("singleton")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="Cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat kot = new Cat();
        kot.setAge(10);
        kot.setName("Tom");
        return kot;
    }
}