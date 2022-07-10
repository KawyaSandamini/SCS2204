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