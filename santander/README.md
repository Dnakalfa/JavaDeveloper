

# Aplicação API Santander desenvolvido em Java (springboot), para aprimoramento de aprendizado.

Aplicação RESTfull gerada com padrões de desenvolvimento, alem de Debugging e testes de exceções realizados em IDE IntelliJ e VS Code.

# Olá, eu sou o Umberto! 👋

## Diagrama de classes utilizado no projeto (via Mermaid)
```mermaid
classDiagram
    class User {
        -String name
        -Account account
        -Feature[] features
        -Card card
        -News news
    }

    class Account {
        -String number
        -String agency
        -double balance
        -double limited
    }

    class Feature {
        -String icon
        -String description
    }

    class Card {
        -String number
        -double limited
    }

    class News {
        -String icon
        -String description
    }

    User "1"*--"1" Account
    User "1"*--"N" Feature
    User "1"*--"1" Card
    User "1"*--"N" News

```
## Desenvolvido apartir de conhecimentos adquiridos em cursos, palestras e mentorias.


Atualmente estou ampliando estes pequenos projetos, que ocorrerão a medida que o aprendizado evoluir.

