/*class int(o:Int){
    var p=o
    def ++():Int={
        var q=p
        p=p+1
        q
    }
    def --():Int={
        var q=p
        p=p-1
        q
    }
    override def toString(): String = p.toString
    def v():Int=p.toInt
}
def ++(o:Int):Int=o+1
def --(o:Int):Int=o-1

@main
def run()={
    var (a,b,c,d)=(2,3,4,5)
    var k=4.3f
    var g=4.0f
    
    println(--(b)*a.v() + c.v() * d.--())
    b-=1
    println(a.++())
    println(-2*(g-k)+c.v())
    println(c.++())
    println(++(c.v())*a.++())

}*/
var (a,b,c,d) = (2,3,4,5)
var k:Float=4.3f
var g:Float=4.0f
@main
def run():Unit={
    A()
    B()
    C()
    D()
    E()
}
def ++(n:Int):Int=n+1
def --(n:Int):Int=n-1
def A():Unit=println(--(b) * a + c * --(d))
def B():Unit=println(++(a))
def C():Unit=println(-2 * (g - k) + c)
def D():Unit=println(++(c))
def E():Unit=println(++(c) * ++(a))