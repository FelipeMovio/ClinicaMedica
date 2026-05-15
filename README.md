# 🏥 Clínica Médica API

API REST desenvolvida com Java e Spring Boot para gerenciamento de médicos e pacientes de uma clínica médica.

O projeto implementa operações CRUD completas, validações de dados, paginação, migrations com Flyway e persistência utilizando Spring Data JPA e MySQL.

---

# 🚀 Funcionalidades

## 👨‍⚕️ Médicos

* Cadastro de médicos
* Listagem paginada
* Atualização de dados
* Exclusão lógica (soft delete)
* Controle de especialidades

## 🧑‍🦱 Pacientes

* Cadastro de pacientes
* Listagem paginada
* Atualização de dados
* Exclusão física

## 📍 Endereço

* Endereço embutido com `@Embedded`
* Atualização parcial de dados

## ✅ Validações

* Validação de e-mail
* Validação de CPF
* Validação de CRM
* Campos obrigatórios
* Bean Validation com Jakarta Validation

## 🗄 Banco de Dados

* Persistência com JPA/Hibernate
* Migrations com Flyway
* Banco MySQL

---

# 🛠 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web MVC
* Spring Data JPA
* Flyway
* MySQL
* Hibernate
* Lombok
* Jakarta Validation
* Maven

---

# 📂 Estrutura do Projeto

```bash id="k2m91a"
controller/
 ├── MedicoController
 └── PacienteController

entity/
 ├── Medico
 ├── Paciente
 ├── Endereco
 └── Especialidade

dto/
 ├── cadastro
 ├── atualização
 └── listagem

repository/
 ├── MedicoRepository
 └── PacienteRepository
```

---

# 📌 Funcionalidades da API

## Médicos

### Cadastrar médico

```http id="91kd2m"
POST /medicos
```

### Listar médicos

```http id="81dj2m"
GET /medicos
```

### Atualizar médico

```http id="j28d1m"
PUT /medicos
```

### Excluir médico

```http id="m91dk2"
DELETE /medicos/{id}
```

---

## Pacientes

### Cadastrar paciente

```http id="d92md1"
POST /pacientes
```

### Listar pacientes

```http id="82md9d"
GET /pacientes
```

### Atualizar paciente

```http id="d81ms2"
PUT /pacientes
```

### Excluir paciente

```http id="2md8s1"
DELETE /pacientes/{id}
```

---

# 📚 Conceitos aplicados

* API REST
* CRUD completo
* Spring Boot
* Spring Data JPA
* Hibernate
* DTO Pattern
* Bean Validation
* Paginação
* Soft Delete
* Migrations com Flyway
* Embedded Objects
* Organização em camadas
* Orientação a Objetos
* Clean Code

---

# 🗄 Modelagem

## Entidades principais

### Médico

* Nome
* Email
* Telefone
* CRM
* Especialidade
* Endereço
* Ativo

### Paciente

* Nome
* Email
* Telefone
* CPF
* Endereço

### Endereço

* Logradouro
* Bairro
* CEP
* Número
* Complemento
* UF

---

# ▶ Como executar

## Pré-requisitos

* Java 21
* MySQL
* Maven

## Passos

1. Clone o repositório
2. Configure o banco MySQL
3. Ajuste o `application.properties`
4. Execute as migrations do Flyway
5. Rode a aplicação Spring Boot

---

# 🔥 Diferenciais do projeto

* Uso de `record` para DTOs
* Atualização parcial de entidades
* Exclusão lógica de médicos
* Paginação com Spring Data
* Separação clara entre entidade e DTO
* Código organizado em camadas

---

# 👨‍💻 Autor

Felipe Movio
