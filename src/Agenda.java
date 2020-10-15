import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

        String agenda[][] = new String[5][6];
        Scanner sc = new Scanner(System.in);
        int opcio;
        int numDeRegistres = 0;

        for (int i = 0; i < agenda.length; i++) {
            System.out.print("Introdueix el teu dni (0 per sortir): ");
            String dni = sc.nextLine();
            if (dni.equals("0")) {
                break;
            } else {
                agenda[i][0] = dni;
            }
            System.out.print("Introdueix el teu nom: ");
            agenda[i][1] = sc.nextLine();
            System.out.print("Introdueix el teu cognom: ");
            agenda[i][2] = sc.nextLine();
            System.out.print("Introdueix la teva adreça: ");
            agenda[i][3] = sc.nextLine();
            System.out.print("Introdueix el teu mail:  ");
            agenda[i][4] = sc.nextLine();
            System.out.print("Introdueix el teu telefon: ");
            agenda[i][5] = sc.nextLine();
            numDeRegistres++;

        }

        while (true) {
            System.out.println("################");
            System.out.println("#     MENÚ     #");
            System.out.println("################");
            System.out.println("0 - Sortir");
            System.out.println("1 - Buscar per dni");
            System.out.println("2 - Modificar camp");
            System.out.println("3 - Eliminar");
            System.out.println("4 - Mostrar ");

            System.out.println("################");

            opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 0:

                    break;
                case 1:
                    String dniABuscar;
                    System.out.print("Introdueix el DNI a buscar: ");
                    dniABuscar = sc.nextLine();
                    boolean trobat = false;
                    for (int i = 0; i < numDeRegistres; i++) {
                        if (agenda[i][0].equalsIgnoreCase(dniABuscar)) {
                            trobat = true;
                            System.out.println("DNI Trobat!!");
                            System.out.println("Nom : " + agenda[i][1]);
                            System.out.println("Cognom: " + agenda[i][2]);
                            System.out.println("Adreça : " + agenda[i][3]);
                            System.out.println("Mail: " + agenda[i][4]);
                            System.out.println("Telefon: " + agenda[i][5]);
                            break;

                        }

                    }
                    if (!trobat) {
                        System.out.println("No s'ha trobat el dni.");
                    }
                    break;

                case 2:
                    System.out.print("Introdueix el DNI a buscar: ");
                    dniABuscar = sc.nextLine();
                    boolean trobatDni = false;
                    for (int i = 0; i < numDeRegistres; i++) {
                        if (agenda[i][0].equalsIgnoreCase(dniABuscar)) {
                            trobatDni = true;
                            int opcioTriada;
                            System.out.println("1 - Adreça : " + agenda[i][3]);
                            System.out.println("2 - Mail: " + agenda[i][4]);
                            System.out.println("3 - Telefon: " + agenda[i][5]);
                            opcioTriada = sc.nextInt();
                            sc.nextLine();
                            switch (opcioTriada) {
                                case 1:
                                    System.out.println("introdueix la nova adreça: ");
                                    agenda[i][3] = sc.nextLine();
                                    break;
                                case 2:
                                    System.out.println("introdueix el nou mail: ");
                                    agenda[i][4] = sc.nextLine();
                                case 3:
                                    System.out.println("introdueix el nou tlfn: ");
                                    agenda[i][5] = sc.nextLine();
                                    break;


                            }
                            System.out.println("Dades Modificades OK");
                            break;

                        }

                    }
                    if (!trobatDni) {
                        System.out.println("No s'ha trobat cap registre");
                    }
                    break;
                case 3:
                    System.out.print("Introdueix el DNI a eliminar: ");
                    dniABuscar = sc.nextLine();
                    boolean trobatDniAEliminar = false;
                    for (int i = 0; i < numDeRegistres; i++) {
                        if (agenda[i][0].equalsIgnoreCase(dniABuscar)) {
                            trobatDni = true;
                            String opcioTriada;
                            System.out.println("Estàs segur d'eliminar a " + agenda[i][1] + " " + agenda[i][2] + "?");
                            opcioTriada = sc.nextLine();
                            if (opcioTriada.equalsIgnoreCase("S")) {
                                agenda[i] = null;
                                System.out.println("Element Eliminat");
                                for(int x = i;x<numDeRegistres;x++){
                                    agenda[x] = agenda[x+1];
                                }
                                agenda[numDeRegistres-1]=null;
                                numDeRegistres--;
                            }

                        }
                    }
                    break;
                case 4:
                    for(int i=0;i<agenda.length;i++){
                        for(int j=0; j<agenda[0].length;j++){

                            System.out.println(agenda[i][j]+ " - ");
                        }
                        System.out.println();
                    }
                    break;
            }

        }

    }

}
