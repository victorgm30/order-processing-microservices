**Order Processing Microservices**

Projeto desenvolvido para estudo de arquitetura de microserviços com Spring Boot e Docker.

**Arquitetura**

O sistema é composto por dois microsserviços:

order-service → Responsável pelo processamento de pedidos

payment-service → Responsável pelo processamento de pagamentos

O order-service se comunica com o payment-service via HTTP utilizando RestTemplate.

**Tecnologias Utilizadas:**

-Java 17

-Spring Boot

-Spring Data JPA

-H2 Database

-Maven

-Docker

-Docker Compose

**Arquitetura Aplicada:**

-Facade Pattern

-Factory Pattern

-Strategy Pattern (removido para arquitetura real de microsserviços)

-Separação de responsabilidades

-Comunicação entre serviços via REST

**Como executar com Docker:**

Na raiz do projeto:

docker compose up --build

A aplicação ficará disponível em:

http://localhost:8080

Endpoint principal

POST /orders

Exemplo de requisição:

{
  "type": "DIGITAL",
  "paymentMethod": "CREDIT_CARD",
  "amount": 150.0
}

**Objetivo**

Projeto criado para prática de arquitetura distribuída e containerização.


