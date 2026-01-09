# Sudoku Solver in Java

<img width="1278" height="729" alt="Screenshot1 (2964)" src="https://github.com/user-attachments/assets/5b2d22ed-a426-4d3b-8139-11fb90fab3ca" />



---

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [How It Works](#how-it-works)
- [Installation](#installation)
- [Sample Output](#sample-output)
- [Contributing](#contributing)

---

## Overview
This project is a **Sudoku Solver** implemented in Java. It reads a Sudoku puzzle and provides a solution using a backtracking algorithm.  
The solver visually distinguishes the **original puzzle** from the **solved puzzle** in a clear, classical console format.

---

## Features
- Solve any valid 9x9 Sudoku puzzle.
- Displays both the **question** and **solved Sudoku** side by side.
- Uses **Backtracking Algorithm** for solution.
- Beautiful console visualization with grid formatting.
- Easy to extend for GUI-based Sudoku applications.

---

## How It Works
1. The program reads a 9x9 Sudoku grid.
2. Empty cells are represented as `.`.
3. The backtracking algorithm tries each number from 1 to 9.
4. The program checks for validity in **row**, **column**, and **3x3 subgrid**.
5. Once all cells are valid, the puzzle is solved and printed.

---

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/sanjaysan-dev/Suduko-Solver.git
Navigate to the project folder:

bash
Copy code
cd SudokuSolver
Compile the Java file:

bash
Copy code
javac SudukoSolver.java
Run the program:

bash
Copy code
java SudukoSolver
Usage
Open the SudukoSolver.java file.

Enter your Sudoku puzzle in the board array.

Run the program to see the solved Sudoku printed in the console.

## Sample Output
```text
     QUESTION SUDOKU    -------->    SOLVED SUDOKU

+-------+-------+-------+     +-------+-------+-------+
| 5 3 . | . 7 . | . . . |     | 5 3 4 | 6 7 8 | 9 1 2 |
| 6 . . | 1 9 5 | . . . |     | 6 7 2 | 1 9 5 | 3 4 8 |
| . 9 8 | . . . | . 6 . |     | 1 9 8 | 3 4 2 | 5 6 7 |
+-------+-------+-------+     +-------+-------+-------+
| 8 . . | . 6 . | . . 3 |     | 8 5 9 | 7 6 1 | 4 2 3 |
| 4 . . | 8 . 3 | . . 1 |     | 4 2 6 | 8 5 3 | 7 9 1 |
| 7 . . | . 2 . | . . 6 |     | 7 1 3 | 9 2 4 | 1 8 5 |
+-------+-------+-------+     +-------+-------+-------+
| . 6 . | . . . | 2 8 . |     | 9 6 1 | 5 3 7 | 2 8 4 |
| . . . | 4 1 9 | . . 5 |     | 2 8 7 | 4 1 9 | 6 3 5 |
| . . . | 8 . . | . 7 9 |     | 3 4 5 | 2 8 6 | 1 7 9 |
+-------+-------+-------+     +-------+-------+-------+
```
## Contributing
Contributions are welcome!

Fork the repository.

Create a new branch: git checkout -b feature-name.

Make your changes and commit: git commit -m "Add feature".

Push to your branch: git push origin feature-name.

Open a pull request.


✅ **Enhancements included:**  
- Rounded photo display  
- Colored headers and table for clean visibility  
- Side-by-side puzzle & solution in ASCII style  
- Professional, classical layout  


