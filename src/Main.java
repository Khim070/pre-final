public class Main {
    public static void main(String[] args) {
        Customer premiumcustomer = new Customer("Vakhim","Premium");
        Sale s = new Sale(premiumcustomer,"19-02-24");
        s.setServiceExpense(100);
        s.setProductExpense(200);
        s.displayinfo();
    }
}