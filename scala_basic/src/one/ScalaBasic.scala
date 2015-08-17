package one

import scala.util.Random
import scala.util.matching
import scala.math.BigInt._
import scala.math.BigInt
import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.propertiesAsScalaMap
import java.util.TimeZone
import sun.org.mozilla.javascript.internal.ast.Yield
import java.awt.datatransfer.SystemFlavorMap
import java.awt.datatransfer.DataFlavor
import scala.collection.mutable.LinkedHashMap
import java.util.Calendar
import java.util.Currency
import scala.io.Source
import java.io.PrintWriter
object ScalaBasic extends App{//这里如果继承了App，就不用再写main方法了，
//因为App中已经实现了main方法
//def main(args: Array[String]) {
  //第一章	
  val s = "Harry"
  println(s.count(_.isUpper))
  println(s.patch(1, "ugg", 3))
  println("crazy"*3)
  println(10 max 2)
  println(BigInt(2).pow(1024))
  println(probablePrime(100,Random))
  println(BigInt(Random.nextInt).toString(36))
  println(s.head+"-"+s.last+"-"+s.take(3)+"-"+s.drop(3)+"-"+s.takeRight(3)+"-"+s.dropRight(3))
  //第二章
  val x = 9
  val n = if(x>0) 1 else -1
  var m = if(x > 0) "positive" else ()
  println(n+"-"+m)
  /**
   * 以下为dos中的操作，注意观察返回值
   * scala> val x = 9
	x: Int = 9

	scala>   val n = if(x>0) 1 else -1
	n: Int = 1
	
	scala>   var m = if(x > 0) "positive" else -1
	m: Any = positive
   */
  //to包括上限10
  for(i <- 1 to 10){
    println(i);
  }
  //until不包括上线10
  for(m <- 1 until 10){
    println(m);
  }
  //多层循环
  for(i<- 1 to 3;j<- 1 to 3 if i!=j){
    print((10*i+j)+" ");
  }
  for(i<- 1 to 10) yield i % 3	
  for(c<-"Hello";i<-0 to 1) yield (c+i).toChar
  for(i<-0 to 1;c<-"Hello") yield (c+i).toChar
  println(fac(3));
  println(sum(2,3,5,6,7,8));
  /*
   * _*表示将1 to 5当作参数处理，将它转为序列
   */
  println(sum(1 to 5: _*));
  box("Hello World");
  //第二章习题
  //Unit类型相当于java中的void类型
  //1
  println(calSignNum(10)+":::"+BigInt(10).signum)//这两个返回的结果相同
  //4
  for(i<-0 to 10 reverse) println(i)
  //5
  countdown(3)
  //6
  var t:Long =1
  for(i<-"Hello"){
    t=t*i.toLong
  }
  println(t)
  //7
  var k:Long =1
  "Hello".foreach(k*=_.toLong)
  println(k)
  //8
  println(product("word"))
  //9
  println(product_1("word"))
  //10
  println(mi(3,3))
  //end
  //第3章
  //将函数赋值给xaa
  val xaa = product _
  println(xaa("world"));
  //定长数组
  val s_3 = Array("Hello","world")//因为已有初始值，所以不需要new
  println(s_3(0))//取数组的内容时要用()，而不是[]
  //赋值
  s_3(0)="GoodBye!!!"
  println(s_3(0))
  //变长数组
  val b = ArrayBuffer[Int]()
  //赋值
  b+=0//单值
  println(b(0))
  //多值
  b+=(1,2,3,4,5,6)
  println(b(6))
  //用++=追加任意集合
  b++=Array(7,8,9,10)
  println(b(9))
  //删除后面的元素用trimEnd，删除前面的元素用trimStart(下标从1开始)
  //b.trimEnd(9)//删除最后9个元素
  println(b(0))
  b.trimStart(1)
  println(b(0))
  b.insert(2, 6,6) //在下标2之前插入内容
  println("sum:"+b.sum+"==max:"+b.max+"==min:"+b.min+"==sorted:"+b.sorted)
  for(xxx<-b)
    print(xxx)
    println("")
  b.remove(2, 2)//从下标2开始向后删除2位数字
  //array和arraybuffer的相互转换
  //buffer to array:xx.toArray
  //array to buffer:xx.toBuffer
  println(b.toArray)
  for(i<- 0 until 10)//[0,10)
    print(i)
    println("")
  for(i<- 0 to 10)//[0,10]
    print(i)
    println("")
  for(i<- 0 until (10,2))//每隔两个元素一跳，现在是只循环偶数
    print(i)
    println("")
  for(i<- (0 until 10).reverse)
    print(i)
    println("")
   for(sss<- 0.to(10))//相当于java中的增强for,sss为定义的变量，0.to(10)相当于数组
     print(sss)
     println("")
   //数组转换for(...) yield
   val result = for(e<- 0 to 10) yield 2 * e
   var result1 = for(e<- 0 to 10 if e%2==0) yield 2 * e
   for(ee<-result1)
     print(ee)
     println("")
   print(result.toString+"\n")
   //多维数组
   val matrix = Array.ofDim[Int](3,4)
   //第三章练习题 start
   //1
   val a = randomArray(10)
   for(arr<-a){
     print(arr+"\n")
   }
  //2
  val ax = replaceE(Array(1,2,3,4,5));
  ax.foreach(print)
  println("")
  
  //4
  recordArray(Array(-1,0,3,-4,5,8)).foreach(print)
  println("")
  //5
  val a5 = Array[Int](5,8,9,3,6,2,1,6,6,9,8)
  println(a5.sum/a5.length)
  //6
  a5.reverse.foreach(print)
  println("")
  //7
  a5.distinct.foreach(print)
  println("")
  //8
  //9
  //获取时区内容
  val ta = TimeZone.getAvailableIDs()
  //筛选出包含American/的内容，去掉这个内容，将结果放到一个新的数组中
  var tb = for(i<-0 until ta.length if ta(i).contains("America/")) yield ta(i).replace("America/", "")
  tb.sorted
  tb.foreach(println)
  //10
  var flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  print(flavors.getNativesForFlavor(DataFlavor.imageFlavor))
  //end
  
  //第4章
  //固定map
  val scores = Map("Alice"->10,"Bob"->3,"Cindy"->8)
  //非固定map
  val scoress = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8)
  //获取map中的值
  val bobscore = if(scores.contains("Bob")) scores("Bob") else 0
  //快捷写法
  val bbobscore = scores.getOrElse("Bob", 0)
  //用+=增加map的元素，用-=减少map中的元素，用于可变map
  scoress+=("Fred"->7)
  scoress-="Fred"
  //也可以直接添加
  scoress("Fred")=7
  //获取key集合
  scores.keySet.foreach(print)
  //获取values
  for(v<-scores.values) print(v)
  //key values位置互换
  val newscores = for((k,v)<-scores) yield (v,k)
  newscores.foreach(println)
  //如果要按顺序访问map，要使用LinkedHashMap
  //元组的分组操作
  print("Happy Birthday".partition(_.isUpper))
  //toMap可以将对偶的集合转换成映射
  val keys = Array("Java","C++","Scala")
  val values = Array("9","8","10")
  val allmap = keys.zip(values).toMap
  allmap.foreach(println)
  //第4章习题
  //1
  val game = Map("knife"->90,"clothes"->87,"dress"->100)
  val gameOffKey = game.keySet
  val gameOffValue = for(i<-game.values) yield i*0.9
  val gameOff = gameOffKey.zip(gameOffValue).toMap
  gameOff.foreach(println)
  //2~5题 在学完第9章后有更好的解决方法
  //6
  val linkedMap = LinkedHashMap("Monday"->Calendar.MONDAY,"Tuesday"->Calendar.TUESDAY)
  linkedMap.foreach(println)
  //end
  
  //第5章
  //在scala分别用xxx和xxx_= 表示getter和setter(其中xxx为对象属性名，例如age)
  //第6章习题
  //6
  EnumTest.values.foreach(println)
  EnumTest.doWhat(EnumTest.Black )
  //第9章
  //从文件读取
  var source = Source.fromFile("c://a1.txt","UTF-8")
  source.getLines.foreach(println)
  source.close
  //从URL地址读取
  var soucre1 = Source.fromURL("http://www.baidu.com","UTF-8")
  var source2 = Source.fromString("Hello, World")
  var source3 = Source.stdin
  //写入文本
  var out = new PrintWriter("c://a.txt")
  for(i<-1 to 100) out.println(i)
  out.close()
  //遍历目录 
  //for(i<- subdirs("c://")) println(i)
  //正则
  //正则表达式中后面要有.r才能使用findFirstIn之类的方法
  val wsnumwsPattern = """\s+[0-9]+\s+""".r
  val m1 = wsnumwsPattern.findFirstIn("99 bottles,98 bottles")
  val numitemPattern = "([0-9]+) ([a-z]+)".r
  val numitemPattern(num,item)="99 bottles"
   numitemPattern.findFirstIn("99 bottles,98 bottles").foreach(println)
   numitemPattern .findPrefixOf("99 bottles,89 bottles").foreach(println)
//}
/**
 * 一个递归函数
 */
def fac(n:Int):Int = if(n<=0) 1 else n * fac(n-1)
/**
 * 可以支持任意多的参数
 */
def sum(args:Int*)={
    var result =0
    for(arg<-args) result +=arg
    result
}
/**
 * 这是一个过程没有返回值，注意它和函数的区别就是{前面没有等号，如果要加等号，要用:Unit=
 */
def box(s:String){
  var border = "-"*s.length()+"--\n"
  println(border +"|"+s+"|\n"+border);
}
def calSignNum(signNum:Int)={
  var result =0
  if(signNum >0){
    result =1
  }
  if(signNum <0){
    result = -1
  }
  result
}
def countdown(n:Int){
  for(i<-0 to n reverse){
    print(i)
  }
  //0 to n reverse foreach print
}
def product(s:String):Long={//这里可以不加:Long
  var l:Long =1
  for(i1<-s){
    l*=i1.toLong
  }
	l
}

def product_1(s:String):Long={
  if(s.length == 1) return s.charAt(0).toLong 
else s.take(1).charAt(0).toLong * product(s.drop(1))
}

def mi(x:Double,n:Int):Double={
  if(n==0){
    1
  }else if(n>0 && n%2==0){
    mi(x,n/2) * mi(x,n/2)
  }else if(n>0 && n%2 ==1){
    x*mi(x,n-1)
  }else{
    1/mi(x,-n)
  }

}
def randomArray(n:Int)={
  val a = ArrayBuffer[Int]()
  a++= 0.until(scala.util.Random.nextInt(n))
  a.toArray
}
def replaceE(arr:Array[Int]):Array[Int]={
  val t = arr.toBuffer
    for(i <- 0 until (t.length,2) if i + 1 < t.length){
        val a = t(i)
        val b = t(i + 1)
        t.remove(i,2)
        t.insert(i,b)
        t.insert(i + 1,a)
    }
    t.toArray
}
def recordArray(arr:Array[Int]):Array[Int]={
  val a = arr.filter(_ >0).map(1 *_)
  var b = arr.filter(_ <=0).map(1 *_)
  val c = a.toBuffer
  c ++= b
  c.toArray
}
/*********spark以下为重点内容**********/
def countNum(x:Int,y:Int):Int={
  x+y
}
def _countNum=(x:Int,y:Int)=>x+y
def countNum1(x:Int)(y:Int) =x+y
//可变参数
def variableParameter(s:String*)={
  s.foreach(x=>println(x))
  s.foreach(print)
}
//默认参数
def defaultValue(name:String="how do you do!"):String={
  "Hello "+name
}
//调用上面两个函数,两个函数返回的内容是一致的
println(countNum(3,4))
println(_countNum(4,3))
println(countNum1(2)(5))
variableParameter("I","like","Spark")
print(defaultValue())
def mm={
  var ar = Array(0)
  var ar1 =0
  ar match {
  case Array(0) => ar1 = 333
}
  println(ar1)
}
  println(mm)
  val (l,y) = (1,2)
  println(l,y)
  val (q,r) = BigInt(10)/%2
  println(q,r)
  var ar3 = Array(2,3,5)
  val Array(first,second,_*)=ar3
  Array(first,second).foreach(println)
  for((k,v)<- System.getProperties()){
    println(k+"->"+v)
  }
  var listT:List[Int] = Nil
  //::这个符号相当于给list中添加元素,这个符号为右连接性，操作时从右往左执行
  //这里的map中只要出现比较符，那么返回的就是true/false，如果出现的是操作符(计算符)，就直接返回计算结果
  (8::9::10::3::1::2::listT).filter(_ >0).map(_ %2).foreach(println)
  /*val sc = new SparkContext("spark://172.18.8.239:7077", "ScalaBasic",System.getenv("SPARK_HOME"), Seq(System.getenv("SPARK_TEST_JAR")))
  val file = sc.textFile("hdfs://172.18.8.239:9000/user/test/qiaoleiinput/spark_test.txt")
  file.flatMap(line => line.split(" ")).map(word => (word,1)).reduceByKey(_+_)
  println(count)*/
}