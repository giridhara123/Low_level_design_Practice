public final class Address {

    private final String street;
    private final String city;
    private final String state;
    private final String zip;
    //constructors parameters asigned with validation helper
    public Address(String street, String city, String state, String zip) {
        this.street = mustNotBlank(street,"street");
        this.city = mustNotBlank(city,"city");
        this.state = mustBeTwoLetters(state);
        this.zip = mustBeZip(zip);
    }
    //getters methods.
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZip() {
        return zip;
    }
    // toString method
    public String toString() {
        return street + " " + city + " " + state + " " + zip;
    }
    //methods for validation helpers
    private static String mustNotBlank(String s, String feild)
    {
        if(s==null || s.trim().isEmpty())
            throw new IllegalArgumentException(feild+" cannot be null or empty");
        return s.trim();
    }
    private static String mustBeTwoLetters(String s) {
        String v= mustNotBlank(s,"state").toUpperCase();
        if(!v.matches("^[A-Z]{2}$"))
            throw new IllegalArgumentException("state must be 2 letters");
        return v;
    }
    private static String mustBeZip(String s) {
        String v= mustNotBlank(s,"zip");
        if(!v.matches("^[0-9]{5}$"))
            throw new IllegalArgumentException("zip must be 5 letters");
        return v;
    }


}

//  Address a = new Address("            2450     camellia", "  atlanta", " GA"," 30324");
//  System.out.println(a.toString());
// System.out.println(a.getCity());
// System.out.println(a.getState());
//  System.out.println(a.getZip());
// System.out.println(a.getStreet());



