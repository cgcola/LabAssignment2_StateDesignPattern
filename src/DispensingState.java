public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine vendingMachine){
        System.out.println("Cannot select: product is currently being dispensed.");
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, int amount){
        System.out.println("Cannot insert coin: product is currently being dispensed.");
    }
    @Override
    public void dispenseItem(VendingMachine vendingMachine){
        vendingMachine.setInventoryCount(vendingMachine.getInventoryCount() - 1);
        System.out.println("Dispensing: " + vendingMachine.getSelectedProduct());
        System.out.println("Change returned: $" + (vendingMachine.getBalance() - vendingMachine.getCurrentPrice()));

        vendingMachine.setBalance(0);
        if(vendingMachine.getInventoryCount() == 0){
            System.out.println("Out of stock! Setting machine out of order.\n");
            vendingMachine.setState(new OutOfOrderState());
        } else {
            System.out.println("Transaction complete. Ready for next purchase.\n");
            vendingMachine.setState(new IdleState());
        }
    }
    @Override
    public void setOutOfOrder(VendingMachine vendingMachine){
        vendingMachine.setState(new OutOfOrderState());
    }
}
