# Satellite Command System

## Overview

The Satellite Command System is a console application that simulates the control and management of a satellite in orbit. The system allows users to control various aspects of the satellite, including its orientation, solar panel status, and data collection activities. The satellite starts in a default initial state and can be directed to perform different operations through a series of commands.

## Features

- **Control Satellite Orientation:** Change the satellite's orientation in space.
- **Manage Solar Panels:** Toggle the solar panels between on and off states.
- **Data Collection:** Start and stop data collection operations.

## Installation

1. **Clone the Repository**

   git clone https://github.com/saravanakumargm/Satellite-Command-System
   
2.**Navigate to Project Directory**

   cd satellite-command-system
   
3. **Compile the code**

     javac -d bin src/*.java

## **USAGE**
1. Run the Application
     Follow the above proceedures and run the application in the command prompt
2.Available Commands
    * Rotate
    * Activate Panels
    * Collect Data
    * Satellite State
    * Exit
3.Sample Execution
  1.Rotate 2.Activate Panels 3.Collect Data 4.Show Satellite State 5.Exit<br/>
  4<br/>
  Orientation : South<br/>
  Panel Status : Inactive<br/>
  Collected Data : 0<br/>
  1<br/>
  Enter Orientation :<br/>
  North<br/>
  4<br/>
  Orientation : North<br/>
  Panel Status : Inactive<br/>
  Collected Data : 0<br/>
  3<br/>
  Panels are not active!<br/>
  2<br/>
  Panels Activated<br/>
  3<br/>
  Data Collected<br/>
  4<br/>
  Orientation : North<br/>
  Panel Status : Active<br/>
  Collected Data : 10<br/>
  5<br/>
  
  End

  **Design**
  CommandSystem : Executes the user Commands.<br/>
  Rotate,SolarPanels,CollectData - Manages the Satellite Operations.<br/>
  SatelliteState - Monitors and prints the Satellite Current State.<br/>

  **Contact**
    Email : saravanakumargm00@gmail.com<br/>
    GitHub : saravanakumargm00
