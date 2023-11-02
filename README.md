<p align="center">
  <a href="" rel="noopener">
 <img width=200px height=200px src="https://i.imgur.com/6wj0hh6.jpg" alt="Project logo"></a>
</p>

<h3 align="center">Digital Clinical procedure</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()

[GitHub Issues] :(https://github.com/Ivan-Bangal/MedicalProcess_Back/issues)

[GitHub Pull Requests](https://github.com/Ivan-Bangal/MedicalProcess_Back/pulls)

</div>

---

<p align="center"> Few lines describing your project.
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>

Este projecto tem como ideia geral, a criação de um portal onde os medicos poderão criar processos digitais do cliente.

Neste momento os hospitais em Moçambique trabalham na base do papel, isto funciona, mas como pode ser visto, em 2020 ocorreu um incendio que causou a destruição de cerca de meio milhão de processos clinicos.

Os processos são bastante importantes para poder acompanhar a evolução da saúde de um paciente, até pode salvar a vida de um, porque existem diversas condições que só podem ser detectadas caso tenha o historico do paciente.

Dai o projecto.

BTW, este repositorio só contém a API

## 🏁 Getting Started <a name = "getting_started"></a>

### Prerequisites

<ul>
  <li>
    JAVA 11 ou mais avançado, fiz questão de eliminar a configuração HardCoded da versão do Java para que outros possam contribuir sem problemas

    Mas ainda é necessario o JAVA 11 por causa do Optional 
  </li>
  <li>
    Maven, basicamente o NPM do Java 
  </li>
  <li>
    Eclipse, VS Code, IntelliJ........ Nada de Netbeans😂😂
  </li>
  <li>
    Tesseract OCR --> MUITO IMPORTANTE!!!!!

    Para obter o Tesseract podem seguir este Link: https://github.com/UB-Mannheim/tesseract/wiki 

    A ideia é que muitos médicos já terão processos clinicos com eles, sendo assim é bastante importante importar estes processos e criar o processo via OCR

    Esta funcionalidade não está implementada no seu completo, mas o pacote e uma base de como funciona já está disponivel no OCRController
  </li>
  <li>
    Conhecimentos de Spring / Spring Boot, apesar que digo isto só usei a parte mais basica para não confusionar muito
  </li>


</ul>

### Installing

Execute o Comando: <code> mvn clean install </code>

E já vai poder trabalhar com o projecto

Para fazer start é só <code> mvn spring-boot:run </code>


## 🔧 Running the tests <a name = "tests"></a>

Os testes são automaticos, e correm no momento que é efectuado o Start, portanto nada de fugir dos testes 😂😂

### Break down into end to end tests

O teste criado no momento só verifica o Load dos Contextos (Configurações de Base de Dados, Serviços, Repositorios e Controllers) e valida se está tudo devidamente configurado

Faz o Teste do Java também

## 🎈 Usage <a name="usage"></a>

Isto é uma API feita com Spring e tem a dependencia springfox-swagger2, o que permite fazer testes da API sem precisar de ter uma coisa como Postman 

Para aceder o Swagger, basta aceder o Link http://localhost:8080/swagger-ui/index.html#/ depois de correr a App

## 🚀 Deployment <a name = "deployment"></a>

Originalmente isto seria algo que iria instalar no PC de cada user/ medico fosse requisitar

Mas pode ser aproveitado para criar um SAAS, mas claro que para isso deve-se olhar as questões legais

## ⛏️ Built Using <a name = "built_using"></a>

- [Spring](https://spring.io/projects/spring-boot) - Backend Framework
- [H2](https://www.h2database.com/html/main.html) - Database

## ✍️ Authors <a name = "authors"></a>

- [@Ivan-Bangal](https://github.com/Ivan-Bangal/) - Idea & Initial work


## 🎉 Acknowledgements <a name = "acknowledgement"></a>

