public interface VendingMachineState {
    public void selectItem(VendingMachine vendingMachine);
    public void insertCoin(VendingMachine vendingMachine, int amount);
    public void dispenseItem(VendingMachine vendingMachine);
    public void setOutOfOrder(VendingMachine vendingMachine);
}
