package products

class ProductStorageManager(private val productStorage: ProductStorage) {
    fun add(product: Product) {
        productStorage.add(product)
    }

    fun delete(product: Product) {
        productStorage.delete(product)
    }

    fun getProducts(): String {
       val product = productStorage.getProducts()
        return if (product.isEmpty()) {
            "Продуктов нет!"
        } else {
            product.toString()
        }
    }




}