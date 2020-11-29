public class Call{
    public interface Laptop{
        void label(String name);
        void ram(int jumlahRam);
        void body(String bodyType);
    }
    public interface Hp{
        void label(String label);
        void marketName(String marketName);
        void power(int power);
    }
}