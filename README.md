# CSC6301 – Project 05  
## Flexible Notification System – Maintenance Enhancement

### Project Overview
This project extends the existing Flexible Notification System by adding WhatsApp support.

 Constraint: The core `AlertSystem` class and the `NotificationMedium` interface were NOT modified.  
The system was extended using composition in accordance with the Open-Closed Principle.

This demonstrates proper maintenance-based enhancement without altering existing core logic.

---

## 🏗 Design Approach

The system uses:

- Composition
- Interface-based design
- Open-Closed Principle
- Polymorphism

A new class `WhatsAppService` was created that implements the existing `NotificationMedium` interface.

---

## Features

- Email notifications
- SMS notifications
- WhatsApp notifications (NEW)
- Message logging using ArrayList (inherited behavior)
- Maintainable, extendable architecture

---

## 🛠 Requirements

- Java JDK 8 or higher
- IDE or command line

---

## ▶ How to Compile and Run

### Using Command Line:

1. Navigate to project root directory
2. Compile all files:
