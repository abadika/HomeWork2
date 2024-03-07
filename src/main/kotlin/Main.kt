fun main(args: Array<String>) {

    val numbers = doubleArrayOf(8.0, -2.0, -4.0, 2.0, 3.0, 6.0, 1.5, -3.0, 10.0, -1.0, 7.0, -8.0, 4.0, -6.0, 9.0)
    var foundNegative = false

    var sum = 0.0
    var count = 0
    for(number in numbers){
        if (foundNegative){
            if(number>0){
                sum += number
                count++
            }
        }else{
            if (number<0){
                foundNegative = true
            }
        }
    }
    if (count>0){
        val average = sum/count
        println("Среднее арифметическое положительных чисел после первого отрицательного:$average")
    }

}