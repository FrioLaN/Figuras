import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int radio, baseCuad, baseRec, alturaRec;

        System.out.println("Empezaremos por un Circulo ;^ ");

        radio = Main.
                getDato(new String[]{"Ingresa el radio del circulo: ", "radio incorrecta, vuelve a intentarlo"});
        System.out.println("Ahora el cuadrado!");

        baseCuad = Main.
                getDato(new String[]{"Ingresa la base del cuadrado: ", "base incorrecta, vuelve a intentarlo"});

        System.out.println("Bien, ahora el rectangulo");

        baseRec = Main
                .getDato(new String[]{"Ingresa la base del rectangulo: ", "base incorrecta, vuelve a intentarlo"});

        alturaRec = Main
                .getDato(new String[]{"Ingresa la altura del rectangulo: ", "altura incorrecta, vuelve a intentarlo"});

        //para el circulo
        Circulo circulo = new Circulo();

        circulo = (Circulo) new Figura
                .FiguraBuilder("circulo")
                .radio(radio)
                .build();

        //para el cuadrado
        Cuadrado cuadrado = new Cuadrado();

        cuadrado = (Cuadrado) new Figura
                .FiguraBuilder("cuadrado")
                .base(baseCuad)
                .build();

        //para el rectangulo
        Rectangulo rectangulo = new Rectangulo();

        rectangulo = (Rectangulo) new Figura
                .FiguraBuilder("rectangulo")
                .base(baseRec)
                .altura(alturaRec)
                .build();

        //mostrando los resultados
        circulo.Mostrar_Resultados();
        cuadrado.Mostrar_Resultados();
        rectangulo.Mostrar_Resultados();
    }

    public static int getDato(String[] msj){
        int dato;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print(msj[0]);
            try{
                dato = Integer.parseInt(scanner.nextLine());
                return dato;
            }catch (Exception e){
                System.out.println(msj[1]);
            }

        }
    }


}