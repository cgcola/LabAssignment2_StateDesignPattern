public class IdleState implements VendingMachineState {

    @Override
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Product: " + vendingMachine.getSelectedProduct() + " selected. \nPrice: $" + vendingMachine.getCurrentPrice());
        vendingMachine.setState(new ItemSelectedState());
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount){
        System.out.println("Action Denied! Please select a product first.");
    }
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        System.out.println("Action Denied! Please select a product first.");
    }
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        System.out.println("Machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}
