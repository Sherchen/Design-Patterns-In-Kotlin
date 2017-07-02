object PrinterDriver {
    init {
        println("Initializing with object: $this")
    }

    fun print() = println("Printing with object: $this")
}

fun main(args: Array<String>) {
    println("Start")
    PrinterDriver.print()//第一次会调用init方法
    PrinterDriver.print()//使用object方式实现singleton模式
}
