# Programa de contagem com exceção personalizada

Este projeto Java demonstra um mecanismo de contagem simples com tratamento de exceção personalizado para validar parâmetros de entrada.

## Descrição

Este projeto recebe dois parâmetros inteiros através do terminal e imprime uma sequência de números com base na diferença entre estes dois parâmetros. Se o primeiro parâmetro for maior que o segundo, ele lança uma exceção personalizada (`validParametersException`).

## Características

* Lê dois parâmetros inteiros do terminal.
* Valida que o primeiro parâmetro é menor ou igual ao segundo parâmetro.
* Imprime uma sequência de números incrementados com base nos parâmetros.
* Lança uma exceção personalizada (InvalidParametersException) se a validação falhar.

## Como usar

* Clone o repositório para sua máquina local.
* Navegue até o diretório do projeto.
* Compile e execute o arquivo Counter.java usando um compilador Java.
* Seguir as instruções no ecrã para introduzir os parâmetros.

## Requisitos

* Java Development Kit (JDK) instalado em sua máquina.

Exemplo de utilização

1. Compile o programa:
```
javac Accountant.java
```

2. Executar o programa:
```
java Accountant
```


3. Introduza o primeiro e o segundo parâmetros conforme solicitado.


# Exemplo de saída

```
Introduzir o primeiro parâmetro:
12
Introduza o segundo parâmetro:
30
Impressão do número 1
Número de impressão 2
...
Impressão do número 18

```

Se o primeiro parâmetro for maior que o segundo:

```
Introduzir o primeiro parâmetro:
30
Introduzir o segundo parâmetro:
12
O segundo parâmetro deve ser maior que o primeiro
```

Arquivos

* Contador.java: Contém a lógica principal para ler a entrada e imprimir a sequência.
* InvalidParametersException.java: Classe de exceção personalizada para lidar com parâmetros inválidos.

Licença

Este projeto está licenciado sob a licença MIT.

Veja o arquivo [LICENSE]() para detalhes.