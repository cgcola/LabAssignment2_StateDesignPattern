public class VendingMachine {
    private VendingMachineState currentState;
    private int inventoryCount;
    private int balance;
    private String selectedProduct;
    private int currentPrice;

    public VendingMachine(int inventoryCount){
        this.inventoryCount = inventoryCount;
        this.balance = 0;
        this.currentState = new IdleState();
    }

    public void selectItem(String item, int price){
        this.selectedProduct = item;
        this.currentPrice = price;
        currentState.selectItem(this);
    }

    public void insertCoin(int amount){
        currentState.insertCoin(this, amount);
    }
    public void dispenseItem(){
        currentState.dispenseItem(this);
    }
    public String getSelectedProduct(){
        return this.selectedProduct;
    }
    public int getCurrentPrice(){
        return this.currentPrice;
    }
    public void setState(VendingMachineState state){
        this.currentState = state;
    }
    public VendingMachineState getCurrentState(){
        return this.currentState;
    }
    public int getInventoryCount(){
        return this.inventoryCount;
    }
    public void setInventoryCount(int inventoryCount){
        this.inventoryCount = inventoryCount;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
}
