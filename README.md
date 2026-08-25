# Taller ANTLR - Calculadora Científica

## 1. Descripción

Este proyecto consiste en la realización de una calculadora científica utilizando ANTLR y Java.

El programa permite realizar operaciones matemáticas básicas, trabajar con variables, utilizar potencias, funciones matemáticas, constantes y realizar gráficas.

La idea principal del proyecto es utilizar una gramática para que ANTLR pueda reconocer las expresiones que escribe el usuario y después utilizar el patrón Visitor para evaluar esas expresiones.

---

## 2. Objetivo

El objetivo principal es entender cómo funcionan algunas de las partes principales de ANTLR:

- Lexer
- Parser
- Árbol sintáctico
- Visitor

También se busca aplicar estos conceptos en un programa que pueda interpretar expresiones matemáticas.

---

## 3. Tecnologías utilizadas

- Java
- ANTLR 4
- Swing

ANTLR se utiliza para crear el Lexer y Parser a partir de la gramática, mientras que Java se utiliza para implementar la lógica de la calculadora y la ventana de las gráficas.

---

## 4. Archivos del proyecto

### ScientificCalc.g4

Este archivo contiene la gramática de la calculadora.

Aquí se definen las reglas que indican qué expresiones puede reconocer el programa.

Permite reconocer:

- Números
- Variables
- Suma
- Resta
- Multiplicación
- División
- Potencias
- Paréntesis
- Funciones matemáticas
- Constantes
- Comandos como `clear`, `vars` y `plot`

Por ejemplo, la gramática permite expresiones como:

- `2 + 3`
- `10 * 5`
- `2^8`
- `sin(pi/2)`
- `x = 10`

También contiene las etiquetas de las diferentes operaciones, como `#addSub`, `#mulDiv`, `#power` y `#functionCall`. Estas etiquetas ayudan a que ANTLR genere los diferentes métodos que después utiliza el Visitor.


### ScientificEvalVisitor.java

Este archivo contiene la lógica que permite evaluar las expresiones.

La clase utiliza el patrón Visitor para recorrer el árbol sintáctico generado por ANTLR.

Aquí se implementan las operaciones de:

- Suma y resta
- Multiplicación y división
- Potencias
- Operadores unarios
- Paréntesis
- Variables
- Funciones matemáticas
- Constantes
- `clear`
- `vars`
- `plot`

También se utiliza un `Map<String, Double>` llamado `memory` para guardar las variables.

Por ejemplo, si escribimos:

`a = 10`

el programa guarda el valor de a en la memoria y después podemos utilizarlo:

`a + 5`

El Visitor busca el valor de a y realiza la operación.

En este archivo también se manejan algunos errores, como intentar dividir entre cero o utilizar una variable que no ha sido definida.

### Main.java

Este es el archivo principal del programa.

Se encarga de recibir lo que escribe el usuario y conectar las diferentes partes de ANTLR.

El proceso que realiza es:


Entrada del usuario

        `↓`
Lexer

        `↓`
        
Tokens
        `↓`
        
Parser
        `↓`
        
Árbol sintáctico

        `↓`
        
Visitor

        `↓`
        
Resultado


Primero el Lexer convierte el texto en tokens.

Después el Parser utiliza esos tokens y las reglas de ScientificCalc.g4 para construir el árbol sintáctico.

Finalmente el Visitor recorre ese árbol y realiza la operación correspondiente.

### PlotWindow.java

Este archivo se encarga de mostrar las gráficas.

Utiliza Java Swing para crear una ventana donde se pueden dibujar las funciones.

Cuando se utiliza el comando:

- `plot(x^2,-10,10)`

el programa calcula diferentes valores de x dentro del rango indicado y obtiene los valores correspondientes de y.

Después esos puntos son enviados a PlotWindow.java, donde se convierten a coordenadas de la ventana y se dibuja la función.

La ventana utilizada para la gráfica tiene un tamaño de 800 x 600.

### ejemplos

La carpeta ejemplos contiene ejemplos utilizados para probar las diferentes funcionalidades de la calculadora.

Sirve para comprobar que las operaciones, variables, funciones y demás elementos de la gramática funcionan correctamente.

---

## 5. Funcionamiento general

El funcionamiento del programa se puede resumir en tres partes principales.

Primero, el usuario escribe una expresión.

Por ejemplo:

- `2 + 3 * 4`

El Lexer identifica los diferentes elementos de la expresión.

Después el Parser revisa si la expresión cumple con las reglas de la gramática y genera el árbol sintáctico.

Finalmente, el Visitor recorre el árbol y realiza las operaciones necesarias para obtener el resultado.

En este caso el resultado sería:

14.0

Esto sucede porque la multiplicación tiene prioridad sobre la suma.

---

## 6. Algunas funciones implementadas

La calculadora permite realizar operaciones básicas como:

- `2 + 3`
- `10 - 5`
- `4 * 5`
- `20 / 4`

También permite utilizar potencias:

- `2^8`

Variables:

- `a = 10`
- `b = 20`
- `a + b`

Constantes:

- `pi`
- `e`

Funciones matemáticas:

- `sin(pi/2)`
- `sqrt(25)`
- `log(100)`
- `ln(e)`
- `abs(-10)`
- `exp(1)`

Y comandos:

- `vars`
- `clear`

También se pueden realizar gráficas mediante:

- `plot(x^2,-10,10)`

---

## 7. Preguntas de análisis

### 1. ¿Cuál es la responsabilidad del Lexer?

El Lexer se encarga de leer el texto que escribe el usuario y convertirlo en tokens.

Por ejemplo, en:

- `10 + 20`

reconoce el número 10, el operador + y el número 20.

Después estos tokens son utilizados por el Parser.

### 2. ¿Cuál es la responsabilidad del Parser?

El Parser recibe los tokens del Lexer y comprueba que estén organizados de acuerdo con las reglas de la gramática.

También se encarga de construir el árbol sintáctico que representa la expresión.

Por ejemplo:

- `2 + 3 * 4`

se interpreta teniendo en cuenta que la multiplicación debe realizarse antes que la suma.

### 3. ¿Qué función cumplen las etiquetas como #addSub o #functionCall?

Las etiquetas permiten identificar diferentes tipos de expresiones dentro de la gramática.

Por ejemplo:

#addSub

se utiliza para las operaciones de suma y resta.

Mientras que:

#functionCall

se utiliza cuando se llama una función matemática.

Estas etiquetas hacen que ANTLR genere diferentes métodos en el Visitor, como visitAddSub() y visitFunctionCall().

### 4. ¿Qué ventaja ofrece el patrón Visitor?

El Visitor permite separar la gramática de la parte que realiza las operaciones.

La gramática se encarga de reconocer la estructura de las expresiones y el Visitor se encarga de decir qué hacer con ellas.

Esto hace que sea más fácil organizar el código y agregar nuevas operaciones.

### 5. ¿Qué representa la tabla de símbolos?

La tabla de símbolos es el Map llamado memory que se encuentra en ScientificEvalVisitor.java.

Su función es guardar las variables y sus valores.

Por ejemplo:

- `a = 10`

hace que el programa guarde que la variable a tiene el valor 10.

Después podemos utilizar:

- `a + 5`

y el programa sabe cuál es el valor de a.

### 6. ¿Por qué la variable x cambia continuamente durante una gráfica?

Cuando se realiza una gráfica se necesitan muchos puntos.

Por ejemplo, si queremos graficar:

- `sin(x)`

el programa necesita probar diferentes valores de x.

Por eso x va cambiando dentro del rango indicado en el comando plot.

Para cada valor de x, el programa calcula un valor de y y con esos puntos finalmente construye la gráfica.

### 7. ¿Por qué podemos evaluar el mismo árbol sintáctico varias veces?

Porque el árbol representa la estructura de la expresión y no un único resultado.

Por ejemplo, en:

- `sin(x)`

la estructura de la expresión siempre es la misma.

Lo que cambia es el valor de x.

Esto permite utilizar el mismo árbol varias veces durante la creación de una gráfica, cambiando el valor de x y calculando un nuevo valor de y.

### 8. ¿Qué sucede cuando se intenta graficar una función con una discontinuidad?

Una función puede tener puntos donde no existe un valor válido.

Un ejemplo sería:

- `plot(1/x,-5,5)`

porque cuando x vale 0 se estaría intentando dividir entre cero.

Esto puede producir valores como Infinity o NaN, lo que puede generar problemas al momento de dibujar la gráfica.

Por eso sería necesario controlar estos valores para evitar dibujar puntos que no sean válidos.

### 9. ¿Qué modificaciones serían necesarias para implementar funciones con dos argumentos?

Actualmente las funciones utilizan un solo argumento, por ejemplo:

- `sqrt(25)`

Para implementar funciones con dos argumentos, como:

- `pow(2,8)`

sería necesario modificar la gramática para permitir dos expresiones separadas por una coma.

También habría que modificar el Visitor para que pueda obtener y procesar los dos argumentos.

### 10. ¿Por qué la calculadora desarrollada puede considerarse un lenguaje de dominio específico?

Se puede considerar un lenguaje de dominio específico porque está diseñado principalmente para trabajar con expresiones matemáticas.

No busca ser un lenguaje de programación completo como Java.

Su propósito específico es permitir escribir operaciones matemáticas, utilizar funciones, variables y realizar gráficas.

Por ejemplo:

- `radio = 10`
- `area = pi * radio^2`
- `plot(x^2,-10,10)`

son expresiones que pertenecen al dominio de las matemáticas.

---

## 8. Conclusión

Con este proyecto pudimos entender mejor cómo funciona ANTLR y cómo se pueden utilizar un Lexer, un Parser y un Visitor para crear un pequeño lenguaje.

La gramática define las expresiones que puede reconocer el programa, el Parser construye el árbol sintáctico y el Visitor se encarga de recorrerlo y realizar las operaciones.

También se logró implementar una calculadora con variables, funciones matemáticas, constantes, comandos y gráficas.

En general, el proyecto permitió aplicar los conceptos vistos en clase de una manera práctica y entender mejor cómo se puede construir un lenguaje sencillo utilizando ANTLR.
