import scala.io.Source
object ScalaInAction {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 9                                       //> x  : Int = 9
  val n = if(x>0) 1 else -1                       //> n  : Int = 1
  var m = if(x > 0) "positive" else ()            //> m  : Any = positive
  println(n+"-"+m)                                //> 1-positive
  
  var tuple = (1,3,4,5,6)                         //> tuple  : (Int, Int, Int, Int, Int) = (1,3,4,5,6)
  
  
  /**集合操作**/
  val map =Map("red"->"红色","green"->"绿色")         //> map  : scala.collection.immutable.Map[String,String] = Map(red -> 绾㈣壊, gr
                                                  //| een -> 缁胯壊)
   val colors = List("red", "green", "blue")      //> colors  : List[String] = List(red, green, blue)
   //map函数测试 ，打印长度
   val size=colors.map( (f:String) => f.size  );  //> size  : List[Int] = List(3, 5, 4)
   val data=List(1,2,5,3);                        //> data  : List[Int] = List(1, 2, 5, 3)
   //reduce函数测试 求和
   val r=data.reduce((a:Int,b:Int)=>a+b);         //> r  : Int = 11
   println(size,"            ",r)                 //> (List(3, 5, 4),            ,11)
    //打印取值
    println(map("red"))                           //> 绾㈣壊
   //判断是否存在
   println(map.contains("white"))                 //> false
   //遍历map集合
   for(pair<-map) println(pair)                   //> (red,绾㈣壊)
                                                  //| (green,缁胯壊)
  
   //去重打印
   println(List(3,2,3,4,5).distinct)              //> List(3, 2, 4, 5)
   //fitler过滤
   println(List(3,12,33,64,15).filter(_ > 18))    //> List(33, 64)
   //扁平化处理
   println(List(List(1, 2), List(3, 4)).flatten)  //> List(1, 2, 3, 4)
   //partition 分区
   println(List(1, 2, 3, 4, 5) partition (_ < 3)) //> (List(1, 2),List(3, 4, 5))
   //反转集合
   println(List(1, 2, 3).reverse)                 //> List(3, 2, 1)
   //slice==>与java的substring类似
   println(List(2, 3, 5, 7) slice (1, 4))         //> List(3, 5, 7)
   //排序sortBy
   println(List("apple", "to","a","ab") sortBy (_.size) )
                                                  //> List(a, to, ab, apple)
   //排序原生值
   println(List("apple", "to","bag","bbc","one").sorted)
                                                  //> List(apple, bag, bbc, one, to)
   //splitAt值拆分一个list，根据下标的位置
   println(List(2, 3, 5, 7,99,45) splitAt 3)      //> (List(2, 3, 5),List(7, 99, 45))
   //提取第n个元素之前数据作为一个新的集合
   println(List(2, 3, 5, 7, 11, 13) take 2)       //> List(2, 3)
   //合并两个集合，进入一个大的集合
   println(List(1, 2) zip List("a", "b") )        //> List((1,a), (2,b))
   //删除前n个元素后，新生成一个集合
   println(List('a', 'b', 'c', 'd') drop 1)       //> List(b, c, d)
   //判断两个集合是否相等
   println(List(1, 2) == List(1, 2))              //> true
   //合并两个集合 ++
   println(List(1, 2) ++ Set(3, 4, 3) )           //> List(1, 2, 3, 4)
   //合并两个集合
   println(List(1, 2) ::: List(2, 3))             //> List(1, 2, 2, 3)
   //添加一个元素
   println(1 :: 2 :: Nil)                         //> List(1, 2)
   //添加一个元素
   println(List(1,6).:+(5))                       //> List(1, 6, 5)
   //遍历每一个元素，收集case匹配上的元素值，返回一个新的集合
   println(List(0, 1, 0) collect {case 1 => "ok"})//> List(ok)
   //将一个元素，根据特定符号，拆分成单个元素组成的集合
   println(List("milk,tea") flatMap (_.split(',')))
                                                  //> List(milk, tea)
   //最大值
   println(List(41, 59, 26).max)                  //> 59
   //最小值
   println(List(10.9, 32.5, 4.23, 5.67).min)      //> 4.23
   //连乘
   println(List(5, 6, 10).product)                //> 300
   //求和
   println(List(11.3, 23.5, 7.2).sum )            //> 42.0
   //是否存在
   println(List(34, 29, 18) contains 29 )         //> true
   //是否以xxx结束
   println(List(0, 4, 3) endsWith List(4, 3))     //> true
   //是否以xxx开始
   println(List(0, 4, 3) startsWith List(0) )     //> true
   //最少有一个值小于18即为true
   println(List(24, 17, 32) exists (_ < 18))      //> true
   println("=======================================")
                                                  //> =======================================
   //必须得所有值小于18才返回true
   println(List(5, 17, 2) forall (_ < 18) )       //> true
   //求和
   println(List(4, 5, 6).fold(8)(_ + _))          //> 23
   //求和
   println(List(4, 5, 6).foldLeft(10)(_ + _))     //> 25
   //求和
   println(List(4, 5, 6).foldRight(0)(_ + _) )    //> 15
   //求和
   println(List(4, 5, 6).reduce(_ + _) )          //> 15
   //求和
   println(List(4, 5, 6).reduceLeft(_ + _) )      //> 15
   //求和
   println(List(4, 5, 6).reduceRight(_ + _) )     //> 15
   //阶段求和
   println(List(4, 5, 6).scan(0)(_ + _))          //> List(0, 4, 9, 15)
   //阶段求和
   println(List(4, 5, 6).scanLeft(0)(_ + _))      //> List(0, 4, 9, 15)
   //阶段求和
   println(List(4, 5, 6).scanRight(0)(_ + _))     //> List(15, 11, 6, 0)
   //集合转换字符串
   println(List(24, 99, 104).mkString(", "))      //> 24, 99, 104
   //转成ArrayBuffer
   println(List('f', 't').toBuffer)               //> ArrayBuffer(f, t)
   //转Map to List
   println(Map("a" -> 1, "b" -> 2).toList )       //> List((a,1), (b,2))
   //转Set to Map
   println(Set(1 -> true, 3 -> true).toMap)       //> Map(1 -> true, 3 -> true)
   //转List to Set
   println(List(2, 5, 5, 3, 2).toSet)             //> Set(2, 5, 3)
   //转List to String
   println(List(2, 5, 5, 3, 2).toString)          //> List(2, 5, 5, 3, 2)
  
   //Java 与 Scala 集合互转
   //导入包
   import  collection.JavaConverters._
   import  collection.JavaConversions._
   import java.util.ArrayList;
   // scala 转 java
   val ja  =List(1,5,3).asJava                    //> ja  : java.util.List[Int] = [1, 5, 3]
   println(List(1,5,3))                           //> List(1, 5, 3)
   println(ja)                                    //> [1, 5, 3]
  // java 转 scala
   val s =new java.util.ArrayList(3).asScala;     //> s  : scala.collection.mutable.Buffer[Nothing] = Buffer()
  
   //集合的模式匹配
  
   val statuses = List(500, 404)                  //> statuses  : List[Int] = List(500, 404)
  
   val msg = statuses.head match {
    case x if x < 500 => "okay"
        case _ => "whoah, an error"
        }                                         //> msg  : String = whoah, an error
  
   println("信息：",msg)                             //> (淇℃伅锛�,whoah, an error)
   val msg2 = statuses match {
    case x if x contains(500) => "has error"
       case _ => "okay"
        }                                         //> msg2  : String = has error
   println("信息：",msg2)                            //> (淇℃伅锛�,has error)
  
   val msg3 = statuses match {
   case List(404, 500) => "not found & error"
        case List(500, 404) => "error & not found"
        case List(200, 200) => "okay"
        case _ => "not sure what happened"
        }                                         //> msg3  : String = error & not found
  
   println("信息：",msg3)                            //> (淇℃伅锛�,error & not found)
   val msg4 = statuses match {
    case List(500, x) => s"Error followed by $x"
        case List(e, x) => s"$e was followed by $x"
        }                                         //> msg4  : String = Error followed by 404
  
   println("信息：",msg4)                            //> (淇℃伅锛�,Error followed by 404)
  
   val head = List('r','g','b') match {
    case x :: xs => x
        case Nil => ' '
       }                                          //> head  : Char = r
  
   println(head)                                  //> r
  
  
   val code = ('h', 204, true) match {
    case (_, _, false) => 501
        case ('c', _, true) => 302
        case ('h', x, true) => x
        case (c, x, true) => {
        println(s"Did not expect code $c")
        x
          }
        }                                         //> code  : Int = 204
  
     println(code)                                //> 204
     
  var source = Source.fromFile("c://a1.txt","UTF-8")
                                                  //> source  : scala.io.BufferedSource = non-empty iterator
  val res =  source.getLines.foreach(println)     //> 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.
                                                  //| UserApi.findUserByIdentify|#|{"userIdentify":"13693600831"}&1cadcd4d-5c85-4
                                                  //| c0b-9ac5-36c2743f2ddc|#|{"exists":"0","result":true}|#|1|#|3>
                                                  //| 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.
                                                  //| UserApi.findUserByIdentify|#|{"userIdentify":"13053952555"}&1cadcd4d-5c85-4
                                                  //| c0b-9ac5-36c2743f2ddc|#|{"exists":"0","result":true}|#|1|#|2>
                                                  //| 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.
                                                  //| UserApi.findUserByIdentify|#|{"userIdentify":"15833706272"}&1cadcd4d-5c85-4
                                                  //| c0b-9ac5-36c2743f2ddc|#|{"exists":"0","result":true}|#|1|#|3>
                                                  //| 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.
                                                  //| UserApi.findUserByIdentify|#|{"userIdentify":"13836800421"}&1cadcd4d-5c85-4
                                                  //| c0b-9ac5-36c2743f2ddc|#|{"exists":"0","result":true}|#|1|#|2>
                                                  //| 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.
                                                  //| Output exceeds cutoff limit.
  res
  
  val numbers = "2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.UserApi.findUserByIdentify|#|1cadcd4d-5c85-4c0b-9ac5-36c2743f2ddc|#|0|#|1|#|3>"
                                                  //> numbers  : String = 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanj
                                                  //| et.csp.boss.cia.api.UserApi.findUserByIdentify|#|1cadcd4d-5c85-4c0b-9ac5-36
                                                  //| c2743f2ddc|#|0|#|1|#|3>
  numbers.split("#")                              //> res0: Array[String] = Array(2014-12-01 00:00:00 INFO [apiAccessLog] - <|, |
                                                  //| com.chanjet.csp.boss.cia.api.UserApi.findUserByIdentify|, |1cadcd4d-5c85-4c
                                                  //| 0b-9ac5-36c2743f2ddc|, |0|, |1|, |3>)
  numbers                                         //> res1: String = 2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.cs
                                                  //| p.boss.cia.api.UserApi.findUserByIdentify|#|1cadcd4d-5c85-4c0b-9ac5-36c2743
                                                  //| f2ddc|#|0|#|1|#|3>
  source.close
  
  for(i<-1 to 10 if i%2==0) println(i)            //> 2
                                                  //| 4
                                                  //| 6
                                                  //| 8
                                                  //| 10
  def max(x:Int,y:Int){
  	println(x-y)
  }                                               //> max: (x: Int, y: Int)Unit
  max(y=3,x=2)                                    //> -1
}