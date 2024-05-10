# Assignment 9: Threading and Synchronization

## Overview

This Java program demonstrates multi-threaded synchronization using the Producer-Consumer model. It consists of three main classes: `Main`, `Caller`, and `CallMe`. The `Main` class serves as the entry point, creating instances of `Caller` objects that share a single `CallMe` object. Each `Caller` object represents a thread, simulating concurrent execution. The `Caller` class implements the `Runnable` interface to enable multi-threading. Synchronization is achieved using the `synchronized` keyword to ensure thread safety when accessing shared resources.

## Contents

- [Main.java](#mainjava)
- [Caller.java](#callerjava)
- [CallMe.java](#callmejava)

## Main.java

The `Main.java` class initializes the program by creating instances of `Caller` objects and a shared `CallMe` object. It starts the threads associated with each `Caller` object and waits for their execution to complete before exiting. Exception handling is implemented to catch any potential errors during thread execution.

### Methods

#### `main(String[] args)`
- **Description:** Entry point of the program. Creates instances of `Caller` objects with a shared `CallMe` object. Starts threads associated with each `Caller` object and waits for their completion.


## Caller.java

The `Caller.java` class represents a thread in the program. It implements the `Runnable` interface and contains a reference to the `CallMe` object it will call. The `run()` method is overridden to execute the thread's logic, which involves synchronizing on the shared `CallMe` object and invoking its `call()` method.

### Methods

#### `Caller(CallMe target, String msg)`
- **Description:** Constructor to initialize a `Caller` object with a target `CallMe` object and a message to be passed.

#### `run()`
- **Description:** Overridden method from the `Runnable` interface. Executes the thread's logic, synchronizing on the shared `CallMe` object and calling its `call()` method.


## CallMe.java

The `CallMe.java` class contains the method `call()`, which represents the functionality to be executed by multiple threads concurrently. The method is synchronized to ensure mutual exclusion, allowing only one thread to execute it at a time. Each thread calls this method with a message, and it prints the message enclosed in square brackets with a delay to simulate processing.

### Methods

#### `call(String msg)`
- **Description:** Method called by multiple threads. Prints a message enclosed in square brackets with a delay to simulate processing. Synchronized to ensure thread safety.
