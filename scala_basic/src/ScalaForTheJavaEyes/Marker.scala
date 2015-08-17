package ScalaForTheJavaEyes

/**
 * @author qiaolei
 */
class Marker private (val color:String){
  var testType:Int=_
  println(testType)
  println("Creating"+this)
  override def toString():String = "marker color "+color 
}
object Marker{
  private val markers = Map("red"->new Marker("red"),
      "blue"->new Marker("blue"),
      "green"->new Marker("green"))
      def getMarker(color:String)=
        if(markers.contains(color)) markers(color) else null
}
object test extends App{
  println(Marker getMarker "blue")
  println(Marker getMarker "blue")
  println(Marker getMarker "red")
  println(Marker getMarker "red")
  println(Marker getMarker "black")
}