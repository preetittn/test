package Springboot.Springbootsec4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootsec4webApplication
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext=SpringApplication.run(Springbootsec4webApplication.class, args);
		for(String name:applicationContext.getBeanDefinitionNames())
		{
			System.out.println(name);
		}
	}
}
