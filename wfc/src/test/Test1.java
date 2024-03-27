package gaspardev.view;

import gaspardev.controller.WaveFuntionColapse;
import gaspardev.model.Grid;
import gaspardev.model.TemporalData;

import java.util.Scanner;

public class Test1 {

    static Scanner input = new Scanner(System.in);
    static WaveFuntionColapse wfc = new WaveFuntionColapse();

    public static void main(String[] args) {

        int op;

        System.out.println("Bienbenido al sistema de generación de mápas 2D");
        System.out.println("Por favor, seleccione una de las siguientes opciones:");

        while (true) {
            op = menu();
            System.out.println();
            switch (op) {
                case 1:
                    System.out.println("Ingrese el directorio de los nuevos patrones");
                    wfc.setNewPath(input.nextLine());
                    break;
                case 2:
                    TemporalData data = askData();
                    wfc.loadTilesRotations(data.getData());
                    wfc = new WaveFuntionColapse(new Grid(data.getWidth(), data.getHeight()));
                    wfc.fillEntropie();
                    break;
                case 3:
                    wfc.showTiles();
                    break;
                case 4:
                    wfc.showTilesFiles();
                    break;
                default:
                    return;

            }
        }

    }

    public static int menu() {

        System.out.println("1º)\tCargar nuevos Patrones");
        System.out.println("2º)\tGenerar un nuevo mapa");
        System.out.println("3º)\tMostrar los patrones cargados");
        System.out.println("4º)\tMostrar los archivos leidos");
        System.out.println("5º)\tSalir");

        int op;

        try {
            op = input.nextInt();
            return op;
        } catch (Exception e) {
            input.next();
            System.out.println("Error: seleccione una de las opciones dadas");
            while (true) {
                return menu();
            }
        }

    }

    public static TemporalData askData() {
        System.out.println("Introduzca el ancho deseado: ");
        int w = input.nextInt();
        System.out.println("Introduzca el alto deseado: ");
        int h = input.nextInt();
        System.out.println("Agregue la dirección de los patrones a utilizar excepto Blank: ");
        short[][] conexcions = new short[wfc.getNumberOfTiles()][4];
        for (int i = 0; i < conexcions.length - 1; i++) {
            System.out.println("Introduzca los datos del patrón " + i + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.println("Introduzca el valor de la posición " + j + ": ");
                conexcions[i][j] = input.nextShort();
            }
        }

        return new TemporalData(w, h, conexcions);

    }

}
