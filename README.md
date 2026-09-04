¿Qué diferencia existe entre lanzar y capturar una excepción?
Lanzar (throw) es la acción de crear un objeto de error y detener el flujo normal para avisar que algo salió mal. Capturar (catch) es la acción de recibir ese objeto de error y reaccionar a él para que el programa no colapse.

¿Qué función tiene try?
Envolver y aislar el bloque de código que es propenso a fallar.

¿Qué función tiene catch?
Definir el "plan de acción" o rescate que se ejecutará si ocurre un tipo de error específico dentro del try.

¿Cuándo resulta útil finally?
Cuando necesitas ejecutar código de limpieza de forma obligatoria, sin importar si hubo errores o no (como cerrar streams o conexiones).

¿Qué ventaja tiene try-with-resources?
Reduce la cantidad de código repetitivo y asegura que los recursos se cierren solos, previniendo fugas de memoria (memory leaks).

¿Cuál es la diferencia entre throw y throws?
throw se usa dentro del cuerpo del método para ejecutar el lanzamiento de la excepción (acción). throws se pone en la firma del método para advertirle a quien lo llame que "este método es capaz de lanzar estas excepciones".

¿Por qué conviene utilizar excepciones específicas?
Porque permite reaccionar de forma distinta dependiendo del problema. No tratas igual a un archivo inexistente (puedes pedirle al usuario otra ruta) que a un dato mal escrito en el texto.

¿Cuándo tiene sentido crear una excepción personalizada?
Cuando los errores nativos de Java no representan el problema de negocio real. Un NumberFormatException avisa sobre un formato, pero un CalificacionInvalidaException es mucho más claro para las reglas de nuestro dominio.

¿Por qué no se recomienda capturar Throwable?
Porque engloba Error (problemas graves de la máquina virtual de Java). Al atrapar Throwable podrías estar ocultando fallos críticos irrecuperables.

¿Qué efecto tiene ignorar una excepción?
Genera bugs silenciosos. El programa parece funcionar correctamente, pero su estado interno es inconsistente o corrupto, lo que hace casi imposible rastrear de dónde viene un fallo después.

¿Qué información debería proporcionar un buen mensaje de excepción?
Debe responder qué falló, por qué falló y, de ser posible, qué valor específico lo provocó (ej. "La calificación 110 está fuera del límite").

¿En qué casos conviene propagar una excepción en lugar de capturarla inmediatamente?
Cuando el método actual es un método de bajo nivel que no tiene el contexto necesario para decidir qué hacer con el error. Es mejor delegarlo hacia arriba (propagación) para que, por ejemplo, la capa de interfaz gráfica decida cómo mostrar el mensaje de error al usuario.
