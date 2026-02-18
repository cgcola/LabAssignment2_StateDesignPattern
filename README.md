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
</ol>
