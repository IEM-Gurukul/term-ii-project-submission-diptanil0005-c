[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Library Book Management System

---

## Problem Statement (max 150 words)
The Library Book Management System is designed to help manage books and members efficiently in a library. The system allows librarians to add new books, issue books to members, return books, and search for books using their ID. It also keeps track of which books are issued and which are available. The main goal is to reduce manual work and improve accuracy in managing library records. The system handles errors such as issuing unavailable books or invalid inputs. This project demonstrates the use of Object-Oriented Programming concepts in Java to create a modular and maintainable system.
---

## Target User
-Library staff in schools, colleges, or public libraries  
- Librarians managing book records and member activities
---

## Core Features
- Add new books to the library  
- Issue books to members  
- Return issued books  
- Search books by ID  
- Display all books with their status (issued/available)  

---

## OOP Concepts Used

- Abstraction: Abstract class Member defines common properties of users.

- Inheritance: StudentMember and FacultyMember extend the base Member class.
- Polymorphism: Method getMaxBooks() behaves differently for students and faculty.
- Exception Handling: Custom exception BookNotAvailableException handles errors like unavailable books.
 - Collections / Threads: ArrayList and HashMap are used to store books and issued records.


---

## Proposed Architecture Description
The system is designed using an object-oriented approach with multiple classes. The `Book` class stores details like book ID, title, and issue status. The abstract `Member` class represents users, which is extended by `StudentMember` and `FacultyMember`. The `Library` class manages all operations such as adding books, issuing, returning, and searching. A custom exception class handles error cases. The `Main` class provides a menu-driven interface for user interaction.

---

## How to Run
1. Compile all Java files.
2. Run the program.
3. Use the menu to perform operations like adding, issuing, and returning books.

---

## Git Discipline Notes
Minimum 10 meaningful commits required.
