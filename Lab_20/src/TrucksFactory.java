public class TrucksFactory extends TransportFactory{
    @Override
    public Shipping transport() {
        return new Truck();
    }
}
