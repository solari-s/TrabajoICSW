# ICSW
Reentrega tp n°1 ingenieria y calidad de software 

# Tecnologías utilizadas

* Java 21 
* Proyecto Springboot con Maven 

### ¿Cómo podemos documentar con git? 
En el archivo README.md se debe documentar una visión integral que permita a cualquier desarrollador comprender, ejecutar y colaborar en el proyecto desde el primer momento. Principalmente, se incluye una descripción general del sistema y sus objetivos, los prerrequisitos técnicos de software, las instrucciones claras paso a paso para compilar y ejecutar la aplicación localmente, y la forma de correr la suite de pruebas automatizadas. Asimismo, se documenta la arquitectura básica del proyecto, las variables de configuración requeridas para el entorno, la estructura de ramas y flujo de trabajo adoptado (Gitflow), junto con las pautas de contribución y las licencias correspondientes. 

Versionar este archivo dentro de Git garantiza que la documentación evolucione de manera sincronizada y trazable con el código fuente en cada versión o entrega.

### Si un externo al equipo realiza una modificación, necesitamos entender el cambio realizado (PR o Pull Request). ¿Qué datos le pediría a esa persona que complete? 

Cuando una persona externa al equipo propone una modificación a través de un Pull Request, es fundamental que provea contexto suficiente para evaluar el impacto del cambio. Se le debe solicitar un título claro y descriptivo del aporte, la motivación o justificación técnica de la modificación (indicando si resuelve un error puntual o implementa una nueva funcionalidad), y el enlace al issue o requerimiento correspondiente. También debe detallar el enfoque de la solución aplicada, los pasos exactos para reproducir y probar los cambios, el tipo de modificación introducida (especificando si rompe compatibilidad con versiones previas) y una confirmación de que se han corrido las pruebas locales pertinentes sin fallos.

### ¿Qué nos ofrece GitHub para ayudarnos con esto? 

Para estandarizar y facilitar este proceso, usamos los Pull Request Templates de GitHub, que precargan de forma automática una estructura obligatoria con secciones y preguntas cada vez que alguien abre un PR. Adicionalmente, GitHub provee la funcionalidad de Branch Protection Rules para exigir revisiones de código y validaciones automáticas antes de integrar cualquier cambio, el archivo .github/CODEOWNERS para asignar automáticamente los revisores designados según los archivos modificados, y los flujos de GitHub Actions para validar la compilación y los tests de forma continua.
