public class exemplosconstantes2 {
    public static void main(String[] args) {

        final int ON = 1;
        final int INI = 2;
        final int WAIT = 3;
        final int STOP = 4;
        final int MAN = 5;

    


        int etapa = INI;



        switch (etapa) {
            case ON:
                System.out.println("START");
                break;
                case INI : 
                System.out.println("inicializando");
                break;
                case WAIT: 
                System.out.println("aguardando peça ...");
                break;
                case STOP:
                    System.out.println("Sistema parado...");
                    break;
                    case MAN:
                        System.out.println("manutenção das maquinas");
        
            default:
                break;
        }
    }
}
