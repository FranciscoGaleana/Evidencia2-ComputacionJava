public class Main {
    public static void main(String[] args) throws Exception {
        
        //Creando objeto con una ubicación válida
        System.out.println("ARCHIVO 1");
        ProcesadorDatos procesador = new ProcesadorDatos();
        procesador.procesarDatos("datos_usuario.txt");

        //Creando objeto con una ubicación inválida
        System.out.println("\nARCHIVO 2");
        ProcesadorDatos procesador2 = new ProcesadorDatos();
        procesador2.procesarDatos("datos_usr.txt");

        //Creando objeto con ruta de un archivo vacío
        System.out.println("\nARCHIVO 3");
        ProcesadorDatos procesador3 = new ProcesadorDatos();
        procesador3.procesarDatos("datos_usuario2.txt");
    }
}
