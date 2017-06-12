package com.trouvere.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class WebConfig extends WebMvcConfigurerAdapter {
	public WebConfig() {
		super();
	}

	// @Bean
	// public UrlBasedViewResolver getViewResolver() {
	// UrlBasedViewResolver resolver = new UrlBasedViewResolver();
	// resolver.setPrefix("/static/");
	// resolver.setSuffix(".html");
	// resolver.setViewClass(JstlView.class);
	// return resolver;
	// }

	// // Swager
	// @Override
	// public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
	//
	// registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	// }
	//
	// @Bean
	// public Docket api() {
	// return new
	// Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
	// .paths(PathSelectors.any()).build();
	// }

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		// registry.addMapping("/**").allowedOrigins("http://localhost:3000");

	}

}
