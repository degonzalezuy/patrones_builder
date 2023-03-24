package builder.dto;

public class Address {
    private String adress;
    private String city;
    private String country;
    private String cp;

    public Address() {
    }

    public Address(String adress,  String country, String city, String cp) {
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.cp = cp;
    }


    /***
     * SETS & GETS
     * ---------------------------------------------------------------------------------------------------------------
     */
    public String getAddress() {
        return adress;
    }

    public void setAddress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + adress + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
