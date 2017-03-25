package highlight_spring.lesson2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args){
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(DiConfig.class);
//		UseFunctionService useFunctionService =
//				(UseFunctionService) context.getBean("useFunctionService");
		
		UseFunctionService useFunctionService =
			 context.getBean(UseFunctionService.class);
		
		System.out.println(useFunctionService.SayHello("world"));
		
		context.close();
	}

}
