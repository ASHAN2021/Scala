error id: file:///F:/Scala/labsheet01/labsheet_2/Q4.scala:[522..522) in Input.VirtualFile("file:///F:/Scala/labsheet01/labsheet_2/Q4.scala", "object question04{
    def main(args: Array[String]): Unit ={

    }
}
def noOfAttendees(ticket_price: Double): Double={
        120 + (15 - ticket_price) * 4 // /5 *20
    }
def cost(ticket_price: Double):Double={
    var noOfshow= (noOfAttendees(ticket_price)/120)
    if(noOfshow <= 1){
        noOfshow=1
    }else{
        noOfshow=2
    }
    
       noOfshow*500+noOfAttendees(ticket_price)*3 
    }
def income(ticket_price:Double):Double={
    noOfAttendees(ticket_price)*ticket_price
}
def 
")
file:///F:/Scala/labsheet01/labsheet_2/Q4.scala
file:///F:/Scala/labsheet01/labsheet_2/Q4.scala:23: error: expected identifier; obtained eof

^
#### Short summary: 

expected identifier; obtained eof