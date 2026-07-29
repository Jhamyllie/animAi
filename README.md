# AnimAi <img src="https://github.com/Jhamyllie/animAi/raw/main/src/main/assets/download%20(9).jpeg" alt="emoji" width="30"/>

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5-6DB33F?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-316192?style=for-the-badge&logo=postgresql)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Render](https://img.shields.io/badge/Render-Deployed-46E3B7?style=for-the-badge&logo=render&logoColor=black)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)

API REST desenvolvida em **Java** e **Spring Boot** para gerenciamento de animes favoritos.

O projeto permite realizar operações completas de **CRUD (Create, Read, Update e Delete)** com persistência em banco de dados relacional, seguindo uma arquitetura organizada em camadas (**Controller, Service e Repository**).

---

## 🌐 Aplicação em produção

**API:** https://animai-f5fu.onrender.com/animes

O projeto está publicado na plataforma **Render**, utilizando **PostgreSQL** em produção, **Docker** para containerização e **deploy automático** via GitHub.

---

## 📖 Documentação da API

A documentação interativa está disponível através do **Swagger OpenAPI**.

- 🌐 **Produção:** https://animai-f5fu.onrender.com/swagger-ui/index.html
- 💻 **Ambiente Local:** http://localhost:8080/swagger-ui/index.html

---

## 🚀 Funcionalidades

- 📋 Listar todos os animes
- 🔍 Buscar anime por ID
- ➕ Cadastrar novos animes
- ✏️ Atualizar informações de um anime
- 🗑️ Remover animes do catálogo
- 💾 Persistência em banco de dados
- 📖 Documentação automática com Swagger/OpenAPI

---

## 🛠️ Tecnologias utilizadas

- Java 21
- Spring Boot 3.5
- Spring Web
- Spring Data JPA
- Bean Validation
- Lombok
- PostgreSQL
- H2 Database
- Maven
- Docker
- Render
- Swagger / OpenAPI

---

## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas para facilitar a manutenção e organização do código.

```
src
├── controller
├── service
├── repository
├── model
└── resources
```

Cada camada possui uma responsabilidade específica:

- **Controller:** recebe as requisições HTTP.
- **Service:** contém as regras de negócio.
- **Repository:** comunicação com o banco de dados.
- **Model:** entidades da aplicação.

---

## 📁 Estrutura do projeto

```
animAi
├── src
│   ├── main
│   │   ├── assets
│   │   ├── java
│   │   │   └── com
│   │   │       └── animAi
│   │   │           └── animAi
│   │   │               ├── config
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── AnimAiApplication.java
│   │   └── resources
│   └── test
├── Dockerfile
├── LICENSE
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

## ▶️ Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/Jhamyllie/animAi.git
```

Entre na pasta:

```bash
cd animAi
```

---

### 2. Configure o banco de dados

#### PostgreSQL

Configure o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/animAi
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
```

#### H2 Database

Caso prefira utilizar o banco em memória, basta utilizar a configuração já disponível no projeto.

Console H2:

```
http://localhost:8080/h2-console
```

---

### 3. Execute a aplicação

Com Maven:

```bash
./mvnw spring-boot:run
```

Ou execute a classe:

```
AnimAiApplication
```

---

## 📡 Endpoints

### Produção

```
https://animai-f5fu.onrender.com/animes
```

### Ambiente local

```
http://localhost:8080/animes
```

| Método | Endpoint | Descrição |
|---------|----------|-----------|
| GET | /animes | Lista todos os animes |
| GET | /animes/{id} | Busca um anime pelo ID |
| POST | /animes | Cadastra um novo anime |
| PUT | /animes/{id} | Atualiza um anime |
| DELETE | /animes/{id} | Remove um anime |

---

## 📝 Exemplo de requisição

### POST /animes

```json
{
  "nome": "Naruto",
  "genero": "Shounen",
  "episodios": 220
}
```

---

## 📚 Conceitos praticados

Durante o desenvolvimento deste projeto foram praticados conceitos como:

- Desenvolvimento de APIs REST;
- Arquitetura em camadas;
- CRUD completo;
- Persistência de dados com Spring Data JPA;
- Integração com PostgreSQL;
- Banco em memória utilizando H2;
- Validação de dados;
- Organização de projetos Java com Spring Boot;
- Documentação de APIs com Swagger/OpenAPI;
- Containerização com Docker;
- Deploy de aplicações Java na plataforma Render.

---

## 🚀 Melhorias futuras

- Implementar autenticação com Spring Security;
- Cadastro de usuários;
- Integração com API pública de animes;
- Desenvolvimento de uma interface web em React para consumir a API.

---

## 👩‍💻 Autora

**Jamile Santana da Silva**

- 💼 LinkedIn: https://www.linkedin.com/in/jamile-santana-da-silva
- 💻 GitHub: https://github.com/Jhamyllie