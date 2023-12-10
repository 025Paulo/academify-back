package br.com.academify2;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class AcademifyConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/api/**")  // Ajuste o padrão de URL conforme necessário
                    .allowedOrigins("http://localhost:4200")  // Permita apenas essa origem
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Métodos permitidos
                    .allowedHeaders("Origin", "Content-Type", "Accept")  // Cabeçalhos permitidos
                    .allowCredentials(true);  // Permite credenciais (cookies, por exemplo)
    }
}