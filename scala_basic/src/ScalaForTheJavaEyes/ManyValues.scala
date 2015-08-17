package ScalaForTheJavaEyes

/**
 * @author qiaolei
 * 高阶函数
 */
object ManyValues extends App{
  def totalResultOverRange(number:Int,codeBlock:Int=>Int):Int={
    var result =0
    for(i<-1 to number){
      result+=codeBlock(i)
    }
    result
  }
  println(totalResultOverRange(11, i=>i))
  println(totalResultOverRange(11, i=>if(i%2==0) 1 else 0))
  println(totalResultOverRange(11, i=>if(i%2!=0) 1 else 0))
  def inject(arr:Array[Int],initial:Int,operation:(Int,Int)=>Int):Int={
    var carryOver = initial
    arr.foreach(element=>carryOver = operation(carryOver,element))
    carryOver
  }
  var array=Array(2,3,5,1,6,4)
  val sum = inject(array,0,(carryOver,elem)=>carryOver+elem)
  println(sum)
}