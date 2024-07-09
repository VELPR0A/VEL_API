# API VEL

## Introdução

Bem-vindo à API VEL! Esta API foi desenvolvida para fornecer uma solução eficiente para gerenciar as operações de um restaurante e/ou empresas de entregas rápidas delivery, incluindo a administração de pedidos, entregas, e a gestão de entregadores e uma visão global de faturamentos da empresa. Utilizando um design RESTful, a API garante a interoperabilidade e a facilidade de uso, permitindo a integração com diversos sistemas e aplicações.

### Funcionalidades

- **Gerenciamento de Pedidos:** Criação, atualização e consulta de pedidos realizados.
- **Gestão de Entregas:** Controle das entregas, incluindo status.
- **Administração de Entregadores:** Cadastro, atualização e gerenciamento dos entregadores.
- **Relatórios e Estatísticas:** Geração de relatórios sobre financeiro e entregas realizadas.
- **Faturamento:** Controle e gerenciamento do faturamento do restaurante e/ou empresa.
- **Planos:** Administração de diferentes planos de serviço oferecidos pela aplicação.
- **Cadastro e Atualização de Empresas:** Gestão de informações de empresas parceiras.
- **Contratos:** Criação e gerenciamento de contratos com entregadores e empresas.
- **Comandas:** Controle de comandas e pedidos.
- **Logins:** Autenticação e gerenciamento de usuários do sistema.

### Tecnologias Utilizadas

- Linguagem de Programação: Java
- Framework: Spring Boot
- Ferramenta de Testes de API: Insomnia
- Banco de Dados: MySQL
- Containerização: Docker
- Serviços em Nuvem: AWS, On-Render
- Documentação da API: Swagger

### Documentação da API

Para acessar a documentação completa da API e todos seus endpoints, visite o link abaixo:

[Documentação Completa da API](https://vel-tnpo.onrender.com/swagger-ui/index.html)

"Ao acessar a documentação completa da API, você verá uma tela semelhante a esta, onde poderá visualizar as URLs e os endpoints. Basta clicar no endpoint desejado para ver um exemplo dos tipos de dados que você irá receber

![image](https://github.com/VELPR0A/VEL_API/assets/84996872/d4887f0e-fbab-407e-905c-c892f86a823a)



### Exemplo de Requisição

Requisição GET para obter informações de um entregador:

GET http://localhost:8084/entregador/{idCnpj}


### Exemplo de Resposta

Resposta JSON com informações de um entregador:

```json
{
  "idCpf": "12345678901",
  "nome": "João da Silva",
  "telefone": "999999999",
  "email": "joao.silva@example.com",
  "contaBancaria": "1234-5678",
  "cnh": "AB123456",
  "status": "Ativo",
  "idCnpj": "12345678000199",
  "turno": 1,
  "senha": "hashed_password"
}

