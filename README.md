# ControleEstoque-20240228

Resumo
- Este repositório contém a API Spring Boot para controle de estoque com módulo de Vendas.
  
Pré-requisitos
- Java 17 (ou a versão usada no projeto)
- Maven (ou use ./mvnw se presente no repositório)
- MySQL acessível (local ou remoto). Para testes locais recomenda-se ter um MySQL rodando.

Configuração do banco (MySQL)
- Variáveis principais:
  - SPRING_DATASOURCE_URL=jdbc:mysql://<host>:3306/controle_estoque?useSSL=false&allowPublicKeyRetrieval=true
  - SPRING_DATASOURCE_USERNAME=<usuário>
  - SPRING_DATASOURCE_PASSWORD=<senha>
  - SPRING_JPA_HIBERNATE_DDL_AUTO=update
- Você pode definir essas variáveis em um arquivo .env na raiz do projeto (veja .env.example).

Como rodar a aplicação (local)
1. Ajuste as configurações de conexão com o MySQL conforme o seu ambiente (ou exporte variáveis de ambiente).
2. Na raiz do projeto:
   - ./mvnw spring-boot:run
   - ou: mvn spring-boot:run

Endpoints 
- Clientes (CRUD)
  - POST /api/clientes  — criar cliente
  - GET /api/clientes   — listar
  - GET /api/clientes/{id} — buscar por id
  - PUT /api/clientes/{id} — atualizar
  - DELETE /api/clientes/{id} — deletar
- Vendas
  - POST /api/vendas — registrar venda (payload: idCliente, lista de itens [{idProduto, quantidade}])
  - GET /api/vendas — listar vendas
  - GET /api/vendas/{id} — detalhes da venda
- Produtos
  - GET /api/produtos/{id} — consultar estoque atual do produto

