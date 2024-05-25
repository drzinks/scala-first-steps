package com.drzinks

import scala.language.postfixOps

def variabalesExample(): Unit = {
  var someInt1 = 1
  var someint2: Int = 2
  println(someInt1 + someint2)
  println(max(someInt1, someint2))
}

def max(x: Int, y: Int): Int =
  if x > y then
    x
  else
    y

def max2(x: Int, y: Int) = if x > y then x else y

//Unit type indicates the functon returns no interesting
//value. Methods with result type of Unit, therefore, are
//only executed for their side effects
def greet(): Unit = println("awruk!")
//String* means the parameter will have type Seq[String]
//which is 0 based
def greet2(args: String*): Unit = //scala 3 recommends 2 spaces indentation over curly brace style
  //for larger indented regions one can use 'end' markers
  var i = 0;
  while i < args.length do //loops are imperative style, in scala better is functional style
    println(args(i))
    i += 1
  end while

def greet3FunctionalStyle(args: String*): Unit = {
  args.foreach(arg => println(arg))
}

//if function literal consists of one statement that takes a single arg
//then no need to name and specify argument
def greet4FunctionMoreConciseness(words: String*): Unit = words.foreach(println)

def forLoopExample(words: String*): Unit = {
  for word <- words do
    println(word)
}


@main
def main(): Unit = {
  //  variabalesExample()
  //  println(max2(3,4))
  //  greet()
  //  greet2("bobr", "kurwa", "ja pierdole", "jakie bydle")
  //  greet3FunctionalStyle("bobr", "kurwa", "ja pierdole", "jakie bydle")
//  greet4FunctionMoreConciseness("bobr", "kurwa", "ja pierdole", "jakie bydle")
//  forLoopExample("bobr", "kurwa", "ja pierdole", "jakie bydle")

  //Arrays are mutable, you cannot change lengh but the elements
  val names = Array("Michal","Jarek","Maciek","Janek","Weronika")
  val names2 = Array.apply("Michal","Jarek","Maciek","Janek","Weronika") //if you do on object (), you automatically invoke apply method
  //on array companion object
  val names3 = new Array[String](5)
  names3(0) = "Michal"
  names3.update(1,"Jarek")

  names3.foreach(println)

  //Lists, scala lists are always immutable
  val names4List = List("Michal","Jarek")
  val names5List = List("Weronika","Klaudia")
  val namesConcatenated = names4List:::names5List //::: is List method for concatenation

  val moreNames = "Arek"::namesConcatenated //:: adds new element to the list at the beggining and returns new list
  val evenMoreNames = moreNames.::("Justyna")
  val numbers = 1::2::3::Nil
  numbers.foreach(println)
}

