public class Calculator {
    int users;
    double totalCost = 0.00;
    String listOfProducts = "";
    Calculator(int users)
    {
        this.users = users;
    }

    void addProduct(Product product)
    {
        totalCost += product.costOfProduct;
        // формируем список продуктов заранее
        Formatter formatter = new Formatter();
        listOfProducts = listOfProducts + "\n" + product.nameOfProduct +  " - "
            + formatter.roundingTheDouble(product.costOfProduct)
            + formatter.displayCurrency(product.costOfProduct);
        System.out.println("Товар успешно добавлен.");
    }

    void displayProducts()
    {
        System.out.println("Добавленнные товары:" + listOfProducts);
    }

    double calculateScoreForEachPerson()
    {
        return totalCost / users;
    }

}
