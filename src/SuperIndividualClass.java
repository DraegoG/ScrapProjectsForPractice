public class SuperIndividualClass {
    private String name;
    private Address homeAddress;
    private Address workAddress;

    SuperIndividualClass(){
        System.out.println("this is superclass constructor");

    }
    public SuperIndividualClass(String name, Address homeAddress, Address workAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public String toString() {
        return "SuperIndividualClass{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                ", workAddress=" + workAddress +
                '}';
    }
}
