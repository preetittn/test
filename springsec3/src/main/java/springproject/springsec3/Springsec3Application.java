package springproject.springsec3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springsec3Application {

	public static void main(String[] args) {

//		BinarySearch binarySearch=new BinarySearch(new BubbleSortAlgo());//khud binary search aur bubble sort ka bean na
//											banakar aur wire nhi kari ...spring ko bola ki tu kar
//		System.out.println(search);


		//Application Context
		ApplicationContext applicationContext=
				SpringApplication.run(Springsec3Application.class, args);//from application context i would return a bean

		BinarySearch binarySearch=applicationContext.getBean(BinarySearch.class);//binarysearch ki bean hame spring de raha h
		int search = binarySearch.binarySearch(new int[]{12, 4, 8}, 3);

		System.out.println(search);
	}

}
