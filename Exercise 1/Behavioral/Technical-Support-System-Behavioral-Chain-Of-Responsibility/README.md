# Technical Support System Application
# Overview
  This application is a console-based technical support system designed using the Chain of Responsibility pattern, a behavioral design pattern. The system effectively handles various support issues such as password changes, account information updates, and more serious issues.

# Features
**Password Change: Handles user requests for changing their passwords.**
**Account Information Update: Manages requests to update user account details.**
**Serious Issues: Processes and escalates more serious technical issues as needed.**

# Design Pattern
  The application leverages the Chain of Responsibility pattern to ensure that each request is processed by the appropriate handler in the chain. This pattern allows for the decoupling of request senders and receivers, promoting flexibility and reusability.

# Components
**Handlers: Various classes implementing the handler interface to process different types of requests.**
**Client: The SupportSystem class where user inputs are taken and passed through the chain of handlers.**

# Setup and Usage

# Installation
- git clone https://github.com/saravanakumargm/EI-Exercises/Behaviorial/Technical-Support-System-
- cd Technical Support System
- Run the application

# Example 

	Tell Your Issues<br/>
1.Password Reset 2.Account Modification 3.Application Issues<br/>
1<br/>
Enter new password : <br/>
mypassword<br/>
Password Changed!<br/>

	Tell Your Issues<br/>
 1.Password Reset 2.Account Modification 3.Application Issues<br/>
2<br/>
1.Change Name 2.Change Mobile Number 3.Change Email<br/>
2<br/>
Enter Mobile Number : <br/>
9082645851<br/>
Mobile Number Changed!<br/>

	Tell Your Issues<br/>
 1.Password Reset 2.Account Modification 3.Application Issues<br/>
3<br/>
Our team will reach you through call soon!<br/>

# Contact  
**Email : saravanakumargm00@gmail.com**
**GitHub : saravanakumargm00**
