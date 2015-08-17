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
  def check2():Boolean=return true;System.out.println("""check2: ()Boolean""")}
  //var testType:Int=_
}
