import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Formatter formatter = new Formatter();
        while (true) {
            System.out.println("На скольких человек разделить счёт?");
            try {
                int persons = scanner.nextInt();
                scanner.nextLine();
                if (persons < 1) System.out.println("Ошибка: некорректное число пользователей.");
                else if (persons == 1) System.out.println("Ошибка: делить ничего не требуется.");
                else {
                    System.out.println("Успех: корректное число пользователей, можете воспользоваться калькулятором.");
                    Calculator calculator = new Calculator(persons);
                    while (true) {
                        System.out.println("Введите название товара:");
                        String nameOfProduct = scanner.nextLine().trim();
                        if (nameOfProduct.isEmpty()) {
                            System.out.println("Ошибка: некорректная длина названия товара.");
                        } else {
                            double costOfProduct;
                            while (true) {
                                System.out.println("Введите стоимость товара (Формат: рубли,копейки):");
                                try {
                                    costOfProduct = scanner.nextDouble();
                                    scanner.nextLine();
                                    if (costOfProduct <= 0.00) {
                                        System.out.println("Ошибка: некорректная цена, введите положительное число.");
                                    } else break;
                                } catch (InputMismatchException e) {
                                    System.out.println("Ошибка: недопустимый тип ввода.");
                                    scanner.nextLine();
                                }
                            }
                            // Можно создавать и добавлять в список новый продукт
                            Product product = new Product(nameOfProduct, costOfProduct);
                            calculator.addProduct(product);

                            System.out.println("Добавить ещё товар?");
                            String usersAnswer = scanner.nextLine();
                            if (usersAnswer.equalsIgnoreCase("завершить")) break;
                        }
                    }
                    // Вывод результатов пользователю
                    calculator.displayProducts();
                    double scoreForEachPerson = calculator.calculateScoreForEachPerson();
                    System.out.println("Итоговая стоимость: "
                            + formatter.roundingTheDouble(scoreForEachPerson)
                            + formatter.displayCurrency(scoreForEachPerson));
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: недопустимый тип ввода. Требуется ввести целое число.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}