package guru.springframework.beerclient.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

import static guru.springframework.beerclient.configs.WebClientProperties.BASE_URL;

@Configuration
public class WebConfig {

    @Bean
    public WebClient webClient() {
        return WebClient.builder()
                .baseUrl(BASE_URL)
                .build();
    }
}