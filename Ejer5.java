public class Ejer5 {
    public static void main(String[] args) {
        String estacion = "otoño";
        switch (estacion){
            case "primavera":
                System.out.println("Es priamvera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es ninguna estacion");
        }
    }
}
