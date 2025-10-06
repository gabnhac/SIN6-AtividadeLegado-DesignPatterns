# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações

## [1.1.0] - DATA

### Adicionado
- **Arquitetura Base para Extensibilidade de Notificações:** Criação da interface `INotifierComponent` e do Decorador Abstrato (`BaseNotifier`) para permitir fácil adição de novos canais de comunicação no futuro.

### Corrigido
- **Falta de Flexibilidade e Desperdício de Largura de Banda:** Corrigido o comportamento que enviava notificações para **todos** os canais (Email, SMS e Push) simultaneamente, permitindo agora a escolha dinâmica dos canais.
- **Acoplamento Forte:** Eliminado o alto acoplamento entre os serviços de notificação ao remover classes legadas e implementar padrões de projeto.

### Modificado
- **Refatoração do Módulo de Notificação:** O código legado foi reestruturado para implementar os **Padrões Decorator e Factory**.
- **Padrão Decorator:** Implementado para encapsular canais de notificação (SMS e Push) sobre o canal base (E-mail), permitindo o uso opcional e dinâmico.
- **Padrão Factory Method:** Adicionado para centralizar e abstrair a lógica complexa de criação (montagem) dos objetos Decorator, simplificando o uso no código cliente.
