# Bootcamp-Santander
Java RESTful API criada para a Santander Dev Week. 
## Diagrama de classes

```mermaid
classDiagram
  class User {
    - name: string
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: string
    - agency: string
    - balance: float
    - limit: float
  }

  class Feature {
    - icon: string
    - description: string
  }

  class Card {
    - number: string
    - limit: float
  }

  class News {
    - icon: string
    - description: string
  }

  User "1" -- "1" Account : has
  User "0..*" -- "0..*" Feature : has
  User "1" -- "1" Card : has
  User "0..*" -- "0..*" News : has
```

#Link do Figma
https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421-432&mode=design&t=vpzOifpdCHxFXPM7-0
