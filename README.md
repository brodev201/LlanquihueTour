# 🧠 Llanquihue Tour – Modelo de Clases en Java

## 👤 Autor del proyecto
- **Nombre completo:** Benjamín Rodríguez Rodríguez
- **Carrera:** Analista Programador Computacional
- **Asignatura:** Desarrollo Orientado a Objetos I - PRY2202

---

## 📘 Descripción del sistema
**Llanquihue Tour** es un prototipo desarrollado en Java para una agencia de turismo de la comuna de Llanquihue, Región de Los Lagos. Su propósito es representar de forma estructurada a las personas vinculadas a la agencia, resolviendo problemas como la información duplicada, la falta de validación y la falta de diferenciación de roles.

El modelo aplica los principios de la Programación Orientada a Objetos:
- **Encapsulamiento:** atributos `private` con métodos `get` y `set`.
- **Validación:** los `set` validan los datos y lanzan `IllegalArgumentException` si son inválidos.
- **Composición:** `Empleado` contiene un objeto `Direccion` (relación "has-a").
- **Herencia:** `Empleado` extiende de `Persona` (relación "is-a").
- **toString():** representación legible de cada objeto.

---

## 🧱 Estructura de paquetes y clases

```plaintext
📁 src/
├── app/
│   └── Main.java        # Clase principal: crea objetos y muestra resultados
└── model/
    ├── Persona.java     # Clase base: nombre, apellido, RUT y teléfono
    ├── Direccion.java   # Calle, número, comuna y región
    └── Empleado.java    # Hereda de Persona y contiene una Direccion
```

| Clase | Paquete | Descripción |
|---|---|---|
| `Persona` | model | Clase base con los datos comunes a cualquier persona |
| `Direccion` | model | Dirección física, usada por composición |
| `Empleado` | model | Extiende `Persona`; agrega cargo, años de experiencia y dirección |
| `Main` | app | Punto de entrada: instancia objetos y los imprime por consola |

---

## ⚙️ Instrucciones para clonar, compilar y ejecutar

1. Clona el repositorio:

```bash
git clone [Pega aquí el enlace del repositorio].git
```

2. Abre la carpeta del proyecto en IntelliJ IDEA.

3. Ejecuta la clase `Main` ubicada en `src/app/Main.java` con el botón ▶ (o `Shift + F10`).

**Alternativa por consola** (desde la carpeta raíz del proyecto):

```bash
javac -d out src/model/*.java src/app/*.java
java -cp out app.Main
```

---

**Repositorio GitHub:** [Pega aquí el enlace al repositorio]
**Fecha de entrega:** [DD/MM/2026]

© Duoc UC | Escuela de Informática y Telecomunicaciones