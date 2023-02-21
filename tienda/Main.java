import java.util.Scanner;

public class Main {
    int producto, cantidad;
     static void menu1() {
         Scanner teclado = new Scanner(System.in);
         int producto, cantidad, numProducto;
         //int[] carrito = new int[2];
         int[][] compra;
         System.out.println("Numero de productos que desea comprar: ");
         numProducto = teclado.nextInt();
         compra = new int[2][numProducto];
         do{
              do{
                  for (int j = 0; j < numProducto; j++){
                      System.out.println("Catalogo tienda TEC");
                      System.out.println("1. Mouse -- $45000");
                      System.out.println("2. Teclados -- $60000");
                      System.out.println("3. Monitores -- $950000");
                      System.out.println("4. Ram -- $125000");
                      System.out.println("5. Discos Duros -- $280000");
                      System.out.println("6. Generar Factura");
                      System.out.println("7. Cancelar compra");

                      System.out.println("Ingrese el numero del producto o genere su factura: ");
                      producto = teclado.nextInt();
                      if (producto >= 1 && producto < 6) {
                          System.out.println("Ingrese la cantidad que desa comprar:");
                          cantidad = teclado.nextInt();
                        /*/carrito[0]= 0;
                        for(int l = 0; l < 2; l ++) {
                        if (carrito[l] == 0) {
                            carrito[0] = cantidad;
                        }else {
                            carrito[1] = producto;
                            }
                    }/*/
                          for (int k = 0; k < 2;){
                              compra[j][k] = producto;
                              compra[j][k++] = cantidad;
                          }
                      }else if(producto < 1 && producto > 7  ){
                          System.out.println("Opción no valida, por favor ingrese otra: ");
                          try {
                              Thread.sleep(3 * 1000);
                          } catch (Exception e) {
                              System.out.println(e);
                          }
                          menu1();
                      }else if (producto == 7){
                          System.out.println("Compra cancelada");
                          try {
                              Thread.sleep(3 * 1000);
                          } catch (Exception e) {
                              System.out.println(e);
                          }
                          menu1();
                      }else if (producto == 6){
                          factura(compra, numProducto);
                      }else {
                          continue;
                      }
                  }
              } while(true);
             //factura(compra, numProducto);
         }while(true);
     }

    static void factura(int[][] compra, int numPorducto){
         for (int i = 0; i < 10; i++){
             for (int j = 0; j < 10; j++){
                 System.out.println(compra[i][j]);
             }
         }
        try {
            Thread.sleep(3 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc1;
        do{
            System.out.println("Opciones de la tienda");
            System.out.println("1. Ingresar a catalogo");
            System.out.println("2. Salir");
            System.out.println("Ingrese la opcion: ");
            opc1 = teclado.nextInt();
        }while(opc1 != 1 && opc1 != 2);
        if (opc1 == 1){
            menu1();
        }else if(opc1 == 2){
            System.out.println("gracias y no vuelva si no va a comprar");
        }
    }
}
