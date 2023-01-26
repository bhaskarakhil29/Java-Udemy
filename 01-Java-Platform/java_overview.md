# Java Platform Overview

1. When Java code is compiled then intermediate code gets generated known as byte code.
2. When Java code is made to run on Windows. Byte code that got generated is passed to the Windows JVM and relevant machine code gets generated which can be executed on the Windows machine.
3. In this manner, Java stays as platform independent through byte code and platform specific JVM
4. Java works as compile once, run anytime.

# Java Class and Object Overview

1. Class is nothing but a template or logical entity. Eg: Car, Country, Table
2. To run a Java class through Command Line, First we need to compile the java file. Navigate through the directory where .java file is present.
3. run this command as follows => javac [Java File Name].java
4. If compiled successfully, then [Java File Name].class file gets generated.
5. Now, run this command to execute the bytecode => java [Java File Name]. Desired output will be shown.

# JDK vs JRE vs JVM

### JVM

1. JVM stands for Java Virtual Machine. Runs Bytecode.
2. Takes bytecode as input and gives platform specific machine code instructions.

### JRE

1. JRE stands for Java Runtime Environment
2. It consists of JVM+ Libraries + Other Components.
3. If App user, then can use the App compiled files and run them to use the app.

### JDK

1. JDK stands for Java Development Kit.
2. JRE + Debuggers + Compilers
3. If App Developer, then to compile the code developed, debug the bugs etc.
