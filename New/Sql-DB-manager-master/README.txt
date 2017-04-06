SQL DATABASE
======= GRUPO ======
Santiago Paiz - 15849
Luisa Arboleda - 14458
Andres Oliva - 12149

------- VERSIÓN 1.1 ------
SQL DATA BASE MANAGER v1.1

======================================
INSTRUCCIONES
	Se debe descargar los tres jars de GSON 2.2.2. proporcionado por el link en descargas. Y ANTLR de java también proporcionada por el link en descargas. Esta se debe importar directamente al IDE que se desee.
En este caso voy a utilizar a Eclipse que fue el IDE usado por el grupo. 
Se importa el proyecto en Eclipse, se selecciona el proyecto y con right-click se escoge Build Path, Configure Build Path. En "Library" se selecciona Add Library -> User Library -> User Libraries -> New -> [proporcionar Nombre de Libreria]. Despues de seleccionar el nombre se escoge "Add External JARs" y se selecciona el GSON-2.2.2.jar descargado. Se selecciona Ok y Finish. Esto lo despliega ahora en la Librería. De aquí hay que expandirlo (la libreria de gson) y expandir el "gson-2.2.2.jar" y se selecciona "Source Attachment: None" y se preciona el botón External File. Aqui hay que seleccionar la opción de "External location" para habilitar la opción External file y se selecciona. Se buscar el folder gson-2.2.2.jar. Se preciona OK.
Ahora se selecciona el "Javadoc Location" y se repite el proceso anterior pero envez de buscar el "gson-2.2.2-source.jar" se busca el "gson-2.2.2-javadoc.jar". Se preciona OK. Despues se van a proyectos, se le pone un checke a gson y se preciona UP para que este ensima de la libreria default. 
	Para ANTLR se vuelve a meter en Library se selecciona "Add External JARs" y se selecciona el documento de anltr-4.6 proporcionado en las descargas. Se preciona "OK" y esta listo para ser usada.


======================================
COMPLEMENTOS USADOS
	ANTRL
	GSON
	ECLIPSE

======================================
DESCARGAS

GSON - https://www.versioneye.com/java/com.google.code.gson:gson/2.2.2 
ANTRL - http://www.antlr.org/download.html

