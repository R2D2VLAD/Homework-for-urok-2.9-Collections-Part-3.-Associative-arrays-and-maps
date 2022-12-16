import java.util.*;

public class Main {
    public static Map<String, Integer> map = new HashMap();
    public static void main(String[] args) {
        System.out.println("Задание 1");

        HashMap<String, String> telefonSpravo4nik = new HashMap<>();
        telefonSpravo4nik.put("Иванов Иван", "+7-950-788-64-75");
        telefonSpravo4nik.put("Петров Григорий", "+7-950-788-65-74");
        telefonSpravo4nik.put("Гуницкий Максим", "+7-950-788-60-70");
        telefonSpravo4nik.put("Житарь Владислав", "+7-908-788-64-75");
        telefonSpravo4nik.put("Маурер Эдуард", "+7-951-788-64-75");
        telefonSpravo4nik.put("Лещётный Алексей", "+7-920-788-64-75");
        telefonSpravo4nik.put("Матросов Илья", "+7-950-780-64-75");
        telefonSpravo4nik.put("Бек Илья", "+7-950-765-64-75");
        telefonSpravo4nik.put("Джордж Джордан", "+7-950-743-64-75");
        telefonSpravo4nik.put("Баклажанов Ильяс", "+7-814-720-64-75");
        telefonSpravo4nik.put("Дмитриев Дмитрий", "+7-950-720-50-75");
        telefonSpravo4nik.put("Сосиска Горчица", "+7-950-720-64-10");
        telefonSpravo4nik.put("Перцов Евгений", "+7-560-720-64-75");
        telefonSpravo4nik.put("Булков Булочник", "+7-950-600-64-75");
        telefonSpravo4nik.put("Харитонов Илья", "+7-950-720-30-75");
        telefonSpravo4nik.put("Влад Влад", "+7-950-720-50-75");
        telefonSpravo4nik.put("Отброс Отбросов", "+7-100-720-64-75");
        telefonSpravo4nik.put("Матроскин Кот", "+7-950-400-64-75");
        telefonSpravo4nik.put("Имингай Канто", "+7-211-720-70-75");
        telefonSpravo4nik.put("Яровой Алекс", "+7-950-800-64-75");
        System.out.println(telefonSpravo4nik);
        System.out.println(telefonSpravo4nik.values());
        System.out.println(telefonSpravo4nik.keySet());
        System.out.println();

        System.out.println("Задание 2");

        Product banan = new Product(
                "Банан",
                15,
                1.5);
        Product avakado = new Product(
                "Авакадо",
                30,
                2);
        Product apples = new Product(
                "Яблоко",
                15,
                1.75);
        Product apelsin = new Product(
                "Апельсин",
                40,
                3);
        Product grusha = new Product(
                "Груша",
                28,
                5);

        HashMap<Product, Double> theBasket = new HashMap<>();

        theBasket.put(banan, banan.getQuantity());
        theBasket.put(avakado, avakado.getQuantity());
        theBasket.put(apples, apples.getQuantity());
        theBasket.put(apelsin, apelsin.getQuantity());
        theBasket.put(grusha, grusha.getQuantity());
        System.out.println(theBasket);


        System.out.println("Задание 2 Продолжение");

        HashMap<Recipe, Set<Product>> recipe = new HashMap<>();

        Recipe fruitSalad1 = new Recipe("Салат 1");
        Recipe fruitSalad2 = new Recipe("Салат 2");
        Recipe fruitSalad3 = new Recipe("Салат 3");
        Recipe fruitSalad4 = new Recipe("Салат 4");
        Recipe fruitSalad5 = new Recipe("Салат 5");

        fruitSalad1.ProductInRecipe(banan, apples);
        fruitSalad2.ProductInRecipe(grusha, apples);
        fruitSalad3.ProductInRecipe(banan, avakado);
        fruitSalad4.ProductInRecipe(apelsin, avakado);
        fruitSalad5.ProductInRecipe(grusha, apelsin);

        recipe.put(fruitSalad1, fruitSalad1.getProductSet());
        recipe.put(fruitSalad2, fruitSalad2.getProductSet());
        recipe.put(fruitSalad3, fruitSalad3.getProductSet());
        recipe.put(fruitSalad4, fruitSalad4.getProductSet());
        recipe.put(fruitSalad5, fruitSalad5.getProductSet());
        System.out.println(recipe);
        System.out.println();

        System.out.println("Задание 3");
        map.put("Влад", 18);
        map.put("Эдик", 20);
        map.put("Илья", 21);
        map.put("Макс", 19);
        add("Влад", 19);
        System.out.println(map);

        System.out.println("Задание 4");
        Map<String, List<Integer>> random = new HashMap<>();
        List<Integer> list1 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10));
        List<Integer> list2 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10));
        List<Integer> list3 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10));
        List<Integer> list4 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10));
        List<Integer> list5 = new ArrayList<>(List.of(
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10,
                (int) (Math.random() * 1000) + 10));
        random.put("Стакан", list1);
        random.put("Кружка", list2);
        random.put("Ложка", list3);
        random.put("Вилка", list4);
        random.put("Доска", list5);
        for (Map.Entry<String, List<Integer>> entry : random.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(sumList(list1));
        System.out.println(sumList(list2));
        System.out.println(sumList(list3));
        System.out.println(sumList(list4));
        System.out.println(sumList(list5));
        System.out.println();

        System.out.println("Задание 5");
        int count = 1;
        Map<Integer, String> auto = new HashMap<>();
        auto.put(count++, "audi");
        auto.put(count++, "bmw");
        auto.put(count++, "mersedes");
        auto.put(count++, "wolkswagen");
        auto.put(count++, "lada");
        auto.put(count++, "toyota");
        auto.put(count++, "infiniti");
        auto.put(count++, "shkoda");
        auto.put(count++, "hyndai");
        auto.put(count++, "lambargini");
        System.out.println(auto);

        for (Map.Entry<Integer, String> entry : auto.entrySet()) {
                System.out.println(entry);
        }
    }
    public static void add(String string, Integer integer) {
        if (Objects.equals(map.put(string, integer), integer)) {
            throw new UnsupportedOperationException("Введите значение");
        }
    }
    public static int sumList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
        }
    }