# Strategy Design Pattern
Solución tarea 2, ejemplo sobre patron de diseño estrategia.

El ejemplo se hizo lo más simple posible para que se pueda entender este patrón. Este ejemplo consiste en 5 simulaciones de dos enseñanzas básicas de primaria, matemáticas y educación física. Tenemos la interfaz Teacher, que va a definir el comportamiento de un profesor. La clase Contexto que dependiendo la petición del estudiante (en este caso cada simulaciòn tiene un nùmero pseudoaleatorio para definir que enseñar, la probabilidad de enseñar matemàticas es del 60% y de educaciòn fìsica del 40%) ejecutarà el mètodo Teach() de la interfaz Teacher que dependiendo el tipo de profesor mostrará en consola el mensaje "2+2=4" o "HAcer test de cooper para evaluar vo2max" para el caso de un profesor de matemàticas y de educaciòn fìsica, respectivamente.Se tienen las clases MathTeacher y PhysicalEducationTeacher, para un profesor de matemàticas y de educaciòn fìsica respectivamente. 

# Instrucciones
1. Clonar repositorio
2. Abrir proyecto con eclipse
3. Ejecutar, en consola se mostrarà la forma en que cada profesor "enseña"

**El proyecto se hizo en java usando eclipse.

