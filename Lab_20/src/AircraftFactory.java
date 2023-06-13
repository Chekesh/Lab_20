public class AircraftFactory extends TransportFactory{
    @Override
    public Shipping transport() {
        return new Airplane();
    }
}
