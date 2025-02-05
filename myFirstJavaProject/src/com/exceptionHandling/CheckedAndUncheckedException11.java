package com.exceptionHandling;
//
//now the question is which type of exception we want to force to handle it and
// which type of exceptions we want to ignore

// class Error extends Throwable{}
// class Exception extends Throwable{}
// class InterruptedException extends Exception{}
// class RuntimeException extends Exception{}
// class NullPointerException extends RuntimeException{}


// the super class of evrything realted to exception handling is Throwable.
// there are 2 important classes that which extends Throwable
// 		1. Error		- You can Prevent Errors but you cannot handle them
//		2. Exception	- These are the things which we can handle


// In 2. Exceptions there are two types of exceptions
// 		a. Runtime and subclasses of Runtime (Unchecked exceptions)
// 		b. Not a subclass of Runtime exceptions(Checked Exceptions)

// Checked(Risky) Exception - When any method shows a checked exception, calling method should either handle it or to say i am going to "throw" it
// Unchecked exception 		- the calling method need not do anything
public class CheckedAndUncheckedException11 {

}
