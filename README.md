# SC-303-Cliente-Servidor-Practica-Programada1
Sistema Solar
Enunciado:
Crea un sistema que permita modelar diferentes planetas del sistema solar. Cada planeta debe tener características como nombre, tamaño, distancia al sol, número de lunas y un método para calcular su año (tiempo que tarda en dar una vuelta completa al Sol). Además, el sistema debe permitir comparar planetas por tamaño y distancia al Sol, y agruparlos por tipo (rocoso o gaseoso).

Explicación de los conceptos:

Abstracción: La interfaz Planeta define las características esenciales de un planeta, mientras que la clase abstracta CuerpoCeleste representa un cuerpo celeste en general.
Encapsulamiento: Cada clase encapsula sus atributos y proporciona métodos para acceder a ellos.
Herencia: Las clases PlanetaRocoso y PlanetaGaseoso heredan de la clase Planeta, añadiendo características específicas a cada tipo de planeta.
Polimorfismo: Puedes crear un arreglo de Planeta y almacenar diferentes tipos de planetas, cada uno con su propia implementación de calcularAño.
Interfaces: La interfaz Planeta define un contrato que todos los planetas deben cumplir.
