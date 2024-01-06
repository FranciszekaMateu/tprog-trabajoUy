# Proyecto Taller de Programación - Portal de Búsqueda de Empleo

## Introducción
Este proyecto, realizado durante el segundo semestre de 2023, fue un esfuerzo colaborativo para crear un portal de búsqueda de empleo con funcionalidades avanzadas. A través de tres tareas iterativas, desarrollamos una solución full-stack que integra una aplicación web y un sistema de gestión de ofertas laborales.

## Tarea 1: Gestión de Ofertas Laborales
### Objetivos
- Aprender Java y Swing para desarrollo de interfaces gráficas.
- Implementar pruebas con JUnit y herramientas de desarrollo.

### Visión y Actores
- **Visión:** Desarrollar una plataforma para gestión y aplicación a ofertas laborales.
- **Actores:** Administradores y usuarios regulares con capacidades de creación y gestión de ofertas.

### Requerimientos y Herramientas
- **Funcionales:** Gestión de usuarios y ofertas, búsqueda y filtrado.
- **Especiales:** Pruebas con JUnit, diseño GUI con Swing.
- **Tecnologías:** Java, Swing, JUnit, Git.
- 
La letra completa y detallada de esta tarea esta [aqui](https://github.com/FranciszekaMateu/tprog-trabajoUy/blob/main/docs/Tarea1_2023-v1.1.pdf)

## Tarea 2: Desarrollo de Aplicación Web
### Objetivos
- Crear una aplicación web con tecnologías cliente-servidor.
- Implementar autenticación y manejo de usuarios.

### Visión y Actores
- **Visión:** Integrar la aplicación web con la estación de trabajo existente.
- **Actores:** Administradores, visitantes y usuarios registrados.

### Requerimientos y Herramientas
- **Funcionales:** Modificaciones al sistema existente, implementación de autenticación.
- **Especiales:** Diseño web, validación cliente, pruebas automáticas.
- **Tecnologías:** HTML5, CSS, JavaScript, JSP, Servlets, Java EE, Tomcat.
- 
La letra completa y detallada de esta tarea esta [aqui](https://github.com/FranciszekaMateu/tprog-trabajoUy/blob/main/docs/Tarea2_2023_v1.0.pdf)

## Tarea 3: Mejoras y Nuevas Funcionalidades
### Objetivos
- Implementar Web Services y desarrollar persistencia de datos.
- Desplegar en entornos de producción y aplicar prácticas de desarrollo en equipo.

### Visión y Actores
- **Visión:** Desarrollar un sistema móvil adaptativo e independiente.
- **Actores:** Administradores, visitantes, usuarios registrados.

### Requerimientos y Herramientas
- **Funcionales:** Nuevas funcionalidades en servidor web, desarrollo de aplicación móvil.
- **Especiales:** Interfaz adaptativa, generación de PDF, validación AJAX.
- **Tecnologías:** HTML5, CSS, JavaScript, AJAX, Bootstrap, iText, JSP, Servlets, Java EE, HSQLDB.
- 
La letra completa y detallada de esta tarea esta [aqui](https://github.com/FranciszekaMateu/tprog-trabajoUy/blob/main/docs/Tarea3_2023_v1.1.pdf)

## Diagrama de Dominio
![Diagrama de dominio](./docs/digModel.png)

## Distribución y arquitectura final
![Distribucion](./docs/distribucion.png)



### Instalación y Uso

A continuación se detallan los pasos para instalar y ejecutar los servidores frontend y backend de la aplicación.

#### Paso 1: Clonar el Repositorio

Primero, clona el repositorio desde GitHub:

```bash
git clone https://github.com/FranciszekaMateu/tprog-trabajoUy.git
```

#### Paso 2: Instalar Java y Maven

##### En Ubuntu

Para instalar Maven:

```bash
sudo apt install maven
```

Si no tienes Java, instálalo así:

```bash
sudo apt install openjdk-11-jdk
```

##### En Arch Linux

Para instalar Maven:

```bash
sudo pacman -S maven
```

Consulta la [Guía para instalar Maven en Windows](https://dev.to/vanessa_corredor/instalar-manualmente-maven-en-windows-10-50pb) si estás utilizando ese sistema operativo.

#### Paso 3: Dar Permisos de Ejecución

Navega al directorio `Deploy` y otorga permisos de ejecución a los scripts:

```bash
cd tprog-trabajoUy/Tarea3/Deploy
chmod +x generarSwing.sh generarWeb.sh levantarSwing.sh levantarWeb.sh
```

#### Paso 4: Ejecutar la Aplicación

Ejecuta los scripts en el siguiente orden:

```bash
./generarSwing.sh
./generarWeb.sh
./levantarSwing.sh
```

Luego, actualiza el archivo `settings.properties` con la dirección de tu servidor. Si estás ejecutando ambos servidores en la misma máquina, usa `localhost`. Para una red local, utiliza la IP local.

```bash
cd ..
echo "http://<tu_direccion_ip>:8080/trabajouy/home" > settings.properties
```

Reemplaza `<tu_direccion_ip>` con la dirección IP correspondiente.

Finalmente, levanta el servidor web:

```bash
./levantarWeb.sh
```







