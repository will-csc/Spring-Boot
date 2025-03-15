# Project-Spring-CRUD

## 📌 Sobre o Projeto
Este projeto é uma aplicação desenvolvida com **Spring Boot** e **MySQL**, utilizando **Spring Data JPA** para interação com o banco de dados. O principal objetivo desse repositório é criar a base para o conhecimento de Spring

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.2.2**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

## 🛠 Configuração do Ambiente
### **1️⃣ Pré-requisitos**
Antes de rodar o projeto, certifique-se de ter instalado:
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://dev.mysql.com/downloads/)

### **2️⃣ Configurar o Banco de Dados**
1. Crie um banco de dados MySQL:
   ```sql
   CREATE DATABASE project_crud;
   ```
2. No arquivo `application.properties`, configure as credenciais do banco:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/project_crud
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.format_sql=true
   ```

### **3️⃣ Instalar Dependências**
No terminal, rode o comando:
```sh
mvn clean install
```

### **4️⃣ Executar a Aplicação**
Para iniciar o projeto, execute:
```sh
mvn spring-boot:run
```

## 🛠 Contribuição
Em caso de algum erro ou alteração necessária entre em contato comigo, emita um issue ou pull request.
Contato: 11 969541207

