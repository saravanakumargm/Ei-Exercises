# Food Order Console Application

## Overview

This is a console-based food order application developed using the Strategy design pattern. The application allows users to select a food combo and choose a payment method to complete their order. The Strategy pattern is used to dynamically select the appropriate food combo and payment method at runtime.

## Features

- **Select Food Combo:** Choose from various predefined food combos.
- **Select Payment Method:** Choose from different payment methods to pay for the selected food combo.

## Design

### Strategy Design Pattern

- **Food Combo Strategies:** Different classes representing various food combos (e.g., ComboOne, ComboTwo, ComboThree).
- **Payment Method Strategies:** Different classes representing various payment methods (e.g., UPIMethod, CardMethod).
- **Context:** The `Food` class acts as the context that utilizes the strategies for food combo price.

## Installation

1. **Clone the Repository**

   git clone https://github.com/yourusername/food-order-console-app.git
