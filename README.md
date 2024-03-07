# Sistema de Gestão de Fretes

Este é o desafio da AZShip.

Arquitetura utilizada: Port and Adapters

## Pré-requisitos

- Java 17
- Maven
- Docker e Docker Compose
- MySQL

## Como rodar o projeto

1. Clone este repositório
2. Navegue até o diretório do projeto
3. Execute `docker-compose up`

O serviço estará disponível na porta 8080.

## Endpoints

### Cadastrar frete

- Método: POST
- URL: [http://localhost:8080/api/v1/fretes](http://localhost:8080/api/v1/fretes)
- Corpo da requisição:

```json
{
    "peso": double,
    "altura": double,
    "largura": double,
    "comprimento": double,
    "numero": int,
    "cep": string,
    "cpf": string,
    "nome": string
}
```
### Atualizar frete

- Método: PUT
- URL: [http://localhost:8080/api/v1/fretes/1](http://localhost:8080/api/v1/fretes/1)
- Corpo da requisição:

```json
{
    "peso": double,
    "altura": double,
    "largura": double,
    "comprimento": double,
    "numero": int,
    "cep": string,
    "cpf": string,
    "nome": string
}
```

### Achar fretes por qualquer parâmetro

- Método: GET
- URL: [http://localhost:8080/api/v1/fretes/search/param](http://localhost:8080/api/v1/fretes/search/param)

### Achar frete por ID

- Método: GET
- URL: [http://localhost:8080/api/v1/fretes/id](http://localhost:8080/api/v1/fretes/id)

### Deletar frete por ID

- Método: DELETE
- URL: [http://localhost:8080/api/v1/fretes/id](http://localhost:8080/api/v1/fretes/id)

Por favor, substitua `<id>` pelo ID do frete desejado.


