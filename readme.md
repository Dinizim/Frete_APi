# 🚚 Frete API

API REST desenvolvida com **Java 21 e Spring Boot** para cálculo de fretes a partir de CEP, peso e tipo de envio.

O projeto foi desenvolvido com o objetivo de **aperfeiçoar conhecimentos em Java e Spring Boot**, aplicando na prática conceitos de desenvolvimento Backend, integração com APIs externas e padrões de projeto.

---

## 🛠️ Tecnologias

- Java 21
- Spring Boot
- Spring Web
- Spring Validation
- Maven
- REST
- JSON
- ViaCEP

---

## 📚 Conceitos aplicados

Durante o desenvolvimento, foram trabalhados conceitos como:

- Arquitetura REST
- HTTP e JSON
- Controllers
- DTOs utilizando `record`
- Injeção de dependências
- Bean Validation
- Validação customizada
- Integração com API externa
- Facade Pattern
- Strategy Pattern
- Tratamento global de exceções

---

## 🏗️ Estrutura do projeto

```text
src/main/java/com/nicollas/frete_api/

├── controller
│   └── FreteController
│
├── dto
│   ├── CepResponse
│   ├── FreteRequest
│   ├── FreteResponse
│   └── TipoFrete
│
├── facade
│   └── FreteFacade
│
├── service
│   ├── CepService
│   ├── FreteCalculadora
│   ├── FreteExpresso
│   ├── FreteNormal
│   └── FreteService
│
├── validation
│   ├── CepValidator
│   └── ValidCep
│
└── exception
    └── GlobalExceptionHandler
