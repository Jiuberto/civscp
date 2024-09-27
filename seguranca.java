package java.mode;
package com.example.monitoramentoambiental.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/public/**").permitAll() // Exemplo: alterar conforme necessário
                .anyRequest().authenticated()
                .and()
                .httpBasic(); // Ou configure para usar login com formulário
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}



public class seguranca {
    extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .authorizeRequests()
                    .antMatchers("/disaster-alerts/**").hasRole("ADMIN")
                    .antMatchers("/air-quality/**").hasRole("USER")
                    .antMatchers("/water-quality/**").hasRole("USER")
                    .antMatchers("/irrigation-control/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                    .httpBasic();
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }
    }
6. Configuração do Banco de Dados
    Configure o banco de dados H2 no arquivo application.properties:

    properties
    Copiar código
# src/main/resources/application.properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.h2.console.enabled=true
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    spring.jpa.hibernate.ddl-auto=update
7. Executar o Projeto
    Agora você pode executar o projeto. Abra o IntelliJ IDEA, encontre a classe MonitoramentoAmbientalApplication e execute-a. O servidor Spring Boot será iniciado, e você poderá acessar os endpoints conforme definido nos controladores.

8. Testar os Endpoints
    Use ferramentas como Postman ou cURL para testar os endpoints. Por exemplo, para testar o endpoint de alertas de desastres:

    GET /disaster-alerts
    POST /disaster-alerts com um corpo JSON:
    json
    Copiar código
    {
        "type": "flood",
            "location": "Rio de Janeiro",
            "alertTime": "2024-05-24T14:30:00",
            "severity": "high"
    }
    Você pode seguir um processo semelhante para testar os outros endpoints de qualidade do ar, qualidade da água e controle de irrigação.

    Com isso, você terá um sistema básico de monitoramento











}
