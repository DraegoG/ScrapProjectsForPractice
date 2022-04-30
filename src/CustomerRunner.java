public class CustomerRunner {
    public static void main(String [] args){
        Address homeAddress = new Address("kamroop nagar","kotdwara","246149");
        Address workAddress = new Address("kamroop nagar","kotdwara","246149");
        Customer customer1 = new Customer("Abhishek", homeAddress, workAddress);

        System.out.println(customer1.toString());
    }

}
