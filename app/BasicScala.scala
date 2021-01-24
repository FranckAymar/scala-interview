package com.particeep.test

/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
 def encodeParamsInUrl(params: Map[String, String]): String = {

    var output : String = "?"
    //For detect the last (key,value) of Map
    var i = 0;
    for ((k,v) <- params) {
      i += 1
      output +=s"${k}=${v}${if (i == params.size) "" else "&"}"

  }
    output
  }

  /**
    * Test if a String is an email
    */
 def isEmail(maybeEmail: String): Boolean = {

    //Email pattern refers to : RFC 5322
    val emailPattern: Regex = ("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"" +
      "(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-" +
      "\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2" +
      "(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-" +
      "9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\" +
      "x0b\\x0c\\x0e-\\x7f])+)\\])").r

    emailPattern.findFirstMatchIn(maybeEmail) match {
      case Some(_) => true
      case None => false
    }

  }

  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
def power(i:Int, n:Int):Int = {

    var j : Int = 1

    var result: Int = i
    while(j < n){

      result = result * i
      j = j + 1

    }

    result

  }

}
