object ScalaProgramDesign {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  (1 to 3).foreach(i => print(i+""))              //> 123
  println("dfdf")                                 //> dfdf
  def getPersonInfo(primaryKey:Int)={
  	("sucre","scala","www.chanjet.com")
  }                                               //> getPersonInfo: (primaryKey: Int)(String, String, String)
  val (name,tecnolige,url) = getPersonInfo(1)     //> name  : String = sucre
                                                  //| tecnolige  : String = scala
                                                  //| url  : String = www.chanjet.com
  val content = """Have the best of both worlds.
  Construct elegant class hierarchies for maximum
  code reuse and extensibility, implement their behavior using
  higher-order functions. Or anything in-between."""
                                                  //> content  : String = Have the best of both worlds.
                                                  //|   Construct elegant class hierarchies for maximum
                                                  //|   code reuse and extensibility, implement their behavior using
                                                  //|   higher-order functions. Or anything in-between.
  val a,b,c =1                                    //> a  : Int = 1
                                                  //| b  : Int = 1
                                                  //| c  : Int = 1
 //在scala中==就代表值 的比较
  val str1 = "hello"                              //> str1  : String = hello
  val str2 = "hello"                              //> str2  : String = hello
  val str3 =new String("hello")                   //> str3  : String = hello
  str1==str2                                      //> res0: Boolean = true
  str1 eq str2                                    //> res1: Boolean = true
  str1 == str3                                    //> res2: Boolean = true
  str1 eq str3                                    //> res3: Boolean = false
  def check1()=true                               //> check1: ()Boolean
  def check2():Boolean=return true                //> check2: ()Boolean
  //var testType:Int=_
}