# Calculadora Aritmética Simple (Android)

Esta es una app Android sencilla que permite realizar operaciones básicas entre dos números.

## 📱 Interfaz de Usuario (UI)

- **Padding general:** Todos los componentes están a 20dp hacia el interior.
- **Número 1 y Número 2:**
    - `TextView` con texto "Número 1:" y "Número 2:" respectivamente.
    - `EditText` asociado a cada uno:
        - Hint: "Introduzca un número entero".
        - Alineado a la derecha.
        - Acepta números con decimales y signo.
        - Inicialmente vacío.
- **Resultado:**
    - `TextView` con texto por defecto "0.0".
    - Tamaño de fuente mayor, color naranja, contenido centrado.
- **Botones de operación:**
    - Botones con texto "+", "-", "x", "/" respectivamente.
    - Color de fondo azul, esquinas redondeadas.
- **Botón BORRAR:**
    - Texto "BORRAR".
    - Fondo rojo, esquinas rectas.

## ⚙️ Funcionalidad

- Cada botón realiza su operación si ambos campos numéricos son válidos. Si no, se muestra "Error" en el resultado.
- Botones de operación:
    1. **[ + ]** Suma los dos números.
    2. **[ - ]** Resta el segundo número al primero.
    3. **[ x ]** Multiplica ambos números.
    4. **[ / ]** Divide el primer número entre el segundo.
- El botón **BORRAR** limpia los dos campos de entrada y reinicia el resultado a "0.0".

## 🛠️ Tecnologías usadas

- Android Studio
- Java
- XML (para layouts)
- API mínima: 21+ (Android 5.0)

## 📂 Estructura del proyecto

```
/app/src/main/java/...
/app/src/main/res/layout/activity_main.xml
README.md
```

## 📸 Capturas de pantalla

*(Puedes agregar imágenes aquí usando Markdown si las tienes)*

## 📄 Licencia

Este proyecto es de uso educativo y puede modificarse libremente.