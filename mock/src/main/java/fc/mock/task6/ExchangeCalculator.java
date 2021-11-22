package fc.mock.task6;

public class ExchangeCalculator {

    private final CurrencyExchangeService currencyExchangeService;

    public ExchangeCalculator(CurrencyExchangeService currencyExchangeService) {
        this.currencyExchangeService = currencyExchangeService;
    }

    public double calculateExchange(Currencies currencyForSale, Currencies currencyToBuy, double amountToExchange) {

        return amountToExchange * currencyExchangeService.fetchExchangeRate(currencyForSale, currencyToBuy);
    }

}
