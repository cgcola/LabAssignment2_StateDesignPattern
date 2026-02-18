public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        System.out.println("--- Transaction 1: Energy Bar ---");
        vendingMachine.selectItem("Energy Bar", 2);
        vendingMachine.insertCoin(5);
        vendingMachine.dispenseItem();

        System.out.println("--- Transaction 2: Energy Drink ---");
        vendingMachine.selectItem("Energy Drink", 3);
        vendingMachine.insertCoin(3);
        vendingMachine.dispenseItem();

        System.out.println("--- Transaction 3: Chocolate Bar (Testing 0 Inventory and Out of Order State) ---");
        vendingMachine.selectItem("Chocolate Bar", 1);
    }
}
