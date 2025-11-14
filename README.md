# 🚀 Curso: Java POO desde Cero

[![Java](https://img.shields.io/badge/JAVA%2021+-FF4444?style=flat-square&logoColor=white&color=FF4444&labelColor=FF4444)](https://www.oracle.com/java/)
[![IDE](https://img.shields.io/badge/IDE%20IntelliJ-5555FF?style=flat-square&logoColor=white&color=5555FF&labelColor=5555FF)](https://www.jetbrains.com/idea/)
[![License](https://img.shields.io/badge/License%20MIT-44AA44?style=flat-square&logoColor=white&color=44AA44&labelColor=44AA44)](https://opensource.org/licenses/MIT)
[![Status](https://img.shields.io/badge/Status%20Activo-FF8800?style=flat-square&logoColor=white&color=FF8800&labelColor=FF8800)](https://github.com/tu-usuario/tu-repositorio)

¡Bienvenido al repositorio oficial del curso **Java POO desde Cero**! 👨‍💻

Aquí encontrarás todo el material del curso y podrás subir tus ejercicios para revisión.

## 📚 ¿Qué contiene este repositorio?

- **📖 Material del curso**: Ejemplos de código y recursos vistos en clase
- **💡 Ejercicios prácticos**: Organizados por temas y niveles
- **👥 Área de alumnos**: Carpeta especial para que subas tus ejercicios
- **✅ Revisión**: El profesor revisará y comentará tu código

---

## 📂 Estructura del proyecto

```
HELLO-JAVA/
├── java-fundamentals/          # Material y ejemplos del curso
│   ├── c00_helloworld.HelloWorld.java
│   ├── Variables.java
│   ├── Conditionals.java
│   └── ...
├── exercises/                  # 🎯 TUS EJERCICIOS VAN AQUÍ
│   ├── c00_helloworld.HelloWorld/
│   │   ├── Usuario1.java
│   │   ├── Usuario2.java
│   │   └── ...
│   ├── Variables/
│   ├── Conditionals/
│   └── ...
├── .gitignore
├── LICENSE
└── README.md
```

---

## ⚙️ Requisitos del curso

Para seguir este curso necesitas:

- **☕ Java JDK 17 o superior** (recomendado JDK 21)
  - Descarga desde: [Oracle JDK](https://www.oracle.com/java/technologies/downloads/) o [OpenJDK](https://openjdk.org/)
- **💻 IntelliJ IDEA** (IDE oficial del curso)
  - Descarga desde: [JetBrains](https://www.jetbrains.com/idea/)
  - *También puedes usar Eclipse, VS Code o NetBeans si prefieres*

---

## 📤 Cómo subir tus ejercicios

Sigue estos pasos para entregar tus ejercicios:

### 1️⃣ Haz un Fork del repositorio
- Haz clic en el botón **"Fork"** en la parte superior derecha de esta página
- Esto creará una copia del repositorio en tu cuenta de GitHub

### 2️⃣ Clona tu Fork
```bash
git clone https://github.com/TU_USUARIO/HELLO-JAVA.git
cd HELLO-JAVA
```

### 3️⃣ Crea tu carpeta personal
Navega a la carpeta `exercises/` y dentro del tema correspondiente, crea un archivo con tu nombre de usuario:

**Ejemplo para el tema "c00_helloworld.HelloWorld":**
```
exercises/c00_helloworld.HelloWorld/TuUsuario.java
```

### 4️⃣ Crea una rama para tu ejercicio
```
git checkout -b nombre-de-tu-rama
```
> Puedes elegir el nombre que quieras para la rama, por ejemplo: feature/ejercicio-helloworld.
Esto asegura que no hagas push directamente a main.

### 5️⃣ Escribe tu código
- Desarrolla tu ejercicio siguiendo las instrucciones dadas en clase.

### 6️⃣Sube tus cambios
```bash
git add .
git commit -m "Ejercicio c00_helloworld.HelloWorld - [tu_usuario]"
git push origin nombre-de-tu-rama
```
> Asegúrate de reemplazar `nombre-de-tu-rama` por la rama que creaste. 
Ejemplo: `git push origin feature/ejercicio-helloworld`

### 7️⃣ Crea un Pull Request
- Ve a tu repositorio en GitHub
- Haz clic en **"Pull Request"**
- Selecciona el repositorio original como destino
- Agrega un título descriptivo: `Ejercicio [Tema] - [Tu Usuario]`
- Haz clic en Create Pull Request para enviarlo.

### 8️⃣ Revisión
- El profesor revisará tu código
- Recibirás comentarios y sugerencias
- Una vez aprobado, tu ejercicio se fusionará al repositorio principal

---

## 📋 Convenciones de nombres

Para mantener el orden, usa estas convenciones:

- **Nombre del archivo**: `TuUsuario.java` (PascalCase, primera letra mayúscula)
- **Nombre de la clase**: `TuUsuario` (debe coincidir exactamente con el archivo)
- **Commit**: `"Ejercicio [Tema] - [Tu Usuario]"`

**Ejemplo:**
```java
// Archivo: exercises/c00_helloworld.HelloWorld/JonyEnglish22.java
public class JonyEnglish22 {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}
```

> ⚠️ **Importante**: En Java, el nombre del archivo `.java` DEBE ser idéntico al nombre de la clase pública.

---

## 📚 Recurso Base Recomendado

### 🎥 [Tutorial Java POO desde Cero](https://youtu.be/JOAqpdM36wI) 
*Tutorial completo de 8+ horas cubriendo desde fundamentos hasta POO avanzada*

Incluye todos los temas: Variables, Operadores, Strings, Control de flujo, Estructuras, Bucles, Funciones, POO y Excepciones.

> 💡 Excelente recurso de referencia para repasar los temas y resolver dudas.

---

## 🆘 ¿Necesitas ayuda?

- **🐛 Problemas con Git/GitHub**: Consulta la [documentación de GitHub](https://docs.github.com/)
- **☕ Dudas de Java**: Pregunta en clase o revisa la [documentación oficial](https://docs.oracle.com/javase/tutorial/)
- **💬 Otras consultas**: Contacta al profesor

---

## 📝 Notas importantes

- ✅ Siempre trabaja desde tu fork, no directamente en este repositorio
- ✅ Un archivo por ejercicio
- ✅ Código limpio y comentado
- ✅ Prueba tu código antes de subirlo
- ❌ No modifiques archivos fuera de tu área asignada
