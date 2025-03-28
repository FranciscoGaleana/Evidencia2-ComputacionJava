import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcesadorDatos {
    public void procesarDatos(String rutaArchivo) {
        //Creando arreglo dinámico para guardar objetos de tipo Usuario
        List <Usuario> usuarios = new ArrayList<Usuario>();
        boolean archivoVacio = true;

        //Utilizar un buffer para leer cada línea del archivo
        try (BufferedReader buffer = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 1;

            while ((linea = buffer.readLine()) != null) 
            {
                if (linea.trim().isEmpty()) {
                    continue;
                }
                archivoVacio = false;

                try {
                    String[] partes = linea.split(",");

                    if (partes.length < 3) {
                        throw new ArrayIndexOutOfBoundsException("Formato incorrecto. Faltan datos en la línea: " + numeroLinea + ". " + linea);
                    }
                    else if(partes.length > 3){
                        throw new ArrayIndexOutOfBoundsException("Formato incorrecto. Hay datos de más en la línea: " + numeroLinea + ". " + linea);
                    }

                    String nombre = partes[0].trim();
                    int edad = Integer.parseInt(partes[1].trim());
                    String email = partes[2].trim();

                    if (!email.contains("@"))
                    {
                        throw new IllegalArgumentException("Correo inválido en la línea: " + numeroLinea + ". " + linea); 
                    }

                    usuarios.add(new Usuario(nombre, edad, email));

                } catch (NumberFormatException e) {
                    System.err.println("Edad inválida en la línea: " + numeroLinea + ". " + linea);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.err.println(e.getMessage());
                }

                numeroLinea++;
            }

            if(archivoVacio == true)
            {
                throw new IOException("El archivo está vacío");
            }

            //En caso de que el archivo no se encuentre
        } catch (FileNotFoundException e) {
            System.err.println("Error, archivo no encontrado en la ruta: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        if(!usuarios.isEmpty())
        {
            System.out.println("\nUsuarios procesados correctamente:");
            for (Usuario u : usuarios) {
                System.out.print("Nombre: " + u.getNombre() + ", ");
                System.out.print("Edad: " + u.getEdad() + ", ");
                System.out.println("Email: " + u.getEmail());
            }
        }

        else {
            System.out.println("No hubo usuarios procesados correctamente.");
        }
    }
}
