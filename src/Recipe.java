import java.util.*;

public class Recipe {
    private Set<Product> productSet;
    private int sumProduct;
    private String name;

    public Recipe(String name) {
        this.productSet = new HashSet<>();
        this.name = name;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public int getSumProduct() {
        return sumProduct;
    }

    public String getName() {
        return name;

    }
    public void ProductInRecipe(Product... products) {
        this.productSet.addAll(Arrays.asList(products));
        for (Product product : this.productSet) {
            this.sumProduct += product.getPrice() * product.getQuantity();

        }
    }

    public void addResipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new RuntimeException("Такой рецепт " + this.name + " уже есть!");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productSet=" + productSet +
                ", sumProduct=" + sumProduct +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return sumProduct == recipe.sumProduct && Objects.equals(productSet, recipe.productSet) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productSet, sumProduct, name);
    }
}
