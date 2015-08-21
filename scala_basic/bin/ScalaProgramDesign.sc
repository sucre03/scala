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
   (1 to 9).map("*" *_).foreach(println _)        //> *
                                                  //| **
                                                  //| ***
                                                  //| ****
                                                  //| *****
                                                  //| ******
                                                  //| *******
                                                  //| ********
                                                  //| *********
   (1 to 9).map("*" +_).foreach(println _)        //> *1
                                                  //| *2
                                                  //| *3
                                                  //| *4
                                                  //| *5
                                                  //| *6
                                                  //| *7
                                                  //| *8
                                                  //| *9
   val feeds = List("baidu.com","google.com","blogspot.com")
                                                  //> feeds  : List[String] = List(baidu.com, google.com, blogspot.com)
   feeds.head                                     //> res4: String = baidu.com
   feeds(1)                                       //> res5: String = google.com
   //在List前面加字符
   val prefxedList = "sina.com.cn"::feeds         //> prefxedList  : List[String] = List(sina.com.cn, baidu.com, google.com, blogs
                                                  //| pot.com)
   //在list前面添加List
   val totalList = feeds:::prefxedList            //> totalList  : List[String] = List(baidu.com, google.com, blogspot.com, sina.
                                                  //| com.cn, baidu.com, google.com, blogspot.com)
   //判断list中的所有字符是否都包括com
   totalList.forall(_ contains "com")             //> res6: Boolean = true
   //统计list中每个内容的长度，以逗号分割显示
   feeds.map(_.length).mkString(", ")             //> res7: String = 9, 10, 12
   //从左往右计算所有字符的累计长度，初始值为0，然后依次累加
   (0/:feeds)(_+_.length)                         //> res8: Int = 31
   //从右往左计算所有字符的累计长度，初始值为0，然后依次累加
   (feeds:\0)(_.length+_)                         //> res9: Int = 31
   ((1 to 100):\0)(_+_)                           //> res10: Int = 5050
   (0/:(1 to 100))(_+_)                           //> res11: Int = 5050
   
}