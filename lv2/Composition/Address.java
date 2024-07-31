public class Address {
    private String street;
    private String city;
    private String zipCode;
    private Country country;

    public Address(String street, String city, String zipCode, Country country){
        this.street=street;
        this.city=city;
        this.zipCode=zipCode;
        this.country=country;
    }

    public String getFullAddress(){
        return street + ", " + city + ", " + zipCode + ", " + country.getName();
    }
}
