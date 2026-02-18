<h1>Lab Assignment 2: State Design Pattern</h1>

<h4>Problem:</h4>
<p>A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.</p>

<h4>Requirements:</h4>
<ol>
  <li><strong>Idle State:</strong>
    <ul>
      <li>Allow item selection.</li>
      <li>Disallow dispensing items and inserting coins.</li>
    </ul></li>

  <li><strong>ItemSelected State:</strong>
    <ul>
      <li>Allow inserting coins and dispensing items.</li>
      <li>Disallow item selection.</li>
    </ul></li>
    
  <li><strong>Dispensing State:</strong>
    <ul>
      <li>Allow no operations.</li>
      <li>Automatically transition back to the "Idle" state after dispensing is complete.</li>
    </ul></li>

  <li><strong>OutOfOrder State:</strong>
  <ul>
    <li>Disallow all operations.</li>
  </ul>
  </li>
</ol>

<p><strong>Current System:</strong> The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.</p>

<h4>Implement the State Pattern to improve code maintainability and flexibility:</h4>
<ol>
  <li><strong>Define VendingMachine States:</strong>
    <ul>
      <li>Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.</li>
    </ul></li>

  <li><strong>Implement State Interface:</strong>
    <ul>
      <li>Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.</li>
    </ul>
  </li>

  <li><strong>Implement State Behaviors:</strong>
  <ul>
    <li>Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.</li>
  </ul></li>

  <li><strong>Update VendingMachine Class:</strong>
  <ul>
    <li>Include attributes for item inventory and balance.</li>
    <li>Remove state-specific logic from the VendingMachine class.</li>
    <li>Introduce a reference to the current VendingMachineState object.</li>
    <li>Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.</li>
  </ul>
  </li>
</ol>

<hr>

### UML Diagram:
<img width="4005" height="1072" alt="image" src="https://github.com/user-attachments/assets/988ccdda-a407-4c1d-a256-443d8cd9ed20" />
