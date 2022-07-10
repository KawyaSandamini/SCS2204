var k,i,j:Int=2;
var m,n:Int=5;
var f=12.0f;
var g=4.0f;
var c='X';

@main
def run():Unit={
    Q1()
    Q2()
    Q3()
    Q4()
    Q5()
    Q6()
}
def Q1():Unit=println(k + 12*m)
def Q2():Unit=println(m / j)
def Q3():Unit=println(n % j)
def Q4():Unit=println(m / j * j)
def Q5():Unit=println(f + 10*5 + g)
def Q6():Unit=println(i+1 * n)   //++i operator not work in scala; ++i = i+1