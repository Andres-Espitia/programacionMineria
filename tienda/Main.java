import java.util.Scanner;

public class Main {
    int producto, cantidad;
     static void menu1() {
         Scanner teclado = new Scanner(System.in);
         int producto, cantidad, opc, numProducto;
         int[] carrito = new int[2];
         int[][] compra;
         System.out.println("Numero de productos que desea comprar: ");
         numProducto = teclado.nextInt();
         compra = new int[1][numProducto];
         do{
             System.out.println("Catalogo tienda TEC");
             System.out.println("1. Mouse -- $45000");
             System.out.println("2. Teclados -- $60000");
             System.out.println("3. Monitores -- $950000");
             System.out.println("4. Ram -- $125000");
             System.out.println("5. Discos Duros -- $280000");
             System.out.println("6. Generar Factura");

             System.out.println("Ingrese el numero del producto o genere su factura: ");
             producto = teclado.nextInt();
             if (producto <= 6 && producto >= 1) {
                 System.out.println("Ingrese la cantidad que desa comprar: ");
                 cantidad = teclado.nextInt();
                 carrito[0]= 0;
                for(int l = 0; l < 2; l ++) {
                    if (carrito[l] == 0) {
                        carrito[0] = cantidad;
                    } else {
                        carrito[1] = producto;
                    }
                }

                for (int j = 0; j < 1; j++){
                    for (int k = 0; k < numProducto; k++){
                        if(compra[j][k] != 0){

                        }
                    }
                    compra = compra;
                }

             }else{
                 System.out.println("Opción no valida, por favor ingrese otra: ");
                 try{
                     Thread.sleep(3*1000);
                 }
                 catch (Exception e ) {
                     System.out.println(e);
                 }
                 menu1();
             }
             opc = producto;
             if (opc == 6){
                 int l = 1;
                 factura(l);
             }else {
                 continue;
             }
         }while(true);

     }

    static void factura(int l){


    }
    boolean salida(){
        return true;
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
