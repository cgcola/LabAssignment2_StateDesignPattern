public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine){
        System.out.println("Product already selected.");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount){
        vendingMachine.setBalance(vendingMachine.getBalance() + amount);
        System.out.println("Inserted: $" + amount + ".\nTotal Balance: $" + vendingMachine.getBalance());
    }
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        System.out.println("Payment received. Moving to dispensing...");
        vendingMachine.setState(new DispensingState());
        vendingMachine.getCurrentState().dispenseItem(vendingMachine);
    }
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        System.out.println("Machine is now out of order.");
        vendingMachine.setState(new OutOfOrderState());
    }
}
