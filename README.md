# Catálogo de Produtos em Java

Este projeto é um exemplo prático de **Programação Orientada a Objetos (POO)** em Java, 
demonstrando conceitos como **herança, polimorfismo e sobrescrita de métodos**.

## 📌 Sobre o projeto
O sistema permite cadastrar produtos de diferentes tipos e exibir suas informações de forma polimórfica.  
Foram implementadas três classes principais:

- **Product** → Classe base que representa um produto genérico.  
- **UsedProduct** → Subclasse que representa um produto usado, incluindo a data de fabricação.  
- **ImportedProduct** → Subclasse que representa um produto importado, incluindo a taxa de alfândega.  

A classe **Programa** contém o método `main` e demonstra o funcionamento do sistema.

## 🚀 Funcionalidades
- Cadastrar produtos genéricos, usados e importados.
- Exibir informações detalhadas sobre cada produto.
- Demonstração de **polimorfismo** com sobrescrita do método `priceTag()`.

## 🛠️ Tecnologias
- **Java 17+** (funciona também em versões anteriores com ajustes).
- Não utiliza bibliotecas externas.

## ▶️ Como executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/matheusg0mes/sistema-produtos-java
