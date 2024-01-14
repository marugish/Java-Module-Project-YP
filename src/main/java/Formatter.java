public class Formatter {
    String roundingTheDouble(double totalCostForEach) {
        return String.format("%.2f", totalCostForEach);
    }

    String displayCurrency(double totalCostForEach) {
        String currency;
        String standardCurrency = " рублей.";
        int cost = (int) Math.floor(totalCostForEach);
        int preCalcCost = cost % 100;
        switch (cost % 10) {
            case 1 -> {
                if (preCalcCost == 11) currency = standardCurrency;
                else currency = " рубль.";
            }
            case 2, 3, 4 -> {
                if (preCalcCost >= 12 && preCalcCost <= 14)
                    currency = standardCurrency;
                else currency = " рубля.";
            }
            default -> currency = standardCurrency;
        }
        return currency;
    }
}
