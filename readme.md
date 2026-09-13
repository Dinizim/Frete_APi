🚚 Frete API

API REST desenvolvida com Spring Boot para cálculo de fretes a partir de CEP, peso e tipo de envio.

O projeto foi desenvolvido com foco em aprendizado e aplicação prática de conceitos importantes do ecossistema Spring, como REST, validação, integração com APIs externas, Facade e Strategy Pattern.

🛠️ Tecnologias

Java 21

Spring Boot

Spring Web

Spring Validation

Maven

REST

JSON

ViaCEP

📚 Conceitos aplicados

Arquitetura REST

HTTP e JSON

Controllers

DTOs utilizando record

Injeção de dependências

Bean Validation

Validação customizada

Integração com API externa

Facade Pattern

Strategy Pattern

Tratamento global de exceções

🏗️ Estrutura

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

🔄 Fluxo da aplicação

Cliente
   ↓
FreteController
   ↓
FreteFacade
   ├──→ CepService → ViaCEP
   │
   └──→ FreteService
           ↓
      Strategy Pattern
       ↙           ↘
FreteNormal    FreteExpresso

O FreteFacade coordena o fluxo da operação, enquanto o FreteService utiliza diferentes estratégias para realizar o cálculo de acordo com o tipo de frete.

📌 Endpoint

Calcular frete

POST /fretes
Content-Type: application/json

Request

{
    "cepOrigem": "12245000",
    "cepDestino": "01310100",
    "peso": 4.5,
    "tipo": "NORMAL"
}

Response

{
    "origem": "São José dos Campos - SP",
    "destino": "São Paulo - SP",
    "peso": 4.5,
    "valor": 44.82,
    "prazoDias": 3
}

🚛 Tipos de frete

NORMAL

Valor: peso × 9,96

Prazo: 3 dias

![Normal Frete](Normal.png)

EXPRESSO

Valor: peso × 15,00

Prazo: 1 dia

![Expresso Frete](EXPRESSO.png)

🔎 Integração com ViaCEP

A API utiliza o serviço ViaCEP para consultar os dados dos CEPs de origem e destino.

A partir dessas informações, a aplicação retorna a cidade e o estado correspondentes no resultado do cálculo.

✅ Validações

A API possui validações para:

CEP obrigatório

CEP com formato válido

Peso maior que zero

Tipo de frete válido

Também foi implementada uma validação customizada utilizando Bean Validation para os CEPs.

📛 Tratamento de Erros

A API implementa um tratamento global de exceções com respostas padronizadas em JSON:

![Erro Response](ERROR.png)

🎯 Objetivo

O principal objetivo deste projeto foi colocar em prática conceitos de desenvolvimento backend com Java e Spring Boot através de uma aplicação pequena e funcional.

Mais do que criar apenas uma API de cálculo de frete, o projeto foi utilizado como estudo prático de padrões de projeto e construção de APIs REST.

▶️ Como executar

Clone o projeto:

git clone <URL_DO_REPOSITORIO>

Entre na pasta:

cd frete-api

Execute com Maven:

./mvnw spring-boot:run

No Windows:

mvnw.cmd spring-boot:run

A API estará disponível em:

http://localhost:8080

👨‍💻 Autor

Nicollas

Projeto desenvolvido para estudos e evolução no desenvolvimento Backend com Java e Spring Boot.