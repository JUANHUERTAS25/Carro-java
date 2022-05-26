package ejecutable;

import modelo.Carro;

public class carro {
    
    public static void main(String[] args)
    {
        

        //1. Crear un carro rojo en la posición (0,0), mostrar la información del carro creado
        Carro carro1 = new Carro("Rojo", 0, 0);
        System.out.println("El color del carro es: " + carro1.getColor() + "\nY esta en la posición (" + carro1.getPosX() + " , " + carro1.getPosY() + ")");
       
        //2. Cambiar el color del carro
        carro1.setColor("Blanco");
        System.out.println("Ahora el color del carro es: " + carro1.getColor());
        //3. Acelerar el carro, cambiar la posición del carro
        carro1.mover(100, 200);
        carro1.acelerar();
        System.out.println("El carro está en la posición (" + carro1.getPosX() + " , " + carro1.getPosY() + ") y tiene aceleración de: " + carro1.getVelocidad());

        //4. Crear un carro verde en la posición (200,300)
        Carro carro2 = new Carro("Verde", 200, 300);
        System.out.println("\nEl color del carro 2 es: " + carro2.getColor() + "\nY esta en la posición (" + carro2.getPosX() + " , " + carro2.getPosY() + ")");

        //5. Crear un carro negro en la posición (1000,1000)
        Carro carro3 = new Carro("Negro", 1000, 1000);
        System.out.println("\nEl color del carro 3 es: " + carro3.getColor() + "\nY esta en la posición (" + carro3.getPosX() + " , " + carro3.getPosY() + ")\n");
        
        //6. Crear un vector de carros
         Carro[] carros = new Carro[3];

         carros[0] = carro1;
         carros[1] = carro2;
         carros[2] = carro3;
        // Crear el método toString a la clase carro
        //Finalmente mostrar la información del vector de carros que se creo

        for(int i=0;i<3;i++)
        {
            System.out.println(carros[i]);
        }
        

        

    }
}
