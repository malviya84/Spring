package comm.infinite.sol.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyExampleMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		PropertyExampleBean bean = (PropertyExampleBean) context.getBean("propertyExampleBean");
		
		System.out.println(bean);
		
		System.out.println("Done!");
	}
}
