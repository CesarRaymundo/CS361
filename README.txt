# Project 1: DFA Machine

* Author(s): Cesar Raymundo(Section 003) & Andrew Gerber(Section 001)
* Class: CS361 
* Semester: Spring 2021

## Overview

This program will take a given input file that contains information related to a regular DFA. Inforamtion 
included are the states, transitions, and alpahbet. Once the file is passed, it will then use the input
strings to determine if the strings are valid or not.

## Compiling and Using

To compile this program, from the top most directory type:
	javac fa/dfa/DFADriver.java

To run this program, type one of the following:
	java fa.dfa.DFADriver ./tests/p1tc1.txt
	java fa.dfa.DFADriver ./tests/p1tc2.txt
	java fa.dfa.DFADriver ./tests/p1tc2.txt

## Discussion

Overall, we did not struggle much with this project. The project was pretty straightforward with its code but an area where we did struggle was implementing three methods: accepts, addTransition and toString. For all three is issues stemmed from the same problem, that we needed a way to access the DFAStates in the linkedhashset, we used an iterator with hasNext/Next and casting from a generic Object array to get around these issues. The other problem we had was that in the toString it would always print the "state" name which was null rather than the DFAState name which is what we needed i.e abc.

## Testing

The way we tested this program was by using the provided test files to make sure that were getting 
the expected output. We probably could've made our own test for certain methods but found the test 
files to be suffcient to find bugs within our code.

## Extra Credit

No extra credit in this project.

## Sources used

No sources used outside of class material.
