package pl.eurogeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@SpringBootApplication
public class ZleceniaDw306Application {

	public static void main(String[] args) {
		SpringApplication.run(ZleceniaDw306Application.class, args);
	}
	
	 @Bean
	    public View jsonTemplate() {
	        MappingJackson2JsonView view = new MappingJackson2JsonView();
	        view.setPrettyPrint(false);
	        return view;
	    }
	     
	    @Bean
	    public ViewResolver viewResolver() {
	        return new BeanNameViewResolver();
	    }
}
