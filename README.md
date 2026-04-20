# ControlVersiones-Calculadora
# Calculadora Básica en Java

## 📌 Descripción

Este proyecto es una calculadora básica desarrollada en Java que permite realizar operaciones matemáticas simples entre dos números introducidos por el usuario desde la consola.

Las operaciones disponibles son:

* Suma
* Resta
* Multiplicación
* División

## 🧮 Funcionalidades

El programa incluye los siguientes métodos:

* `suma(int a, int b)`: Devuelve la suma de dos números.
* `resta(int a, int b)`: Devuelve la resta de dos números.
* `multiplicacion(int a, int b)`: Devuelve el producto de dos números.
* `division(int a, int b)`: Devuelve la división de dos números. Si el divisor es 0, muestra un mensaje de error.

## ⚙️ Requisitos

* Java JDK 8 o superior
* Consola o terminal para ejecutar el programa

## 🚀 Ejecución

1. Guarda el archivo como `CalculadoraBasica.java`
2. Compila el programa:

   ```bash
   javac CalculadoraBasica.java
   ```
3. Ejecuta el programa:

   ```bash
   java CalculadoraBasica
   ```

## 🖥️ Uso

1. El programa solicitará dos números enteros.
2. Introduce los valores cuando se te pidan.
3. Se mostrarán los resultados de todas las operaciones disponibles.

Ejemplo:

```
Introduce el primer número:
10
Introduce el segundo número:
2
Multiplicación: 20
División: 5.0
Suma: 12
Resta: 8
```

## ⚠️ Consideraciones

* La división entre 0 no está permitida. En ese caso, el programa mostrará un mensaje de error y devolverá 0.
* Solo se admiten números enteros como entrada.

## 📚 Posibles mejoras

* Añadir soporte para números decimales en todas las operaciones.
* Implementar un menú interactivo.
* Permitir realizar múltiples cálculos sin reiniciar el programa.
* Manejar excepciones para entradas inválidas.

## 👨‍💻 Autor

Proyecto básico con fines educativos para practicar programación en Java.
