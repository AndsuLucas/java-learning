# Java notes. "Java: A Beginner's Guide, Ninth Edition, 9th Edition".


## Some interesting/important facts

- "Java innovated a new type of networked program called _applet_ thant changed the way the way the online world thought about content";
  - **Java Applets:** Run Java programs in compatible web browsers. Download and run applet based on actions of users. Delivered by the server, the applet programs are "dynamic" self-executed programs;
- The output of Java compiler iis bytecode not an executable. Bytecode is executed by **JVM** (Java Virtual Machine), which is part of the **JRE** (Java Runtime Environment);
- **HotSpot JVM:** Includes **just-int-time (JIT) complier**. Compiles code during executiion.

## Commands and tips
- **javac <file>** build a class Name.class;
- **java <Name>** run an builded file;
- Its a good practice name file with same class name for a good organization.

## Variables
- All variables must be declared before use:
- **Syntax:**

```java
// type name = value;
int total = 2 + 2;
```

- If a variable is declared without value, you need to **initialize** it first: 

```java
double myDouble;
System.out.prinln(myDouble); // does not work.
double = 3.13; // initialization.
```

