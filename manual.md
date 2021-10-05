**Interpretador em java para a linguagem Havoc Lang**

**Alunos: João Henrique Alves e João Pedro da Rosa**


Para executar o interpretador, localize o arquivo "Main.jar" e digite o seguinte comando no terminal: java -jar Main.jar nomedoarquivo.txt

Obs: a linguagem exige que cada palavra do arquivo seja separada por no mínimo um espaço. Strings são declaradas usando aspas duplas, como em "string". Indentação de código não é obrigatória.

Uso de variáveis:

Comando para declarar variáveis
```
tipo nome = valor
```
ou
```
tipo nome
```

Exemplos:

```
int x
int y = 2
float z = 4.4
double w = 3.14
string s = "string de teste"
```

Tipos de dados disponíveis:

 - int
 - float
 - double
 - long
 - string
 - boolean (existente no código, porém ainda não funcional)

Operações:

Estão disponíveis para uso as quatro operações básicas da matemática e a operação de resto.
O máximo de operandos por expressão é de dois operandos.

Exemplo:

```
x = 6 - 3
y = 12 * 12
```


Entrada e Saída:

Para ler dados do teclado utiliza-se o comando "input":

```
int x
input x
```

Print:

Para saída de dados utiliza-se o comando "print":

```
string teste
input teste
print teste
```
Condições:

if:

A linguagem possui o comando "if", não permitindo aninhamento de ifs e não tendo a opção para o else. O bloco correspondente ao if deve terminar com um "endIf".

Exemplos:


```
if 3 > 2 :
    print true
endIf
```
```
if 5 > 5 :
    print false
endIf
```

Laços:

A linguagem possui o comando "for" para uso de laços, não permitindo um laço dentro de outro laço. O laço deve terminar com um "endFor".
A variável que controlará cada iteração do laço é por padrão um "int" cujo valor é declarado na linha do comando:

```
for i in range x , y , z :
    print "printou!"
endFor
```

x sendo o valor inicial do laço, y sendo o valor final do laço (y-1) e z sendo o valor a ser incrementado no laço.