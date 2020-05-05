# java-basics-hw03

This is a homework for the Java OOP Part I

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/java-basics-hw03.git``` 
2. Import in IntelliJ IDEA using `File -> New -> Project from Existing Sources...`.
3. Select the directory that you cloned to.
4. Go through the `Import Project` wizard by clicking `Next`.
5. On `Please select project SDK` point it to your Java 1.8 JDK.
6. Press `Ctrl+Alt+Shift+S` and check that in your `Project Structure`.
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`.
7. Open `StudentTest` class, put your cursor on `@Test` annotation, press `Alt+Enter` 
    and choose `Add 'testng' to classpath`.  
8. Set the value to `org.testng:testng:6.14.3` and mark checkbox `Download to`.
9. Compilation should be without any errors (`Ctrl+F9`). 


## Student App

Create Console Application project in Java. Add class Student to the project.
Class should consists of
- two private fields: name and rating; 
- methods for access to these fields
- default constructor and constructor with parameters 
- methods:
    - betterStudent - to definite the better student (between two, return true or false)
    - toString - to output information about student
    - changeRating –to consistently change the rating of student

In the method main() create 3 objects of Student type and input information about them.
Display the average rating of all students.
Change the rating of any student.
Display the new average rating.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In `StudentTest` class put your cursor on its definition, right click and choose `Run 'StudentTest'`
* Right click on a little green triangle near the class definition and choose `Run 'StudentTest'`
* In `StudentTest` class put your cursor on its definition and press `Ctrl+Shift+F10`
* Once you executed your test you could re-run it again by pressing `Shift+F10`
