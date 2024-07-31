public class Main{
    public static void main(String[] args) {
        Country usa = new Country("United States");

        Address myAddress = new Address("123 Main St", "NewYork", "12345", usa);

        System.out.println("My Address : "+myAddress.getFullAddress());
    }
}