package example1.nvb.todolist.web.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Todo CRUD API Documentation")
                        .description("This is a simple CRUD API description for Todo list application.")
                        .version("1.0.0"));
    }

    @Bean
    public GroupedOpenApi publicAPI() {
        return GroupedOpenApi.builder()
                .group("todolist-api")
                .packagesToScan("example1.nvb.todolist")
                .build();
    }
}
