# Havoc-Lang — Language Manual

A Java interpreter for the **Havoc-Lang** programming language.

**Developers:** João Henrique Alves and João Pedro da Rosa.

## Running the Interpreter

Locate the `Main.jar` file and run the following command in your terminal:

```bash
java -jar Main.jar filename.txt
```

Replace `filename.txt` with the file containing your Havoc-Lang program.

**Note:** Each word in the source file must be separated by at least one space. Strings must be enclosed in double quotes, such as `"hello world"`. Code indentation is not required.

## Variables

To declare a variable, use:

```text
type name = value
```

Or declare it without an initial value:

```text
type name
```

**Examples:**

```text
int x
int y = 2
float z = 4.4
double w = 3.14
string s = "test string"
```

### Supported Data Types

- `int`
- `float`
- `double`
- `long`
- `string`
- `boolean` (present in the source code, but not yet functional)

## Arithmetic Operations

The language supports the four basic arithmetic operations (addition, subtraction, multiplication, and division), as well as the remainder operation.

Each expression can contain a maximum of **two operands**.

**Examples:**

```text
x = 6 - 3
y = 12 * 12
```

## Input and Output

### Input

Use the `input` command to read data from the keyboard:

```text
int x
input x
```

### Output

Use the `print` command to display output:

```text
string test
input test
print test
```

## Conditional Statements

### `if`

The language supports `if` statements, but does not allow nested `if` statements or provide an `else` clause.

Each conditional block must end with `endIf`.

**Examples:**

```text
if 3 > 2 :
    print true
endIf
```

```text
if 5 > 5 :
    print false
endIf
```

## Loops

### `for`

The language supports `for` loops, but does not allow nested loops. Each loop must end with `endFor`.

The loop control variable is an `int` by default, and its values are specified in the loop declaration:

```text
for i in range x , y , z :
    print "printed!"
endFor
```

In this syntax:

- `x` is the initial value of the loop.
- `y` is the exclusive upper bound (for a step of `1`, the last value is `y - 1`).
- `z` is the increment applied at each iteration.
