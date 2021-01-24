package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

val namesInDepartments: Map[String, List[String]] = {

    var listValueMap: ListBuffer[String] = ListBuffer[String]()
    var listOfJob: Set[String] = Set()
    var result: Map[String, List[String]] = Map[String, List[String]]()


    /*
        Build a Set value of department
     */
    for ((k, v) <- devDepartments) {

      listOfJob += v

    }

    for (job <- listOfJob) {

      for ((k, v) <- devDepartments) {

        if (v == job) {
          listValueMap += devNames(k)
        }

      }

      result += (job -> listValueMap.toList)
      listValueMap = ListBuffer()
    }

    result

  }
  }
