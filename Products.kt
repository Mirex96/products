package products

abstract class Product {
    abstract val price: Int
    abstract val name: String

}

data class SimpleProduct(
    override val name: String,
    override val price: Int
) : Product() {
    override fun toString(): String {
        return "Товар с названием: $name, и стоимостью: $price"
    }
}
