package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
        this.addressLine1="";
        this.addressLine2="";
        this.city="";
        this.state="";
        this.zipcode="";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1=addressLine1;
        this.addressLine2=addressLine2;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;
    }

    public String getAddressLine1() {
        return this.addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1=addressLine1;
    }

    public String getAddressLine2() {
        return this.addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2=addressLine2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state=state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode=zipcode;
    }

    @Override
    public String toString(){
        return String.format("Address{addressLine1='%s', addressLine2='%s', city='%s', state='%s', zipcode='%s'}",
                this.addressLine1, this.addressLine2, this.city, this.state, this.zipcode);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(o==null || this.getClass() != o.getClass())return false;
        Address ao = (Address)o;
        if(!this.zipcode.equals(ao.zipcode))return false;
        if(!this.state.equals(ao.state))return false;
        if(!this.city.equals(ao.city))return false;
        if(!this.addressLine1.equals(ao.addressLine1)) return false;
        return this.addressLine2.equals(ao.addressLine2);
    }
}
