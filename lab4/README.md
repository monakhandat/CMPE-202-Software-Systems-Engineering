Class: Customer

Responsibility:
-	Register for table
-	Receive text messages for available table
-	Get total visitor count along with the main customer
-	Confirm Reservation
-	Cancel Reservation

Collaborators:
-	SignUp
-	NotifyCustomer


Class: SignUp

Responsibilites:
-	Gets reservation/registration details from customers

Collaborators:
-	Customer
-	TableHelper


Class: NotifyCustomer

Responsibilites:
-	Accept table request from Customer
-	Notify Customer table status
-	Allocate table to customers based on queue and provided number of people match the number of chairs on available table
-	Get available table status

Collaborators:
-	Waitlist
-	TableQueue
-	Customer
-	DiningTable


Class: Waitlist 

Responsibilites:
-	Add customer to waiting queue if table is not available
-	Remove customer from waiting queue if customer chooses to leave or if table is available

Collaborators:
-	NotifyCustomer
This class holds waitlist queue


Class: TableQueue

Responsibilites:
-	Get available table
-	Get chair count of available table

Collaborators:
-	NotifyCustomer
-	DiningTable


Class: DiningTable

-	Contains information of all the tables- seating capacity(chair count), table number

Design Patterns used:

State Pattern:
In this scenario, the NotifyCustomer executes different behaviors according to the TableQueue State. If the state returned by TableQueue is unavailable, then the Waitlist will perform addToWaitlist operation and the state will get changed to unavailable, and if the state returned is available then Waitlist will perform removeFromWaitlist operation followed by allocateTable operation and the state will change to available. In this State design pattern, a Waitlist object’s behavior is the result of state returned by TableQueue, and the behavior gets changed at runtime according to the state.

Singleton Pattern:
NotifyCustomer handles all issues like allocating table, adding customers to waiting list. This pattern makes instantiation of class to one object of NotifyCustomer and it handles all work. Therefore, single configuration handler is NotifyCustomer here.

