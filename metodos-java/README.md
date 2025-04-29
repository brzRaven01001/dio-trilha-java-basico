# Java Client Registration System

This project is a simple console-based Java program designed to register and manage client data using object-oriented programming concepts. It is ideal for beginners who want to practice working with classes, methods, lists, input validation, and user interaction via the terminal.

## Features

- Register multiple clients with:
  - Name
  - CPF (Brazilian ID - must be 11 digits)
  - Age (must be a non-negative number)
- Input validation to prevent errors
- Menu-driven system
- List all registered clients

## Technologies

- Java 17+
- Scanner (for user input)
- ArrayList (to store multiple clients)

## How it works

1. The program displays a menu with three options:  
   - Register a new client  
   - View all registered clients  
   - Exit the program

2. When registering, the system checks if the CPF is exactly 11 digits and that the age is a valid number.

3. Clients are stored in a list and can be displayed any time through the menu.

## Example

```bash
===== Client Menu =====
1. Register client
2. View all clients
3. Exit
Choose an option:
