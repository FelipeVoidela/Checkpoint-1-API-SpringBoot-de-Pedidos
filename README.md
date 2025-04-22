Checkpoint 1 - API de Pedidos

Sobre o Projeto

Esta API permite gerenciar pedidos, incluindo operações de criação, listagem, atualização e exclusão.

Tecnologias Utilizadas

- Java 17
- Spring Boot
- JPA/Hibernate
- Lombok 


Como Rodar o Projeto no terminal

Clone o repositório:

https://github.com/FelipeVoidela/Checkpoint-1-API-SpringBoot-de-Pedidos

Acesse a pasta do projeto:

cd checkpoint1

Execute o projeto com Maven:

mvn spring-boot:run



Endpoints Disponíveis

Criar um Pedido

POST /pedidos

Corpo da Requisição:

```bash
{
  "clienteNome": "João Silva",
  "valorTotal": 150.0
}

Resposta:

{
  "id": 1,
  "clienteNome": "João Silva",
  "dataPedido": "2025-03-24",
  "valorTotal": 150.0
}

Listar Todos os Pedidos

GET /pedidos

Resposta:

[
  {
    "id": 1,
    "clienteNome": "João Silva",
    "dataPedido": "2025-03-24",
    "valorTotal": 150.0
  }
]

Buscar Pedido por ID

GET /pedidos/{id}

Resposta:

{
  "id": 1,
  "clienteNome": "João Silva",
  "dataPedido": "2025-03-24",
  "valorTotal": 150.0
}

Atualizar um Pedido

PUT /pedidos/{id}

Corpo da Requisição:

{
  "clienteNome": "Maria Souza",
  "valorTotal": 200.0
}

Resposta:

{
  "id": 1,
  "clienteNome": "Maria Souza",
  "dataPedido": "2025-03-24",
  "valorTotal": 200.0
}

Deletar um Pedido

DELETE /pedidos/{id}

Resposta:

{
  "message": "Pedido deletado com sucesso."
}

