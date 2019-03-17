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
COPIED FROM CONSOLE. PLEASE SEE SCREENSHOTS IN THE FOLDER FOR ACTUAL DEMO


Receipt-
	   FIVE GUYS
	BURGERS AND FRIES
	STORE # CA-1294
	5353 ALMADEN EXP N60
	SAN JOSE, CA 95118
	(P) 408-264-9300


     12/1/2016	1:46:54 PM
	   FIVE GUYS
Order Number: 	45
LBB		5.59
{{{{ Bacon}}}}
Lettuce
Tomato
->| G Onion
->| JALA Grilled

LTT CAJ		2.79
Sub. Total:	8.38
Tax:		2.26
Total:		18.27



Packing Slip-
Order Number: 45
     12/1/2016	1:46:54 PM
	   FIVE GUYS
LBB
Lettuce
Tomato
->| G Onion
->| JALA Grilled
{{{{ Bacon}}}}
LTT CAJ
