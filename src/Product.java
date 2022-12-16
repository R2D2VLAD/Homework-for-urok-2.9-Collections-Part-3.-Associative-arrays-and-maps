import java.util.Objects;
import java.util.Set;

public class Product {
    private final String name;
    private int price;
    private double quantity;
    private boolean bought;

    public Product(String name, int price, double quantity) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку полностью!");
        }
        if (Double.compare(price, 0) == 0) {
            throw new RuntimeException("Заполните карточку полностью!");
        } else {
            this.price = price;
            if (Double.compare(quantity, 0) == 0) {
                throw new RuntimeException("Заполните карточку полностью!");
            } else {
                this.quantity = quantity;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (Double.compare(price, 0) == 0) {
            throw new RuntimeException("Заполните карточку полностью!");
        } else {
            this.price = price;
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (Double.compare(quantity, 0) == 0) {
            throw new RuntimeException("Заполните карточку полностью!");
        } else {
            this.quantity = quantity;
        }
    }

    public void productsInTheBasket(Set<Product> theBasket) {
        if (!theBasket.contains(this)) {
            theBasket.add(this);
            this.bought = true;
        } else {
            throw new RuntimeException("Продукт " + this.name + " уже находится в корзине!");
        }
    }

    @Override
    public String toString() {
        return "Продукт - " + getName() +
                ", кг нужно";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return price == product.price && Double.compare(product.quantity, quantity) == 0 && bought == product.bought && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity, bought);
    }
}