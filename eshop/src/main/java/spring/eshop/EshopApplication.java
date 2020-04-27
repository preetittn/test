package spring.eshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EshopApplication {

	@GetMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping("/admin/home")
	public String adminHome(){
		return "Admin home";
	}

	@GetMapping("/customer/home")
	public String userHome(){
		return "Customer home";
	}

	@GetMapping("/seller/home")
	public String sellerHome(){
		return "seller home";
	}

	public static void main(String[] args) {
		SpringApplication.run(EshopApplication.class, args);
	}

}
