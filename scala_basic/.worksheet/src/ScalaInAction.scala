import scala.io.Source
object ScalaInAction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 9;System.out.println("""x  : Int = """ + $show(x ));$skip(28); 
  val n = if(x>0) 1 else -1;System.out.println("""n  : Int = """ + $show(n ));$skip(39); 
  var m = if(x > 0) "positive" else ();System.out.println("""m  : Any = """ + $show(m ));$skip(19); 
  println(n+"-"+m);$skip(29); 
  
  var tuple = (1,3,4,5,6);System.out.println("""tuple  : (Int, Int, Int, Int, Int) = """ + $show(tuple ));$skip(61); 
  
  
  /**集合操作**/
  val map =Map("red"->"红色","green"->"绿色");System.out.println("""map  : scala.collection.immutable.Map[String,String] = """ + $show(map ));$skip(45); 
   val colors = List("red", "green", "blue");System.out.println("""colors  : List[String] = """ + $show(colors ));$skip(68); 
   //map函数测试 ，打印长度
   val size=colors.map( (f:String) => f.size  );System.out.println("""size  : List[Int] = """ + $show(size ));$skip(27); ;
   val data=List(1,2,5,3);System.out.println("""data  : List[Int] = """ + $show(data ));$skip(61); ;
   //reduce函数测试 求和
   val r=data.reduce((a:Int,b:Int)=>a+b);System.out.println("""r  : Int = """ + $show(r ));$skip(34); ;
   println(size,"            ",r);$skip(35); 
    //打印取值
    println(map("red"));$skip(46); 
   //判断是否存在
   println(map.contains("white"));$skip(45); 
   //遍历map集合
   for(pair<-map) println(pair);$skip(50); 
  
   //去重打印
   println(List(3,2,3,4,5).distinct);$skip(61); 
   //fitler过滤
   println(List(3,12,33,64,15).filter(_ > 18));$skip(60); 
   //扁平化处理
   println(List(List(1, 2), List(3, 4)).flatten);$skip(68); 
   //partition 分区
   println(List(1, 2, 3, 4, 5) partition (_ < 3));$skip(44); 
   //反转集合
   println(List(1, 2, 3).reverse);$skip(73); 
   //slice==>与java的substring类似
   println(List(2, 3, 5, 7) slice (1, 4));$skip(72); 
   //排序sortBy
   println(List("apple", "to","a","ab") sortBy (_.size) );$skip(68); 
   //排序原生值
   println(List("apple", "to","bag","bbc","one").sorted);$skip(75); 
   //splitAt值拆分一个list，根据下标的位置
   println(List(2, 3, 5, 7,99,45) splitAt 3);$skip(69); 
   //提取第n个元素之前数据作为一个新的集合
   println(List(2, 3, 5, 7, 11, 13) take 2);$skip(64); 
   //合并两个集合，进入一个大的集合
   println(List(1, 2) zip List("a", "b") );$skip(66); 
   //删除前n个元素后，新生成一个集合
   println(List('a', 'b', 'c', 'd') drop 1);$skip(53); 
   //判断两个集合是否相等
   println(List(1, 2) == List(1, 2));$skip(55); 
   //合并两个集合 ++
   println(List(1, 2) ++ Set(3, 4, 3) );$skip(50); 
   //合并两个集合
   println(List(1, 2) ::: List(2, 3));$skip(38); 
   //添加一个元素
   println(1 :: 2 :: Nil);$skip(40); 
   //添加一个元素
   println(List(1,6).:+(5));$skip(87); 
   //遍历每一个元素，收集case匹配上的元素值，返回一个新的集合
   println(List(0, 1, 0) collect {case 1 => "ok"});$skip(83); 
   //将一个元素，根据特定符号，拆分成单个元素组成的集合
   println(List("milk,tea") flatMap (_.split(',')));$skip(42); 
   //最大值
   println(List(41, 59, 26).max);$skip(54); 
   //最小值
   println(List(10.9, 32.5, 4.23, 5.67).min);$skip(43); 
   //连乘
   println(List(5, 6, 10).product);$skip(47); 
   //求和
   println(List(11.3, 23.5, 7.2).sum );$skip(52); 
   //是否存在
   println(List(34, 29, 18) contains 29 );$skip(60); 
   //是否以xxx结束
   println(List(0, 4, 3) endsWith List(4, 3));$skip(60); 
   //是否以xxx开始
   println(List(0, 4, 3) startsWith List(0) );$skip(67); 
   //最少有一个值小于18即为true
   println(List(24, 17, 32) exists (_ < 18));$skip(54); 
   println("=======================================");$skip(67); 
   //必须得所有值小于18才返回true
   println(List(5, 17, 2) forall (_ < 18) );$skip(49); 
   //求和
   println(List(4, 5, 6).fold(8)(_ + _));$skip(54); 
   //求和
   println(List(4, 5, 6).foldLeft(10)(_ + _));$skip(55); 
   //求和
   println(List(4, 5, 6).foldRight(0)(_ + _) );$skip(49); 
   //求和
   println(List(4, 5, 6).reduce(_ + _) );$skip(53); 
   //求和
   println(List(4, 5, 6).reduceLeft(_ + _) );$skip(54); 
   //求和
   println(List(4, 5, 6).reduceRight(_ + _) );$skip(51); 
   //阶段求和
   println(List(4, 5, 6).scan(0)(_ + _));$skip(55); 
   //阶段求和
   println(List(4, 5, 6).scanLeft(0)(_ + _));$skip(56); 
   //阶段求和
   println(List(4, 5, 6).scanRight(0)(_ + _));$skip(58); 
   //集合转换字符串
   println(List(24, 99, 104).mkString(", "));$skip(55); 
   //转成ArrayBuffer
   println(List('f', 't').toBuffer);$skip(62); 
   //转Map to List
   println(Map("a" -> 1, "b" -> 2).toList );$skip(61); 
   //转Set to Map
   println(Set(1 -> true, 3 -> true).toMap);$skip(56); 
   //转List to Set
   println(List(2, 5, 5, 3, 2).toSet);$skip(62); 
   //转List to String
   println(List(2, 5, 5, 3, 2).toString)
  
   //Java 与 Scala 集合互转
   //导入包
   import  collection.JavaConverters._
   import  collection.JavaConversions._
   import java.util.ArrayList;$skip(195); ;
   // scala 转 java
   val ja  =List(1,5,3).asJava;System.out.println("""ja  : java.util.List[Int] = """ + $show(ja ));$skip(24); 
   println(List(1,5,3));$skip(15); 
   println(ja);$skip(64); 
  // java 转 scala
   val s =new java.util.ArrayList(3).asScala;System.out.println("""s  : scala.collection.mutable.Buffer[Nothing] = """ + $show(s ));$skip(52); ;
  
   //集合的模式匹配
  
   val statuses = List(500, 404);System.out.println("""statuses  : List[Int] = """ + $show(statuses ));$skip(116); 
  
   val msg = statuses.head match {
    case x if x < 500 => "okay"
        case _ => "whoah, an error"
        };System.out.println("""msg  : String = """ + $show(msg ));$skip(25); 
  
   println("信息：",msg);$skip(110); 
   val msg2 = statuses match {
    case x if x contains(500) => "has error"
       case _ => "okay"
        };System.out.println("""msg2  : String = """ + $show(msg2 ));$skip(23); 
   println("信息：",msg2);$skip(222); 
  
   val msg3 = statuses match {
   case List(404, 500) => "not found & error"
        case List(500, 404) => "error & not found"
        case List(200, 200) => "okay"
        case _ => "not sure what happened"
        };System.out.println("""msg3  : String = """ + $show(msg3 ));$skip(26); 
  
   println("信息：",msg3);$skip(142); 
   val msg4 = statuses match {
    case List(500, x) => s"Error followed by $x"
        case List(e, x) => s"$e was followed by $x"
        };System.out.println("""msg4  : String = """ + $show(msg4 ));$skip(26); 
  
   println("信息：",msg4);$skip(98); 
  
   val head = List('r','g','b') match {
    case x :: xs => x
        case Nil => ' '
       };System.out.println("""head  : Char = """ + $show(head ));$skip(20); 
  
   println(head);$skip(249); 
  
  
   val code = ('h', 204, true) match {
    case (_, _, false) => 501
        case ('c', _, true) => 302
        case ('h', x, true) => x
        case (c, x, true) => {
        println(s"Did not expect code $c")
        x
          }
        };System.out.println("""code  : Int = """ + $show(code ));$skip(22); 
  
     println(code);$skip(59); 
     
  var source = Source.fromFile("c://a1.txt","UTF-8");System.out.println("""source  : scala.io.BufferedSource = """ + $show(source ));$skip(46); 
  val res =  source.getLines.foreach(println);System.out.println("""res  : Unit = """ + $show(res ));$skip(6); 
  res;$skip(175); 
  
  val numbers = "2014-12-01 00:00:00 INFO [apiAccessLog] - <|#|com.chanjet.csp.boss.cia.api.UserApi.findUserByIdentify|#|1cadcd4d-5c85-4c0b-9ac5-36c2743f2ddc|#|0|#|1|#|3>";System.out.println("""numbers  : String = """ + $show(numbers ));$skip(21); val res$0 = 
  numbers.split("#");System.out.println("""res0: Array[String] = """ + $show(res$0));$skip(10); val res$1 = 
  numbers;System.out.println("""res1: String = """ + $show(res$1));$skip(15); 
  source.close;$skip(42); 
  
  for(i<-1 to 10 if i%2==0) println(i);$skip(44); 
  def max(x:Int,y:Int){
  	println(x-y)
  };System.out.println("""max: (x: Int, y: Int)Unit""");$skip(15); 
  max(y=3,x=2)}
}
