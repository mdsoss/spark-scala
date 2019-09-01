package com.hadoop

object Demo2 {

    def main(args: Array[String]): Unit = {
      val name = "Jack"
      val age = 18
      println(s" my name is $name , i'm $age old!")
      sayHello("fyg",26)
    }

  def sayHello(name:String,age:Int)={
    System.err.println(" my name is "+name+" , and i'm  "+age+" years old!")
  }
}
