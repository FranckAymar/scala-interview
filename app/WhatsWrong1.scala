package com.particeep.test

object WhatsWrong1 {

  trait Interface {
    val city: String
    val support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  Supporter.city //What does this print ? //Result is : Paris
  

  /*
    Result is : Ici c'est null !

    Reason : Trait Interface it's a abstract method by analogy to Abstracts class in Java. So the variable city 
             and the method support keep the initials values if they don't implement by a another class

    Fix : Override support method in Supporter Object
              
  */
  Supporter.support //What does this print and why ? How to fix it ?

}
