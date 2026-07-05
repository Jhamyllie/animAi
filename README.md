# AnimAi <img src="https://github.com/Jhamyllie/animAi/raw/main/src/main/assets/download%20(9).jpeg" alt="emoji" width="30"/>


API REST desenvolvida em **Java** e **Spring Boot** para gerenciamento de animes favoritos.

O projeto permite realizar operações completas de **CRUD (Create, Read, Update e Delete)** com persistência em banco de dados relacional, seguindo uma arquitetura organizada em camadas (**Controller, Service e Repository**).

---

## 🚀 Funcionalidades

- 📋 Listar todos os animes
- 🔍 Buscar anime por ID
- ➕ Cadastrar novos animes
- ✏️ Atualizar informações de um anime
- 🗑️ Remover animes do catálogo
- 💾 Persistência em banco de dados

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
│   │   ├── java
│   │   └── resources
│   └── test
├── pom.xml
├── mvnw
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

Base URL

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
- Organização de projetos Java com Spring Boot.

---

## 🚀 Melhorias futuras

- Implementar autenticação com Spring Security;
- Cadastro de usuários;
- Documentação da API com Swagger/OpenAPI;
- Integração com API pública de animes;
- Desenvolvimento de uma interface web em React para consumir a API.

---

## 👩‍💻 Autora

**Jamile Santana da Silva**

- 💼 LinkedIn: https://www.linkedin.com/in/jamile-santana-da-silva
- 💻 GitHub: https://github.com/Jhamyllie
