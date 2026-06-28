# Tax Withholding Calculator

This Java console program calculates weekly payroll withholding from a user's gross weekly income. It computes federal tax, Social Security, Medicare, total withholding, and net pay.

## Features

- Accepts gross weekly income from the user.
- Uses conditional logic and compound relational operators to select a federal tax bracket.
- Calculates Social Security at 6.2%.
- Calculates Medicare at 1.45%.
- Displays all dollar amounts with two decimal places.
- Rejects negative income values.

## Requirements

- Java 21 or later

## Compile

```bash
javac TaxWithholdingCalculator.java
```

## Run

```bash
java TaxWithholdingCalculator
```

## Example

```text
Enter gross weekly income: $1500
--- Payroll Summary ---
Gross Income:      $1500.00
Federal Tax:       $330.00
Social Security:   $93.00
Medicare:          $21.75
Total Withholding: $444.75
Net Pay:           $1055.25
```
