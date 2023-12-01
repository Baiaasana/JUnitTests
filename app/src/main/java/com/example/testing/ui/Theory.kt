package com.example.testing.ui

/*

JUnit: is a very popular testing library used to save that time for us
and test your code with one click and automate those test scenarios.

1. Unit Test - it tests a single unit or single component of our app e.g. function of a class, and its the fastest test in our app.
unit test should cover 70% of our app test cases - 70%

2. Integration Test - It’s testing how different components of our app work with each other
for example how the Fragment interacts with the ViewModel - 20%

3. UI Test -They are usually instrumented tests that run on a device or emulator and check through instrumentation that the app behaves correctly.
for example, check if the checkbox is checked or if recycler view has a specific item, and so on - 10%


TDD (Test Driven Development) Main principle: Write the test case before implementing the actual function. (Unit test only)

* define the function signature without implementing the function content.
* Write a test case for that function we just declared.
* Finally, we need to implement the function content to pass that test case.

Flaky tests: Those tests are sometimes successful and sometimes fail.

// structure

com
This is where our actual code (forget about it now)

com(androidTest)
This folder contains the tests that rely on Android components and that means they can run only on the android emulator in other words instrumental test

com(test)
This folder contains the tests that don’t rely on Android components they can run without an emulator in other words Unit Test

All of these folders are called  -> source sets.


 */