Configuración y Ejecución del Proyecto Spring Boot con Gradle

Configuración y Ejecución del Proyecto Spring Boot con Gradle
=============================================================

Requisitos previos:
-------------------

*   Java Development Kit (JDK) 17 instalado en tu máquina.
*   MySQL 8 instalado en tu máquina (si no está instalado, se proporcionan instrucciones más adelante).

Paso 1: Clonar el proyecto
--------------------------

Clona el proyecto de Spring Boot en tu máquina local utilizando el siguiente comando de Git:

    git clone https://github.com/johnangelmx/proof-bitpei.git

Paso 2: Configurar la base de datos
-----------------------------------

1.  ### Instalación de MySQL 8 (solo si no está instalado)

    Si no tienes MySQL 8 instalado en tu máquina, sigue los pasos a continuación para instalarlo:

2.  ### Configuración de la base de datos

    Dentro del proyecto clonado, ve a la carpeta "Script SQL" y ejecuta los siguientes scripts SQL en el orden mencionado:

        mysql -u root -p < createDatabase.sql

        mysql -u root -p mydb < insertValuesMydb.sql


Paso 3: Configurar el archivo "application.properties"
------------------------------------------------------

1.  Abre el proyecto clonado utilizando tu IDE favorito.

2.  Ve al directorio "src/main/resources".

3.  Abre el archivo "application.properties" y actualiza las propiedades con la siguiente configuración:


        # Configuración de la base de datos
        spring.datasource.url=jdbc:mysql://localhost:3306/mydb
        spring.datasource.username=root
        spring.datasource.password=Pa$$w0rd
        
        # Estrategia de creación de tablas
        # Opciones: create, create-drop, validate, update
        spring.jpa.hibernate.ddl-auto=validate
        
        # Niveles de registro para Hibernate
        logging.level.org.hibernate.SQL=DEBUG
        logging.level.org.hibernate.type.TRACE
        
        # Estrategia de coincidencia de ruta de Spring MVC
        spring.mvc.pathmatch.matching-strategy=ant-path-matcher


4.  Actualiza las propiedades "spring.datasource.username" y "spring.datasource.password" con tus propias credenciales de MySQL.


Paso 4: Ejecutar el proyecto
----------------------------

1.  Abre una terminal o utiliza la terminal integrada de tu IDE.

2.  Navega hasta el directorio raíz del proyecto clonado.

3.  Ejecuta el siguiente comando para construir el proyecto y ejecutarlo:

        ./gradlew bootRun

4.  Una vez que la aplicación se haya iniciado correctamente, podrás acceder a ella a través de la siguiente URL: [http://localhost:8080](http://localhost:8080)

5.  Para acceder a la documentación de la API en Swagger, utiliza la siguiente URL: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

    Esto te mostrará la interfaz de Swagger con todos los endpoints disponibles y la posibilidad de probarlos directamente desde el navegador.


¡Listo! Ahora tienes el proyecto de Spring Boot configurado y ejecutándose en tu entorno local utilizando la base de datos MySQL 8 y Java 17. Además, puedes explorar y probar la API a través de Swagger.

Recuerda que puedes personalizar aún más la configuración y agregar tus propias funcionalidades según tus necesidades. ¡Disfruta desarrollando con Spring Boot!