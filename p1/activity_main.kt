fun main(args: Array<String>){
   println("Hello World")
}


fun main(args: Array<String>){
    for(x in 1 .. 5){
        println("Hello World")
    }
 }

 
 fun main(args: Array<String>){

    val number=20
    if(number > 0){
        println("Positive Number.")
    }
    else{
        println("Negative Number")
    }
 }
 


fun main(args: Array<String>){

    val n1=10
    val n2=20
    val n3=30
    val max = if(n1 > n2){
       if(n1 > n3){
           n1
       }
        else{
            n3
       }
    }
    else{
        if(n2 > n3){
            n2
        }
        else{
            n3
        }
    }
    println("Max= $max")
}



open class Person{
    open fun printMessage(){
        println("Message for Person")
    }
 }class Child:Person(){
    override fun printMessage(){
        println("Message for Child")
    }
 }
 
 open class Boy : Person(){
    final override fun printMessage(){
        println("Message for Boys")
    }
 }
 class Hero : Boy(){
    fun printdata(){
        super.printMessage()
        println("Hello World")
    }
 }
 fun main(args: Array<String>){
    Person().printMessage()
    Child().printMessage()
    Hero().printdata()
 }

 

 
 open class Employee(name: String, age: Int, salary: Int){
    init{
        println("My name is $name, $age years old and earning $salary per month")
    }
    }
 class WebDeveloper(name: String, age: Int, salary: Int):Employee(name, age, salary){
    fun website(){
       println("I am website developer")
       println()
    }
 }
 
 class AndroidDeveloper(name: String, age: Int, salary: Int):Employee(name, age, salary){
    fun android(){
        println("I am android app developer")
        println()
    }
 }
 
 class iosDeveloper(name: String, age: Int, salary: Int):Employee(name, age, salary){
    fun iosapp(){
        println("I am website developer")
        println()
    }
 }
 
fun main(args: Array<String>){
    val wd = WebDeveloper("Jack" , 25, 10000)
    wd.website()
 
    val ad = AndroidDeveloper("John", 27, 12000)
    ad.android()
 
    val iosd = iosDeveloper("Smith", 28, 20000)
    iosd.iosapp()
 }
 
 

 fun main(args: Array<String>){
    try{
        val data = 20/0
    }
    catch(e: ArithmeticException) {
        println(e)
    }
 }
 



 class myClass(password: String){
    constructor(name: String, id: Int, password: String) : this(password){
        println("name = ${name}")
        println("Id = ${id}")
        println("password = ${password}")
    }
 }
 fun main(args: Array<String>){
    val myclass = myClass("Sujal", 1724,"SJ")
 }
 

 


 
 
 