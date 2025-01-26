### **Sistema de Blog**

---

# **Sistema de Blog**

Esse é um projeto de Blog com posts vindo do usuário. O projeto foi feito com o propósito de praticar minhas habilidades com Spring Boot e NoSQL através do curso do Nélio Alves.

---

## **Arquitetura do Projeto**

A arquitetura do projeto é a **Arquitetura em camadas** para o backend. 

### **Estrutura Geral**
```
SpringBlog/
  ├── MidnightBlog/
  │   ├── pom.xml
  │   ├── src/
  │     ├── main/
  │         ├── java/com/guilherme/SpringBlog/MidnightBlog
  │             ├── config/
  │             ├── domain/
  │             ├── dto/
  │             ├── repository/
  │             ├── resources/
  │             ├── services/
  │             ├── MidnightBlogApplication.java/
  │         ├── resources/
  │             ├── application.properties
  │     ├── test/
  └── README.md
```

### **Backend: Detalhes**
- **`config`**: Configuração principal da aplicação com recursos para teste do projeto.
- **Domínio (`domain/`)**: Define as entidades da aplicação, sendo elas o Post e o User.
- **DTOs (`dto/`)**: Contém os objetos DTO de Post e User.
- **Acesso ao Repositório (`repository/`)**: Classes responsáveis por gerenciar todo o acesso ao bando de dados e suas operações básicas de CRUD.
- **Controladores (`resources/`)**: Resonsável por receber dados e fornecer os endpoints para o usuário da API.
- **Serviços (`services/`)**: Responsável pelas regras de negócio da aplicação.

---

## **Funcionalidades**
### **Backend**
- Gerenciamento de usuários: Lista, cria, edita e exclui usuários.
- Cadastro de posts: Listagem de posts de múltiplas formas.

---

## **Instalação**

### **Clonar o Repositório**
```bash
git clone https://github.com/GuilhermeCustodioNieto/Spring-Blog.git
cd gerenciamento-de-treinos
```

### **Configuração do Backend**
1. Navegue para a pasta do backend:
   ```bash
   cd .\MidnightBlog\src\main\resources\
   ```

2. Crie o arquivo `application.properties` com os dados da aplicação:
   ```properties
    spring.application.name=MidnightBlog
    server.port=${port:porta-do-servidor}
    spring.data.mongodb.uri=mongodb://localhost:27017/NomeDoSeuBanco
   ```
3. Execute o arquivo 'MidnightBlog.java'

---

## **Rotas da API**
**Usuário**
- `GET /users`: Lista todos os usuários.
- `GET /users/:id`: Encontra um usuário através do id.
- `POST /users`: Adiciona um novo usuário.
- `PUT /users/:id`: Atualiza um usuário.
- `DELETE /users/:id`: Remove um usuário.

**Posts**
- `GET /posts`: Lista todos os exercícios.
- `GET /posts/:id`: Encontra um usuário através do id.
- `GET /posts/titlesearch?text=titulo`: Procura pelos posts através do seu título.
- `GET /users/:id/posts`: Encontra todos os posts de um usuário.

---

## **Tecnologias Utilizadas**
### **Backend**
- Java
- SpringBoot
- MongoDB

---

## **Contribuição**
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do projeto.
2. Crie uma branch para a feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça suas alterações e envie um pull request.

---

## **Autor**
Desenvolvido por [Guilherme Custódio Nieto](https://www.linkedin.com/in/guilherme-cust%C3%B3dio-nieto/). 🚀