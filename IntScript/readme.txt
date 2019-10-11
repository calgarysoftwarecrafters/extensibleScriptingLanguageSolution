At the terminal:

Run ./gradlew (gradlew.bat on windows) this will install the gradle build system.

Run ./gradlew test this will produce test reports in the build directory.

Your mission is to get the tests to pass so that we hava a simple scripting language as described below.

An Extensible Scripting Language
We’re going to make a simple scripting language for doing calculations.  Here is a sample script:
Add 1
Add 2
Add 3
Sub 5
Would output
Answer: 1

We want to be able to hand our project off to a new developer and let them add new operations without having to edit any of the existing files.

<see spoilers.txt for hints on how to fix the tests>