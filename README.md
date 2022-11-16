# Word Counter
Um programa que conta as palavras de uma frase de acordo com vários critérios. Sendo eles, a quantidade total de palavras, a quantidade de palavras que possuem uma quantidade par de caracteres e a quantidade de palavras que iniciam com letra maiúscula.

## Requisitos
- [Java JDK 17](https://adoptium.net/).
- [Maven](https://maven.apache.org/).
- [Git](https://git-scm.com/) (opcional).

## Preparação
1. [Clone o repositório](https://docs.github.com/pt/repositories/creating-and-managing-repositories/cloning-a-repository) ou baixe e descompacte o zip.
2. Abra a pasta do projeto clonado em um emulador de terminal.

## Testes
Para executar os testes unitários do projeto, digite o comando:

```mvn clean test```

## Execução
1. Digite o comando:

   ```mvn clean package```
2. Digite o(s) comando(s):
   - PowerShell:

      ```java -jar .\target\word-counter-1.0-SNAPSHOT-jar-with-dependencies.jar```
   - Prompt de Comando:
   
      ```cd target```
   
      ```java -jar word-counter-1.0-SNAPSHOT-jar-with-dependencies.jar```
3. O programa abrirá e solicitará que você digite uma frase. Digite-a e tecle Enter.
4. O programa mostrará algumas informações sobre a frase.
5. Você poderá digitar outra frase se quiser ou ++s para sair.
