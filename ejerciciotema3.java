/*Primera parte:
    - Crear una función con tres parámetros que sean números que se suman entre sí.
    - Llamar a la función en el main y darle valores. */

public class ejerciciotema3 {

    public static void main(String[] args) {
        int result = sum(20, 5, 1995);
        System.out.println("The sum is equal to: " + result); 
    }

    public static int sum(int num1, int num2, int num3){
        return (num1 + num2 + num3);
    }
}

/*Segunda parte:
    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.*/

class Car {
    int doors;
  
    public void raiseNumDoors() {
        doors = doors + 1;
    }
    
public static void main(String[] args) {
    Car myCar = new Car();
    myCar.doors = 4;
    myCar.raiseNumDoors();
    System.out.println("The Car object has: " + myCar.doors + " doors.");
}
}
  
  
  
  