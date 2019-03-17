Design Pattern Used for Lab 6-
Strategy
The design pattern is used for printing receipt and packig slip. The interface used for this is PrintingInterface.

To print receipt-
Class PrintPaperReceipt
This class prints the receipt with order contents as-
1. Burger 
    i. patty
    ii. Toppings on top bun
    iii. Toppings on patty
2. Cajun Fries( Basically other order contents)

To print packing slip-
Class PackagingSlip
This class prints packing slip with following sequence of contents-
1. Burger
  i. Toppings on top bun
  ii. Toppings on patty
  iii. Patty
2. Cajun Fries

Output Run Demo-
Receipt-
![Receipt](https://github.com/monakhandat/cmpe202/blob/master/lab6/output/Receipt.jpg)

Packing Slip-
![Packaging Slip](https://github.com/monakhandat/cmpe202/blob/master/lab6/output/Packaging%20Slip.jpg)
