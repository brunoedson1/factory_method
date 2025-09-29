# 📊 Padrão Factory Method – Relatórios Financeiros

Este projeto demonstra o uso do **padrão de projeto Factory Method** em **Java**, aplicado ao contexto de **geração de relatórios financeiros empresariais**.  
O objetivo é mostrar como criar uma estrutura **flexível e extensível** para instanciar diferentes tipos de relatórios, seguindo **boas práticas de orientação a objetos** e **testes automatizados**.

---

## 📝 O que é o Factory Method?

O **Factory Method** é um **padrão de criação** que:

- Define **uma interface** para criar objetos, mas permite que as **subclasses decidam qual classe instanciar**.
- Promove o princípio da **inversão de controle**, facilitando a **extensão do sistema sem modificar o código existente**.
- Permite adicionar **novos tipos de objetos** (serviços, relatórios, etc.) **sem alterar a lógica da fábrica principal**.

> ✅ Isso garante **extensibilidade**, **baixa manutenção** e **testabilidade** do código.

---

## 💼 Cenário: Relatórios Financeiros

O Factory Method é utilizado para gerar diferentes tipos de **relatórios financeiros**:

- 📘 **Balanço**
- 📗 **Demonstrativo de Resultado**
- 📕 **Fluxo de Caixa**
- 📙 **Investimentos**

Cada relatório possui **regras e comportamentos próprios**, mas todos seguem uma **interface comum (`IRelatorio`)**, permitindo que sejam manipulados de forma uniforme pela aplicação.

---

### 🔑 Principais componentes:
- **`IRelatorio.java`** – Interface principal com os métodos `gerar()` e `cancelar()`.
- **Implementações concretas:**  
  `RelatorioBalanco`, `RelatorioDemonstrativoResultado`, `RelatorioFluxoCaixa`, `RelatorioInvestimento`.
- **`RelatorioFactory.java`** – Classe responsável por instanciar o relatório correto conforme o tipo solicitado.
- **Testes unitários** – Garantem a integridade das funcionalidades, cobrindo todos os cenários e casos de erro.
