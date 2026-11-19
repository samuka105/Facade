# Padrão Facade

Exemplo do padrão estrutural **Facade** aplicado a um home theater. Em vez de o
cliente acionar um a um os subsistemas (projetor, tela, som, luzes e player), uma
fachada oferece operações simples: assistir a um filme e desligar, que coordenam
todos eles na ordem certa. O cliente conversa só com a fachada, sem conhecer os
detalhes de cada aparelho.

## Conteúdo do repositório

- **Código-fonte** do exemplo implementando o padrão Facade (home theater).
- **Casos de teste** (JUnit) cobrindo o estado de cada subsistema após assistir ao filme, a sequência de passos e o desligamento que reverte tudo.
- **Diagrama UML** das classes, em formato de imagem.
