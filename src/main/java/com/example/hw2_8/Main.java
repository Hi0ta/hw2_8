package com.example.hw2_8;
import java.time.LocalDate;
import java.util.*;
public class Main {
    static Map<String, Passport> updatePassport = new HashMap<>();
    public static void main(String[] args) {
        Product milk = new Product("молоко", 65, 1);
        Product tea = new Product("чай", 450, 0.5);
        Product coffee = new Product("кофе", 650, 0.2);
        Product banana = new Product("банан", 39, 1);
        Product apple = new Product("яблоко", 35, 1);
        Product orange = new Product("апельсин", 85, 1);
        Product orange2 = new Product("апельсин", 85, 1);
        Product cream = new Product("сливки", 55, 0.2);
        Set<Product> setProduct = new HashSet<>();
        setProduct.add(milk);
        setProduct.add(tea);
        setProduct.add(coffee);
        setProduct.add(banana);
        setProduct.add(apple);
        setProduct.add(orange);
        setProduct.add(orange2);
        setProduct.add(tea);
        setProduct.add(milk);
        setProduct.add(cream);

        int countP = 1;
        for (Product product : setProduct) {
            System.out.println(countP + " " + product.toString());
            countP++;
        }
        System.out.println();
        Recipe salad = new Recipe("фруктовый салат", Set.of(banana, orange, apple));
        Recipe coffeeMilk = new Recipe("кофе с молоком", Set.of(coffee, milk));
        Recipe coffeeMilk2 = new Recipe("кофе и молоко", Set.of(coffee, milk));
        Recipe teaMilk = new Recipe("чай с молоком", Set.of(tea, milk));
        Recipe teaMilk2 = new Recipe("чай с молоком", Set.of(tea, milk, cream));

        Set<Recipe> setRecipe = new HashSet<>();
        setRecipe.add(salad);
        setRecipe.add(coffeeMilk);
        setRecipe.add(coffeeMilk2);
        setRecipe.add(teaMilk);
        setRecipe.add(teaMilk2);
        int countR = 1;
        for (Recipe recipe : setRecipe) {
            System.out.println(countR + " " + recipe.toString());
            countR++;
        }
        System.out.println();

        java.util.Random random = new java.util.Random();
        List<Integer> nums = new ArrayList<>(20);
        for (int x = 0; x < 20; x++) {
            nums.add(random.nextInt(1_000));
        }
        System.out.println(nums);
        for (int x = 0; x < nums.size(); x++) {
            if (nums.get(x) % 2 != 0) {
                nums.remove(x);
                x = -1;
            }
        }
        System.out.println(nums);
        System.out.println();

        List<String> zadachi = new ArrayList<>();
            for (int a = 1, b = 1; b < 10; a= a - b, b++) {
                for (; a < 10; a++) {
                    String z = a + " * " + b;
                    zadachi.add(z);
                }
            }
        for (int count = 1; count < 16; count++){
            System.out.println(count + " задача: " + zadachi.get(count));
        }
        System.out.println();

        Passport passport1 = new Passport("654983", "Иванов", "Иван", "Иванович", LocalDate.of(1978, 2,6));
        Passport passport2 = new Passport("654983", "Ивановских", "Ян", "Петрович", LocalDate.of(1979, 6,2));
        Passport passport3 = new Passport("985452", "Сергеев", "Данил", "Андреевич", LocalDate.of(1981, 12,8));
        Passport passport4 = new Passport("874321", "Игорев", "Денис", "Абрамович", LocalDate.of(1998, 1,13));
        Passport passport5 = new Passport("217653", "Лаптева", "Инна", "Романовна", LocalDate.of(1952, 8,22));
        updatePassport.put(passport1.getNumberPassport(), passport1);
        updatePassport.put(passport2.getNumberPassport(), passport2); //должны обновиться все данные у этого номера паспорта
        updatePassport.put(passport3.getNumberPassport(), passport3);
        updatePassport.put(passport4.getNumberPassport(), passport4);
        updatePassport.put(passport5.getNumberPassport(), passport5);

        System.out.println("список поспортов:");
        for (Map.Entry<String, Passport> updatePassport: updatePassport.entrySet()){
        System.out.println(updatePassport.getValue());
        }
        System.out.println();
        System.out.println("поиск по номеру паспорта:");
        System.out.println(updatePassport.get("874321"));
        System.out.println(updatePassport.get("874322"));

        /*if (updatePassport.containsKey("874322")){
            System.out.println(updatePassport.get("874322"));
        }else {
            System.out.println("паспорта с таким номером в списке нет");
        }*/

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
