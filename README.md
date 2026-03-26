# 🛍️ CRUD de Produtos - Loja Fitness

API REST desenvolvida com **Spring Boot** para gerenciamento de produtos de uma loja de roupas fitness.

Este projeto implementa operações completas de CRUD (Create, Read, Update, Delete) seguindo boas práticas de arquitetura em camadas.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## 📌 Funcionalidades

- ✅ Cadastro de produto
- ✅ Busca de produto por ID
- ✅ Listagem de produtos
- ✅ Atualização de produto
- ✅ Remoção de produto 

---

## 🧱 Arquitetura do projeto

O projeto segue o padrão de separação em camadas:

- **controller** → endpoints da API (entrada HTTP)
- **service** → regras de negócio
- **repository** → acesso ao banco de dados
- **entity** → entidades JPA
- **dto** → objetos de entrada e saída
- **exception** → tratamento de regras

---

## ⚙️ Como executar o projeto

1. Clone o repositório:
```bash
git clone https://github.com/Roddrigooo/crud-spring-boot-fitness.git