import scala.io.StdIn.readInt
@main
def run():Unit={
    println("Enter normal hours: ")
    val Normal=readInt()
    println("Enter OT hours: ")
    val OT=readInt()
    val income=Income(Normal,OT)
    val tax=Tax(Normal,OT)
    println("Month Salary: ")
    println(TakeHome(income,tax))
}

def Income(Normal:Int,OT:Int):Int={
    250*Normal + 85*OT
}
def Tax(Normal:Int,OT:Int):Float={
    if(Normal>=40 && OT>=30)
        0.12
    else
        0
}
def TakeHome(Income:Int,Tax:Float):Float={
    Income-Income*Tax
}