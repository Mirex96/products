package products

fun main() {
    val productsStorage = ProductStorageIml()

    val productStorageManager = ProductStorageManager(ProductStorageIml())

    while (true) {
        println("Выберете пункт в меню...")
        println("1 - Показать все товары")
        println("2 - Добавить товар")
        println("3 - Удалить товар")
        println("4 - Выйти из программы учета товаров")
        val choice = readLine()


        try {
            val number = choice?.toInt()

            when (number) {
                1 -> println(productStorageManager.getProducts())
                2 -> {
                    println("Введите название товара...")
                    val name = readLine().toString() //обработка того, что может быть пустая строка
                    println("Введите стоимость товара...")
                    val price = readLine()?.toInt() ?: 0 //приравниваем к целым значениям
                    val product = SimpleProduct(name, price)
                    productStorageManager.add(product)


                }

                3 -> {
                    println("Введите название товара...")
                    val name = readLine().toString()
                    println("Введите стоимость товара...")
                    val price = readLine()?.toInt() ?: 0
                    val product = SimpleProduct(name, price)
                    productStorageManager.delete(product)


                }
                4 -> break
                else -> println("Не валидно выбрано число!")
            }
        } catch (t: Throwable) {
            println("Не валидный выбор, введите пункт меню")
        }
    }
    println("До свидания!")
}
