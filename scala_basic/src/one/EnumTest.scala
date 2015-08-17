package one

object EnumTest extends Enumeration {
	type poker = Value
	val Red,Black,Flower,Found=Value
	def doWhat(color:poker)={
	  if(color==Red){
	    println("1")
	  }else if(color==Black){
	    println("2")
	  }
	}
}