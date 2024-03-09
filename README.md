# Assignment 6: Duck Simulator

## Overview

This Duck Simulator program demonstrates the use of the strategy pattern in Java to model different behaviors of ducks. The program includes a hierarchy of duck classes, each representing a specific type of duck, and separate interfaces for behaviors like flying, quacking, and swimming. The strategy pattern allows these behaviors to be dynamically set at runtime, providing flexibility in behavior composition.

## Contents

- [Main.java](#mainjava)
- [Duck.java](#duckjava)
    - [MallardDuck.java](#mallardduckjava)
    - [RedHeadDuck.java](#redheadduckjava)
    - [RubberDuck.java](#rubberduckjava)
    - [DecoyDuck.java](#decoyduckjava)
- [FlyBehaviour.java](#flybehaviourjava)
    - [FlyWithWings.java](#flywithwingsjava)
    - [FlyNoWay.java](#flynowayjava)
- [QuackBehaviour.java](#quackbehaviourjava)
    - [Quack.java](#quackjava)
    - [MuteQuack.java](#mutequackjava)
    - [Squeak.java](#squeakjava)
- [SwimBehaviour.java](#swimbehaviourjava)
    - [Swim.java](#swimjava)
    - [Drown.java](#drownjava)
    - [Float.java](#floatjava)

## Main.java

The `Main.java` class serves as the entry point for the Duck Simulator. It creates instances of various duck types, such as Mallard Duck, RedHead Duck, Rubber Duck, and Decoy Duck. It then tests and displays the behavior of each duck.

### Methods

#### `main(String[] args)`
- **Description:** Initiates the program execution by creating and testing instances of different duck types.


## Duck.java

The `Duck.java` class is an abstract class representing a generic duck. It includes composition for fly, quack, and swim behaviors through interfaces. Subclasses implement the `display` method for specific details.

### Methods

#### `setFlyBehaviour(FlyBehaviour fb)`
- **Description:** Setter method for dynamically setting the fly behavior.
- **Parameters:**
  - `fb`: The fly behavior to set.

#### `setQuackBehaviour(QuackBehaviour qb)`
- **Description:** Setter method for dynamically setting the quack behavior.
- **Parameters:**
  - `qb`: The quack behavior to set.

#### `setSwimBehaviour(SwimBehaviour sb)`
- **Description:** Setter method for dynamically setting the swim behavior.
- **Parameters:**
  - `sb`: The swim behavior to set.

#### `performFly()`
- **Description:** Invokes the duck's fly behavior.

#### `performQuack()`
- **Description:** Invokes the duck's quack behavior.

#### `performSwim()`
- **Description:** Invokes the duck's swim behavior.

#### `abstract void display()`
- **Description:** Abstract method for displaying specific details of a duck.


## MallardDuck.java

The `MallardDuck.java` class is a concrete class representing a Mallard Duck. It sets specific behaviors for a Mallard Duck.

### Methods

#### `MallardDuck()`
- **Description:** Constructor for initializing Mallard Duck with specific behaviors.

#### `void display()`
- **Description:** Implementation of the abstract display method.


## RedHeadDuck.java

The `RedHeadDuck.java` class is a concrete class representing a RedHead Duck. It sets specific behaviors for a RedHead Duck.

### Methods

#### `RedHeadDuck()`
- **Description:** Constructor for initializing RedHead Duck with specific behaviors.

#### `void display()`
- **Description:** Implementation of the abstract display method.


## RubberDuck.java

The `RubberDuck.java` class is a concrete class representing a Rubber Duck. It sets specific behaviors for a Rubber Duck.

### Methods

#### `RubberDuck()`
- **Description:** Constructor for initializing Rubber Duck with specific behaviors.

#### `void display()`
- **Description:** Implementation of the abstract display method.


## DecoyDuck.java

The `DecoyDuck.java` class is a concrete class representing a Decoy Duck. It sets specific behaviors for a Decoy Duck.

### Methods

#### `DecoyDuck()`
- **Description:** Constructor for initializing Decoy Duck with specific behaviors.

#### `void display()`
- **Description:** Implementation of the abstract display method.


## FlyBehaviour.java

The `FlyBehaviour.java` interface defines the contract for fly behavior.

### Methods

#### `void fly()`
- **Description:** Method signature for flying.


## FlyWithWings.java

The `FlyWithWings.java` class is an implementation of `FlyBehaviour` for ducks that can fly with wings.

### Methods

#### `void fly()`
- **Description:** Implementation of flying with wings.


## FlyNoWay.java

The `FlyNoWay.java` class is an implementation of `FlyBehaviour` for ducks that can't fly.

### Methods

#### `void fly()`
- **Description:** Implementation of inability to fly.


## QuackBehaviour.java

The `QuackBehaviour.java` interface defines the contract for quack behavior.

### Methods

#### `void quack()`
- **Description:** Method signature for quacking.


## Quack.java

The `Quack.java` class is an implementation of `QuackBehaviour` for ducks that quack.

### Methods

#### `void quack()`
- **Description:** Implementation of quacking.


## MuteQuack.java

The `MuteQuack.java` class is an implementation of `QuackBehaviour` for ducks that can't quack.

### Methods

#### `void quack()`
- **Description:** Implementation of inability to quack.


## Squeak.java

The `Squeak.java` class is an implementation of `QuackBehaviour` for ducks that squeak.

### Methods

#### `void quack()`
- **Description:** Implementation of squeaking.


## SwimBehaviour.java

The `SwimBehaviour.java` interface defines the contract for swim behavior.

### Methods

#### `void swim()`
- **Description:** Method signature for swimming.


## Swim.java

The `Swim.java` class is an implementation of `SwimBehaviour` for ducks that can swim.

### Methods

#### `void swim()`
- **Description:** Implementation of swimming.


## Drown.java

The `Drown.java` class is an implementation of `SwimBehaviour` for ducks that can't swim.

### Methods

#### `void swim()`
- **Description:** Implementation of inability to swim.


## Float.java

The `Float.java` class is an implementation of `SwimBehaviour` for ducks that float.

### Methods

#### `void swim()`
- **Description:** Implementation of floating.
