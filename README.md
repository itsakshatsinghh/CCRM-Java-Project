# Campus Course & Records Manager (CCRM)

## Introduction

The Campus Course & Records Manager (CCRM) is a comprehensive, console-based Java application designed to manage student and course records for an educational institution. It provides administrators with a simple and efficient way to handle student enrollments, track academic progress, manage course offerings, and generate essential reports. The application is built with a focus on clean architecture, separating data, business logic, and user interface concerns.

---

## Key Features

* **Student Management**: Add, list, update, and deactivate student records. Student data is identified by a unique registration number.
* **Course Management**: Add and list courses, including details like course code, title, credits, and department.
* **Enrollment System**: Enroll students in available courses and unenroll them. The system validates against duplicate enrollments and semester credit limits.
* **Grading System**: Record and update grades for students in the courses they are enrolled in.
* **Transcript Generation**: Automatically calculate a student's GPA and generate a formatted academic transcript.
* **Data Persistence**: Student, course, and enrollment data is loaded from and saved to `.csv` files, ensuring data persists between sessions.
* **Reporting**: Generate useful administrative reports, such as listing all courses in a specific department or finding all students enrolled in a particular course. A unique report is also available to find courses with no student enrollments.
* **Data Backup**: Create timestamped backups of all `.csv` data files to prevent data loss.

---

## Project Structure

The project is organized into a standard Java package structure to ensure maintainability and separation of concerns.

CCRM3.0/
|
├── data/             # Contains all CSV data files (students, courses, etc.)
|
├── src/              # Contains all Java source code (.java files)
|   └── edu/ccrm/
|       ├── cli/      # Handles the command-line user interface
|       ├── domain/   # Core data models (Student, Course, etc.)
|       ├── service/  # Contains the application's business logic
|       ├── io/       # Manages file input/output (CSV handling, backups)
|       └── ...       # Other utility and exception packages
|
├── bin/              # Stores the compiled Java bytecode (.class files)
|
└── backup/           # Stores timestamped backups of the data directory


---

## How to Compile and Run

To compile and run the application, you will need a Java Development Kit (JDK) installed and configured on your system.

1.  **Navigate to the Source Directory**:
    Open a terminal or command prompt and navigate into the `src` directory of the project.
    ```sh
    cd path/to/your/project/CCRM3.0/src/
    ```

2.  **Compile the Project**:
    Use the `javac` command to compile the main application file. The compiler will automatically find and compile all other required `.java` files.
    ```sh
    javac App.java
    ```
    This command will place all the compiled `.class` files into the `../bin` directory.

3.  **Run the Application**:
    From the `src` directory, use the `java` command to run the compiled `App` class. Make sure to specify the classpath (`-cp`) to point to the `bin` directory where the compiled files are located.
    ```sh
    java -cp ../bin App
    ```

The application will now start, load the data from the `data` directory, and display the main menu.
