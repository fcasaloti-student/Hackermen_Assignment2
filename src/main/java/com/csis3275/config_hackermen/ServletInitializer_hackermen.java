package com.csis3275.config_hackermen;

/**
 * @author Hackermen
 * Oct 05th 2020
 */
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//Servlet initializer to instruct Spring to start the servlet application
public class ServletInitializer_hackermen implements WebApplicationInitializer {
	
	public void onStartup(ServletContext container) throws ServletException {
	
		// Pull configuration class for our application
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(SpringMVCConfig_hackermen.class);
		ctx.setServletContext(container);
		
		// Dispatcher to deal with http requests
		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	
	}
}
