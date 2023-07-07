# Projeto Java Web no Spring Boot 2023
> Este repositório tem seu propósito o estudo da linguagem #JAVA e seu framework #SPRINGBOOT onde este foi replicado do canal DEV SUPERIOR no YouTube para entendimento dos conceitos passados pelo autor.

Credito deste projeto: 

https://github.com/devsuperior




<h2>=> REDES SOCIAIS </h2>

[![INSTAGRAM](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/marcos_lenilson/)
[![LINKEDIN](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcos-lenilson/)
[![TIKTOK](https://img.shields.io/badge/TikTok-000000?style=for-the-badge&logo=tiktok&logoColor=white)](https://www.tiktok.com/@marcos_futurodev)
[![GMAIL](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:marcoslenilsondev@gmail.com)

<br>

## Estudo de Caso - Exercício 01
![SPRING](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
### Pré-requisitos

- Lógica de programação (qualquer linguagem)
- Programação orientada a objetos (qualquer linguagem)
- Ferramentas
  - ![STS](https://img.shields.io/badge/SPRING-TOOL-%2311AB00.svg?&style=for-the-badge&logo=STS&logoColor=white)![STS](https://img.shields.io/badge/SUITE-%2311AB00.svg?&style=for-the-badge&logo=STS&logoColor=white)
  - ![POSTMAN](https://img.shields.io/badge/Postman-FC8019?style=for-the-badge&logo=Postman&logoColor=white)

### Objetivos da aula

- Resgatar fundamentos de programação
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado
- Dar mais um passo em direção à preparação para o mercado
  
### Visão geral do sistema

Fazer uma API Rest que disponibilize o endpoint /products para por meio do qual pode-se obter uma lista de produtos
com suas respectivas categorias. Os produtos podem ser instanciados "hard code". 
Segue o Diagrama de Classe usado:

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Passos da aula

- Criar o projeto
- Implementar o modelo de domínio
- Criar o modelo relacional entre as entidades
- Criar os endpoints da API REST

--------------------------------------------------------------------------------------------------------------------------

## Estudo de Caso - Exercício 02
API REST com banco de dados usando Java e Spring Boot 

### Pré-requisitos

- Lógica de programação (qualquer linguagem)
- Programação orientada a objetos (qualquer linguagem)
- Ferramentas
  - ![STS](https://img.shields.io/badge/SPRING-TOOL-%2311AB00.svg?&style=for-the-badge&logo=STS&logoColor=white)![STS](https://img.shields.io/badge/SUITE-%2311AB00.svg?&style=for-the-badge&logo=STS&logoColor=white)
  - ![POSTMAN](https://img.shields.io/badge/Postman-FC8019?style=for-the-badge&logo=Postman&logoColor=white)

### Objetivos da aula

- Resgatar fundamentos de programação
- Colocar em prática esses fundamentos
- Criar um pequeno sistema com ferramentas e práticas de mercado
- Dar mais um passo em direção à preparação para o mercado

### Visão geral do sistema

Vamos construir um pequeno sistema (API REST) de usuários e departamentos, com os seguintes casos de uso:

- Buscar todos usuários
- Buscar um usuário pelo seu id
- Inserir um novo usuário

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/dominio.png "Modelo conceitual")

### Desenvolvimento moderno: relacional -> objeto -> json

![Image](https://raw.githubusercontent.com/devsuperior/java-web-spring-2022/main/img/objetos.png "Objetos")

### Passos da aula

- Criar o projeto
- Implementar o modelo de domínio
- Mapeamento objeto-relacional com JPA
- Configurar o banco de dados H2
- Criar os endpoints da API REST

### Trechos de código para copiar

#### Configuração do Maven Resources Plugin

```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-resources-plugin</artifactId>
	<version>3.1.0</version>
</plugin>
```

#### Configurações do banco de dados

```
# Dados de conexão com o banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

# Configuração do cliente web do banco H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

# Configuração para mostrar o SQL no console
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

#### Script SQL

```sql
INSERT INTO tb_department(name) VALUES ('Gestão');
INSERT INTO tb_department(name) VALUES ('Informática');

INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Maria', 'maria@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (1, 'Bob', 'bob@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Alex', 'alex@gmail.com');
INSERT INTO tb_user(department_id, name, email) VALUES (2, 'Ana', 'ana@gmail.com');
```
#### Collection Postman

https://www.getpostman.com/collections/ac4a49113c4024e47d4f
