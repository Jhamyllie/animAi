# AnimAi <img src="https://github.com/Jhamyllie/animAi/raw/main/src/main/assets/download%20(9).jpeg" alt="emoji" width="30"/>


API REST desenvolvida em **Java + Spring Boot** para catalogar e gerenciar animes favoritos.  
Permite realizar operações de **CRUD** (Create, Read, Update, Delete) em animes, com persistência em banco de dados.

---

## 📌 Funcionalidades

- **Listar** todos os animes
- **Buscar** anime por ID
- **Criar** um novo anime
- **Atualizar** anime existente
- **Deletar** anime por ID

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.5.5**
    - Spring Web
    - Spring Data JPA
    - Validation
- **Lombok**
- **Banco de dados**
    - H2 Database (para testes em memória)
    - PostgreSQL (produção/desenvolvimento)

---


## Estrutura de Pastas

```bash
animAi
├── .idea
├── .mvn
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── animAi
│   │   │           └── animAi
│   │   │               ├── controller
│   │   │               ├── model
│   │   │               ├── repository
│   │   │               ├── service
│   │   │               └── AnimAiApplication.java
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       └── application.properties
│   └── test
├── target
├── .env
├── .env.example
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java 21+](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [PostgreSQL](https://www.postgresql.org/download/) (se não quiser usar H2 em memória)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou [VS Code](https://code.visualstudio.com/) com extensão Java

---

## 🚀 Como Rodar o Projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/seu-usuario/animAi.git
cd animAi
```
### 2. Configurar o banco de dados

- **Usando PostgreSQL**

No arquivo application.properties, configure suas credenciais:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/animAi
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

- **Usando H2 (memória)**

Basta descomentar as linhas já configuradas no application.properties.

O console do H2 estará em:
http://localhost:8080/h2-console

### 3. Rodar a aplicação

- No terminal:

``./mvnw spring-boot:run``


Ou, no IntelliJ/VSCode, execute a classe `AnimAiApplication`.

## Endpoints da API

Base URL: http://localhost:8080/animes

| Método | Endpoint       | Descrição                 |
| ------ | -------------- | ------------------------- |
| GET    | `/animes`      | Listar todos os animes    |
| GET    | `/animes/{id}` | Buscar anime por ID       |
| POST   | `/animes`      | Criar novo anime          |
| PUT    | `/animes/{id}` | Atualizar anime existente |
| DELETE | `/animes/{id}` | Deletar anime por ID      |

### Exemplo de JSON para criação

```json
{
  "nome": "Naruto",
  "genero": "Shounen",
  "episodios": 220
}
```

## Implementações futuras

- Cadastro  de usuário
- Autenticação
- Integração com API externa
- Construçao da interface do usuário(Frontedn)
