import java.util.Scanner;

public class Main {
    static TransportFactory createdTransportFactory(String transportation){
        if(transportation.equalsIgnoreCase("самолет")){
            return new AircraftFactory();
        }
        else if (transportation.equalsIgnoreCase("грузовик")){
            return new TrucksFactory();
        }
        else if(transportation.equalsIgnoreCase("судно")){
            return new ShipsFactory();
        }
        else {
            return null;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете каким путём будет осуществляться перевозка: самолет, грузовик, судно");
        String way = in.next();
        TransportFactory TransportFactory = createdTransportFactory(way);
        Shipping transport = TransportFactory.transport();
        transport.drive();
        //createdTransportFactory(way).transport().drive();
    }
}