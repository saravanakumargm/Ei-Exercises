## OVERVIEW
  This console baseed application is designed for the process of opening a bank account. Using the Abstract Factory Design       
  Pattern, it ensures a clean and maintainable code structure.
  
## Features
  **User-friendly Input**: Prompt users to enter their name, mobile number, Aadhaar number, and account type.
  **Account Types**: Choose from various account types (e.g., Savings, Current, Fixed Deposit).
  **Detail Display**: Show the account details after successfully opening the account.
  **Robust Design**: Utilizes the Abstract Factory Design Pattern to ensure flexibility and scalability.
  
## Design
**Strategy Design Pattern**
  **Account Creation** : BankBranch class handles the main function of the application, creating the bank account.
  **Abstract Factories** : The account creation logic is abstracted by the interface AccountFactory and implemented by     
  BankBranchFactory, thereby encapsulating and abstracting the details.
  User Details
  **Account Factory** : Classes such as SavingAccont and CurrentAccount handles the factory implementation while Account being    the Factory class

## Installation
  - git clone https://github.com/yourusername/bank-account-opening-app.git
  - cd bank-account-opening-app
  - javac -d bin src/*.java
  - After compiling, run the application in cmd.

## USAGE
  1. Start the application
  2. Input the details
      - Name<br/>
      - Mobile Number<br/>
      - Aaadhar Number<br/>
      - Account Type<br/>
  3. After successfully completing the process, user details will be shown.

## Example Output
----------Account Details----------

Name : SaravanaKumar<br/>
Mobile Number : 9080977652<br/>
Account Type : Savings<br/>
    Account Created Successfully!<br/>

## Contact

Email : saravanakumargm00@gmail.com
GitHub :  saravanakumargm00

