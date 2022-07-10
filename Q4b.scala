@main
def run()={
    gprofit(5)
    gprofit(10)
    gprofit(15)
    gprofit(20)
}
def attendees(price:Int):Int={
    if(price == 15)
        120
    else if(price > 15)
        120 + ((price-15)/5)*20
    else if(price < 15)
        120 - ((15-price)/5)*20
    else
        0
}
def revenue(price:Int)=attendees(price) * price
def cost(price:Int):Int={500+3*attendees(price)}
def profit(revenue:Int,cost:Int)=revenue-cost
def gprofit(price:Int)=println(profit(revenue(price),cost(price)))