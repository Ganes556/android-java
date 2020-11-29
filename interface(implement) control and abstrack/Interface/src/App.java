public class App implements Call.Laptop{
    
    @Override
    public void label(String name) {
        System.out.println("Laptop name " + name);
        
    }
    @Override
    public void body(String bodyType) {
        System.out.println("body type " + bodyType);
    }
    @Override
    public void ram(int jumlahRam) {
        System.out.println("Ram " + jumlahRam);
    }
    
    public static void main(String[] args) throws Exception {
        Call.Laptop Asus;
        Asus = new App();
        Asus.label("Asus X450CA");
        Asus.body("Very weight");
        Asus.ram(8);

    }
}
