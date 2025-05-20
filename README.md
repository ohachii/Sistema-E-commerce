# 🛒 Sistema E-commerce — Cadastro de Produtos

Este projeto foi desenvolvido como atividade para modelar um sistema simples de e-commerce em Java, com foco na utilização de herança, encapsulamento e validações de regras de negócio. O sistema permite o cadastro e a exibição de informações de **produtos**, **livros** e **eletrônicos**.

---

## 📋 Especificações

### 🔹 Superclasse: Produto
- **Atributos privados**:
  - `nome`
  - `preco`
  - `sku`
- **Regras de negócio**:
  - Preço deve ser maior que zero
  - SKU não pode ser vazio ou nulo
- **Método público**:
  - `exibirInformacoes()`

---

### 🔸 Subclasse: Livro
- **Atributos adicionais**:
  - `autor`
  - `numeroPaginas`
- **Regras de negócio**:
  - Número de páginas deve ser maior que 10
- **Método público**:
  - `exibirInformacoesCompletas()`

---

### 🔸 Subclasse: Eletronico
- **Atributos adicionais**:
  - `fabricante`
  - `voltagem`
- **Regras de negócio**:
  - Voltagem deve ser 110 ou 220
- **Método público**:
  - `exibirInformacoesCompletas()`

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e especialização de classes
- Encapsulamento (atributos privados + acesso via métodos)
- Construtores com validações de negócio
- Uso de `super(...)` para inicializar atributos da superclasse

---

## 🚀 Execução do Projeto

1. Compile os arquivos (estando na pasta onde estão os `.java`):

```bash
javac *.java
```

✅ Requisitos Atendidos
 Encapsulamento total

 - Herança e uso de super(...)

 - Validação de regras de negócio nos construtores

 - Exibição das informações completas dos objetos
