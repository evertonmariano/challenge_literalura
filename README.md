# 📚 LiterAlura - Catálogo de Livros

Este projeto é um desafio prático de programação proposto pela Alura. O objetivo é construir um catálogo de livros em formato de aplicação console (CLI) utilizando Java e Spring Boot. 

A aplicação consome a [Gutendex API](https://gutendex.com/) para buscar dados de livros e autores, e utiliza um banco de dados relacional para persistir essas informações, garantindo que os dados fiquem salvos localmente após as buscas.

---

## ⚙️ Funcionalidades

O menu interativo via console permite realizar as seguintes operações:

1. **Buscar livro pelo título**: Consulta a API externa Gutendex, traz os dados do livro e do autor, e salva automaticamente no banco de dados local.
2. **Listar livros registrados**: Exibe todos os livros que já foram buscados e salvos no banco de dados.
3. **Listar autores registrados**: Exibe todos os autores salvos no banco de dados, vinculados aos seus respectivos livros.
4. **Listar autores vivos em um determinado ano**: Filtra os autores registrados no banco de dados verificando o ano de nascimento e falecimento.
5. **Listar livros em um determinado idioma**: Permite buscar livros no banco de dados filtrando por idiomas (ex: `pt` para Português, `en` para Inglês).

---

## 💻 Tecnologias Utilizadas

- **Java** (JDK 17 ou superior)
- **Spring Boot** (v3.2.4)
- **Spring Data JPA** (Mapeamento Objeto-Relacional)
- **PostgreSQL** (Banco de dados relacional)
- **Maven** (Gerenciador de dependências)
- **Jackson** (Serialização e Desserialização de JSON)
- **HttpClient** (Consumo de API REST nativo do Java)

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
Antes de começar, você precisará ter instalado em sua máquina:
- [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- [PostgreSQL](https://www.postgresql.org/download/)
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Passo a Passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/evertonmariano/challenge_literalura.git

```

2. **Configure o Banco de Dados:**
* Abra o seu gerenciador do PostgreSQL (como o pgAdmin ou psql).
* Crie um banco de dados vazio chamado `literalura`:
```sql
CREATE DATABASE literalura;

```




3. **Configure as Variáveis de Ambiente:**
* Vá até a pasta `src/main/resources/` e abra o arquivo `application.properties`.
* Atualize as credenciais de acordo com a sua instalação local do PostgreSQL:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu_usuario_aqui
spring.datasource.password=sua_senha_aqui

```




4. **Execute a Aplicação:**
* Abra o projeto na sua IDE.
* Aguarde o Maven baixar todas as dependências.
* Execute a classe principal `LiteraluraApplication.java`.
* Interaja com o sistema através do terminal/console da sua IDE.



---

## 👨‍💻 Autor

Desenvolvido por **Everton Mariano**.


```

**Dica para finalizar:** Lembre-se de trocar os links `https://github.com/seu-usuario...` na seção "Como Executar" e na seção "Autor" pelos links reais do seu perfil e repositório!

```
