package com.mkyong;

import spark .ModelAndView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import spark.TemplateEngine;
//import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
//		get("/hello", (request, response) -> {
//			Map<String, Object> model = new HashMap<>();
//			model.put("Title", "三聯式發票");
//			return new ModelAndView(model, "application.properties");
//		}, new VelocityTemplateEngine());
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}