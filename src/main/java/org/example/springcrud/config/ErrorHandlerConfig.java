package org.example.springcrud.config;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
@Configuration
public class ErrorHandlerConfig {
    @Bean
    public HandlerExceptionResolver errorHandler() {
        return new HandlerExceptionResolver() {
            @Override
            public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response,
                                                 Object handler, Exception ex) {
                ModelAndView model = new ModelAndView("error-page");
                model.addObject("exception", ex);
                model.addObject("handler", handler);
                return model;
            }
        };
    }
}
