# Evidencia 2 Computación en Java
Crea un programa que procese datos de usuario desde un archivo de texto. El programa debe leer el archivo, analizar los datos y realizar algunas operaciones. Debes manejar diferentes tipos de excepciones que puedan ocurrir durante el procesamiento y mostrar mensajes de error específicos para cada caso.

1. Crea un archivo de texto llamado **"datos_usuario.txt"** (el archivo debe de estar dentro del proyecto) con datos de usuario en el siguiente formato:
```
nombre,edad,email
Juan,30,juan@ejemplo.com
Maria,abc,maria@ejemplo
Pedro,25,pedro
```

2. Crea una clase Usuario con atributos nombre, edad y email.
3. Crea una clase ProcesadorDatos con un método procesarDatos(String rutaArchivo) que lea el archivo, analice los datos y cree objetos Usuario.
4. Maneja las siguientes excepciones:
    - FileNotFoundException: Si el archivo no existe
    - NumberFormatException: Si la edad no es un número válido
    - ArrayIndexOutOfBoundsException: Si una línea del archivo no tiene el formato correcto
    - IllegalArgumentException: Si el email no tiene un formato válido (no tiene un arroba)

**Nota:**
- Se debe mostrar un mensaje diferente en cada tipo de Excepción
- Es importante incluir evidencia de todas las excepciones
- Se debe anexar el código realizado.
