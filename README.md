# CRUD de Produtos - Loja Fitness

API REST desenvolvida com Spring Boot para gerenciamento de produtos de uma loja de roupas fitness.

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## Funcionalidades implementadas

- Cadastro de produto
- Busca de produto por ID

## Estrutura do projeto

- controller -> endpoints da API
- service -> regras de negócio
- repository -> acesso ao banco de dados
- entity -> entidades JPA
- dto -> objetos de entrada e saída
- exception -> tratamento de regras

## Como executar o projeto

1. Clone o repositório
2. Crie um banco MySQL chamado `loja_fitness`
3. Copie o arquivo `application-example.properties`
4. Crie `application.properties`
5. Preencha usuário e senha do banco
6. Execute a aplicação

## Endpoints

### Criar produto
POST /products

### Buscar por ID
GET /products/{id}

## Exemplo de JSON

```json
{
  "name": "Legging Fitness",
  "description": "Confortável para treino",
  "price": 129.90,
  "sku": "LEG-001",
  "category": "LEGGING",
  "size": "M",
  "color": "PRETO",
  "stock": 10
}