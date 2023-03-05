import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Furniture table = context.getBean("furniture", Furniture.class);
        System.out.println(table);
        System.out.println("Название мебели " + table.getName());

        context.close();
    }
}
