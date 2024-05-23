package com.drzinks

import scala.language.postfixOps

def variabalesExample(): Unit = {
  var someInt1 = 1
  var someint2: Int = 2
  println(someInt1 + someint2)
  println(max(someInt1,someint2))
}

def max(x: Int, y: Int): Int =
  if x > y then
    x
  else
    y

def max2(x: Int, y: Int) = if x>y then x else y

//Unit type indicates the functon returns no interesting
//value. Methods with result type of Unit, therefore, are
//only executed for their side effects
def greet(): Unit = println("awruk!")
//String* means the parameter will have type Seq[String]
//which is 0 based
def greet2(args: String*): Unit = //scala 3 recommends 2 spaces indentation over curly brace style
  //for larger indented regions one can use 'end' markers
  var i = 0;
  while i < args.length do
    println(args(i))
    i += 1
  end while

@main
def main(): Unit = {
  variabalesExample()
  println(max2(3,4))
  greet()
  greet2("bobr", "kurwa", "ja pierdole", "jakie bydle")
}