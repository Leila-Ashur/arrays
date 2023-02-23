fun main() {
    besties()
    countries()
    number()
    names("Rita","Racheal","sera")

}
fun besties(){
 var freinds = arrayOf("leila","val","caro","gladys")
    println(freinds.contentToString())
}
fun countries(){
var cities= arrayOf("harare","mumbai","dodoma","jakata")
    var grammatical = println(cities.map { it.capitalize() })
    println()

     }
fun number(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var numb = numbers[1]+numbers[4]
    println(numb)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun names(name1:String,name2:String,name3:String):String{
    var naming = arrayOf(name1,name2,name3)
    return naming.contentToString()


}




