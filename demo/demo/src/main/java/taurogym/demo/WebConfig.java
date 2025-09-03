package taurogym.demo;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class WebConfig implements WebMvcConfigurer {

    @Override

    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/**")  // Permite CORS para todos los endpoints

                .allowedOrigins("http://127.0.0.1:5500")  // Asegúrate de agregar el puerto de tu web (5500 en este caso)

                .allowedMethods("GET", "POST", "PUT", "DELETE")

                .allowedHeaders("*"); // Permite todos los encabezados

    }

}

