object ScalaProgramDesign {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
  println("Welcome to the Scala worksheet");$skip(37); 
  (1 to 3).foreach(i => print(i+""));$skip(18); 
  println("dfdf");$skip(81); 
  def getPersonInfo(primaryKey:Int)={
  	("sucre","scala","www.chanjet.com")
  };System.out.println("""getPersonInfo: (primaryKey: Int)(String, String, String)""");$skip(46); 
  val (name,tecnolige,url) = getPersonInfo(1);System.out.println("""name  : String = """ + $show(name ));System.out.println("""tecnolige  : String = """ + $show(tecnolige ));System.out.println("""url  : String = """ + $show(url ));$skip(215); 
  val content = """Have the best of both worlds.
  Construct elegant class hierarchies for maximum
  code reuse and extensibility, implement their behavior using
  higher-order functions. Or anything in-between.""";System.out.println("""content  : String = """ + $show(content ));$skip(15); 
  val a,b,c =1;System.out.println("""a  : Int = """ + $show(a ));System.out.println("""b  : Int = """ + $show(b ));System.out.println("""c  : Int = """ + $show(c ));$skip(42); 
 //在scala中==就代表值 的比较
  val str1 = "hello";System.out.println("""str1  : String = """ + $show(str1 ));$skip(21); 
  val str2 = "hello";System.out.println("""str2  : String = """ + $show(str2 ));$skip(32); 
  val str3 =new String("hello");System.out.println("""str3  : String = """ + $show(str3 ));$skip(13); val res$0 = 
  str1==str2;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(15); val res$1 = 
  str1 eq str2;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(15); val res$2 = 
  str1 == str3;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(15); val res$3 = 
  str1 eq str3;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(20); 
  def check1()=true;System.out.println("""check1: ()Boolean""");$skip(35); 
  def check2():Boolean=return true;System.out.println("""check2: ()Boolean""");$skip(66); 
  //var testType:Int=_
   (1 to 9).map("*" *_).foreach(println _);$skip(43); 
   (1 to 9).map("*" +_).foreach(println _);$skip(61); 
   val feeds = List("baidu.com","google.com","blogspot.com");System.out.println("""feeds  : List[String] = """ + $show(feeds ));$skip(14); val res$4 = 
   feeds.head;System.out.println("""res4: String = """ + $show(res$4));$skip(12); val res$5 = 
   feeds(1);System.out.println("""res5: String = """ + $show(res$5));$skip(58); 
   //在List前面加字符
   val prefxedList = "sina.com.cn"::feeds;System.out.println("""prefxedList  : List[String] = """ + $show(prefxedList ));$skip(58); 
   //在list前面添加List
   val totalList = feeds:::prefxedList;System.out.println("""totalList  : List[String] = """ + $show(totalList ));$skip(64); val res$6 = 
   //判断list中的所有字符是否都包括com
   totalList.forall(_ contains "com");System.out.println("""res6: Boolean = """ + $show(res$6));$skip(66); val res$7 = 
   //统计list中每个内容的长度，以逗号分割显示
   feeds.map(_.length).mkString(", ");System.out.println("""res7: String = """ + $show(res$7));$skip(60); val res$8 = 
   //从左往右计算所有字符的累计长度，初始值为0，然后依次累加
   (0/:feeds)(_+_.length);System.out.println("""res8: Int = """ + $show(res$8));$skip(60); val res$9 = 
   //从右往左计算所有字符的累计长度，初始值为0，然后依次累加
   (feeds:\0)(_.length+_);System.out.println("""res9: Int = """ + $show(res$9));$skip(24); val res$10 = 
   ((1 to 100):\0)(_+_);System.out.println("""res10: Int = """ + $show(res$10));$skip(24); val res$11 = 
   (0/:(1 to 100))(_+_);System.out.println("""res11: Int = """ + $show(res$11))}
   
}
