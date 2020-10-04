**The Java Programming Language**<br>
The Java programming language is a high-level language that can be characterized by all of the following buzzwords:<br>

*Simple<br>
*Object oriented<br>
*Distributed<br>
*Multithreaded<br>
*Dynamic<br>
*Architecture neutral<br>
*Portable<br>
*High performance<br>
*Robust<br>
*Secure<br>
*Each of the preceding buzzwords is explained in The Java Language Environment , a white paper written by James Gosling and Henry McGilton.<br><br>

In the Java programming language, all source code is first written in plain text files ending with the .java extension. Those source files are then compiled into .class files by the javac compiler. A .class file does not contain code that is native to your processor; it instead contains bytecodes — the machine language of the Java Virtual Machine1 (Java VM). The java launcher tool then runs your application with an instance of the Java Virtual Machine.<br>

![An overview of the software development process](https://docs.oracle.com/javase/tutorial/figures/getStarted/getStarted-compiler.gif)<br><br>

Figure showing MyProgram.java, compiler, MyProgram.class, Java VM, and My Program running on a computer.<br>
An overview of the software development process.<br><br>

Because the Java VM is available on many different operating systems, the same .class files are capable of running on Microsoft Windows, the Solaris™ Operating System (Solaris OS), Linux, or Mac OS. Some virtual machines, such as the Java SE HotSpot at a Glance, perform additional steps at runtime to give your application a performance boost. This includes various tasks such as finding performance bottlenecks and recompiling (to native code) frequently used sections of code.<br>

![the Java VM](https://docs.oracle.com/javase/tutorial/figures/getStarted/helloWorld.gif)<br>

Figure showing source code, compiler, and Java VM's for Win32, Solaris OS/Linux, and Mac OS<br>
Through the Java VM, the same application is capable of running on multiple platforms.<br><br>

**The Java Platform**<br>
A platform is the hardware or software environment in which a program runs. We've already mentioned some of the most popular platforms like Microsoft Windows, Linux, Solaris OS, and Mac OS. Most platforms can be described as a combination of the operating system and underlying hardware. The Java platform differs from most other platforms in that it's a software-only platform that runs on top of other hardware-based platforms.<br>

The Java platform has two components:<br>

*The Java Virtual Machine*<br>
*The Java Application Programming Interface (API)*<br>
You've already been introduced to the Java Virtual Machine; it's the base for the Java platform and is ported onto various hardware-based platforms.<br><br>

The API is a large collection of ready-made software components that provide many useful capabilities. It is grouped into libraries of related classes and interfaces; these libraries are known as packages. The next section, What Can Java Technology Do? highlights some of the functionality provided by the API.<br>
![The API and Java Virtual Machine](https://docs.oracle.com/javase/tutorial/figures/getStarted/getStarted-jvm.gif)

Figure showing MyProgram.java, API, Java Virtual Machine, and Hardware-Based Platform<br>
The API and Java Virtual Machine insulate the program from the underlying hardware.<br><br>

As a platform-independent environment, the Java platform can be a bit slower than native code. However, advances in compiler and virtual machine technologies are bringing performance close to that of native code without threatening portability.<br>

The terms"Java Virtual Machine" and "JVM" mean a Virtual Machine for the Java platform.<br>
