import kotlin.random.Random

fun main(args: Array<String>) {
    while (true) {
        game()
    }
}
fun game(){
    println("1 - ножницы, 2 - бумага, 3 -камень")
    var inp = readLine()
    if (inp.toString() == "1"){
        val randomNumber = Random.nextInt(1, 4)
        if (randomNumber == 1){
            println("Компьютер: Ножницы")
            println("Ничья")
        }
        if (randomNumber == 2){
            println("Компьютер: Бумага")
            println("Ты выиграл")
        }
        if (randomNumber == 3){
            println("Компьютер: Камень")
            println("Ты проиграл")
        }
    }
    if (inp.toString() == "2"){
        val randomNumber = Random.nextInt(1, 4)
        if (randomNumber == 2){
            println("Компьютер: Бумага")
            println("Ничья")
        }
        if (randomNumber == 3){
            println("Компьютер: Камень")
            println("Ты выиграл")
        }
        if (randomNumber == 1){
            println("Компьютер: Ножницы")
            println("Ты проиграл")
        }
    }
    if (inp.toString() == "3"){
        val randomNumber = Random.nextInt(1, 4)
        if (randomNumber == 3){
            println("Компьютер: Камень")
            println("Ничья")
        }
        if (randomNumber == 1){
            println("Компьютер: Ножницы")
            println("Ты выиграл")
        }
        if (randomNumber == 2){
            println("Компьютер: Бумага")
            println("Ты проиграл")
        }
    }
}