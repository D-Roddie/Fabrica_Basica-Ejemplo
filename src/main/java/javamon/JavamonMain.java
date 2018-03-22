package javamon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javamon.controllers.JavamonOSController;

public class JavamonMain {

   public static void main(String[] args) throws Exception {
        System.out.println("JavamonOS 0.1");
        JavamonOSController mainController = new JavamonOSController();
        int option = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (option !=3){
            System.out.println("Select action:");
            System.out.println("1. Create Javamon");
            System.out.println("2. Send it to a NintengoClassic");
            System.out.println("3. Send it to a Nintengo Gameboy");
            System.out.print("Enter String");
            option = Integer.parseInt(br.readLine());
            if (option == 1){
                System.out.print("Escriba el nombre del Javamon (y presione ENTER)? ");
                mainController.CreateJavamon(br.readLine());
                System.out.println("Javamon Creado. Tiene " + mainController.getJavamons().size() + " Javamones" );
            }
            if (option == 2){
                System.out.print("Enviando el primer javamon de la lista ");
                mainController.sendJavamonToNintengoClassic(mainController.getJavamons().get(0));
                System.out.println("Javamon enviado," );
            }
            if(option == 3) {
                System.out.print("Enviando el primer javamon de la lista ");
                mainController.sendJavamonToNintengoGameBoy(mainController.getJavamons().get(0));
                System.out.println("Javamon enviado," );
            	
            }
        }

    }
    
}
