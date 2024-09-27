# Usar a imagem base do OpenJDK 11
FROM openjdk:11-jre-slim

# Definir o diretório de trabalho dentro do container
WORKDIR /app

# Copiar o arquivo .jar para o diretório de trabalho
COPY target/monitoramentoambiental.jar /app/monitoramentoambiental.jar

# Expor a porta que a aplicação utiliza
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "monitoramentoambiental.jar"]

# Projeto de Monitoramento Ambiental com Alertas de Desastres

Este é um sistema de monitoramento ambiental que emite alertas de desastres naturais, desenvolvido utilizando Spring Boot, JPA, e Spring Security. O sistema permite o cadastro, a consulta e a administração de alertas de desastres, bem como a autenticação e controle de acessos com diferentes níveis de permissão (usuários e administradores).

## Funcionalidades Principais
- Cadastro de Alertas de Desastres: Criação de alertas informando o tipo de desastre, localidade afetada e outros dados importantes.
- Consulta de Alertas: Usuários podem consultar os alertas cadastrados.
- Autenticação de Usuários: Sistema de login com controle de permissões para usuários e administradores.
- Administração de Alertas: Somente administradores podem alterar ou remover alertas existentes.
- Proteção de Rotas com Spring Security: Controle de acesso a determinadas funcionalidades com base nos papéis dos usuários.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Security
- Hibernate
- H2 Database (para testes)
- MySQL (para produção)
- Maven
- Swagger para documentação da API
- JUnit 5 para testes unitários
- Lombok (opcional)