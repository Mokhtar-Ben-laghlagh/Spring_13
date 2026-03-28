package Spring.TP13.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // URLs accessibles sans être connecté
                        .requestMatchers("/", "/login**", "/oauth2/**", "/error").permitAll()
                        // Tout le reste nécessite d'être authentifié
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth2 -> oauth2
                        // On enlève .loginPage("/login") pour utiliser le flux OAuth2 par défaut
                        .defaultSuccessUrl("/profile", true)   // Après connexion Google → profil
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .deleteCookies("JSESSIONID")
                );

        return http.build();
    }
}