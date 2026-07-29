package com.animAi.animAi.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()

                .info(new Info()

                        .title("AnimAi API")

                        .version("1.0.0")

                        .description("""
                                API REST desenvolvida em Java e Spring Boot
                                para gerenciamento de animes favoritos.
                                """)
                        .contact(new Contact()

                                .name("Jamile Santana da Silva")

                                .url("https://github.com/Jhamyllie")

                                .email("SEU_EMAIL")) // opcional

                        .license(new License()

                                .name("MIT")

                                .url("https://opensource.org/licenses/MIT")))

                .externalDocs(new ExternalDocumentation()

                        .description("Repositório no GitHub")

                        .url("https://github.com/Jhamyllie/animAi"));
    }

}