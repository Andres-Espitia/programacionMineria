import java.util.Scanner;

public class Main {
    int producto, cantidad;
     static void menu1() {
         int producto, cantidad, opc;
         for (int i = 0; i < 6; ) {
             Scanner teclado = new Scanner(System.in);
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
                 int compra[] = {producto, cantidad};
                 for (int j = 0; j < 1; ) {
                     int carrito[][];
                     if (false) {

                     }
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
             i = producto;
             opc = producto;
             if (opc == 6){
                 factura();
             }else {
                 System.out.println("prueba");
             }
         }
     }

    static void factura(int carrito){

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
            System.out.println("gracias y no vuelva si no va a1 comprar");
        }
    }
}
