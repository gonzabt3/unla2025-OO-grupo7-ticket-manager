# Proyecto Grupo7 Ticket Manager Programacion Orientada a Objetos 2 de la UNLA.

Pasos a seguir para levantar el proyecto:
 * Version de Java 17 o superior.
 * Maven 3 o superior.
 * Plugin de lombok configurado en su IDE.
 * MySQL como Base de Datos.
 * Crear una Base de Datos con la siguiente instruccion **create database bd-oo2-grupo7;** 
 * Abrir el proyecto y revisar que se descarguen las dependencias, en caso de que no abrir una terminal en la raiz del proyecto y ejecutar esta instruccion: **mvn clean install**
 * Configurar las variables de entorno para que el archivo application.properties las reconozca antes de iniciar la aplicacion:
   * DB_URL -> jdbc:mysql://localhost:3306/bd-oo2-grupo7?useSSL=false&serverTimezone=UTC
   * DB_USERNAME -> colocar tu usuario de la base de datos.
   * DB_PASSWORD -> colocar tu password de la base de datos.
 * Ejecutar el proyecto. Si todo esta correcto aparece que la aplicacion inicio en x segundos en el puerto 8080.
 * Abrir el navegador e ir a la siguiente url: **http://localhost:8080/swagger-ui/index.html**

