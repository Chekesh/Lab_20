public class ShipsFactory extends TransportFactory{

    @Override
    public Shipping transport() {
        return new Ship();
    }
}
