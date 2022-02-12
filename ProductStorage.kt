package products

abstract class ProductStorage {
    protected abstract val productList: List<Product>

    open fun add(product: Product) {

    }

    open fun delete(product: Product) {

    }

    fun getProducts(): List<Product> = productList

}

class ProductStorageIml : ProductStorage() {
    override val productList = mutableListOf<Product>()

    override fun add(product: Product) {
        productList.add(product)
    }

    override fun delete(product: Product) {
        productList.remove(product)
    }

}