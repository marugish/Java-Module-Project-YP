public class Formatter {
    String roundingTheDouble(double totalCostForEach)
    {
        return String.format("%.2f", totalCostForEach);
    }

    String displayCurrency(double totalCostForEach)
    {
        String currency;
        int cost = (int) Math.floor(totalCostForEach);
        switch (cost % 10) {
            case 1 -> {
                if (cost % 100 == 11) currency = " рублей.";
                else currency = " рубль.";
            }
            case 2, 3, 4 ->
            {
                if (cost % 100 == 12 || cost % 100 == 13 || cost % 100 == 14)
                    currency = " рублей.";
                else currency = " рубля.";
            }
            default -> currency = " рублей.";
        }
        return currency;
    }
}
