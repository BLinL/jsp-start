package org.framework.jsp_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@SpringBootApplication
public class JspStartApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JspStartApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JspStartApplication.class, args);
	}


	@RequestMapping("/")
	public Map hello() {

		return Map.of("code", 0, "message", "hello world");
	}
}
