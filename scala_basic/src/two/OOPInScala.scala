package two

class OOPInScala {

}
class Person{
  var name:String = _
  val age = 28
  //这样定义为private后外界无法访问
  private[this] val gender = "male"
}
//如果构造函数中的参数没有定义为val或var，那么说明参数为private
//附属构造器是用this声明的
//附属构造器中必须主构造器或其它附属构造器
class Person1(val name:String,val age:Int){
  var gender :String =_
  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }
}

object OOPInScala{
  def main(args: Array[String]) {
  val p = new Person
  p.name = "sucre"
  println(p.name +":"+ p.age)
  val p1 = new Person1("mike",29,"male")
  println(p1.name +":"+p1.age )
  println(p1.age +":"+ p1.gender +":"+ p1.name )
}
}