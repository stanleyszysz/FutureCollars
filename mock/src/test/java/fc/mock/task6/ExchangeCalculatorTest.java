package fc.mock.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExchangeCalculatorTest {

    private ExchangeCalculator exchangeCalculator;
    private CurrencyExchangeService mockedExchangeService;

    @BeforeEach
    void setUp() {
        mockedExchangeService = Mockito.mock(CurrencyExchangeService.class);
        Mockito.when(mockedExchangeService.fetchExchangeRate(Currencies.PLN, Currencies.GPB)).thenReturn(5.5555);
        Mockito.when(mockedExchangeService.fetchExchangeRate(Currencies.PLN, Currencies.USD)).thenReturn(3.3333);
        Mockito.when(mockedExchangeService.fetchExchangeRate(Currencies.PLN, Currencies.EUR)).thenReturn(4.4444);
        exchangeCalculator = new ExchangeCalculator(mockedExchangeService);

    }

    @ParameterizedTest
    @CsvSource(value = {"PLN, GPB, 150.00, 833.325", "PLN, USD, 150.00, 499.995", "PLN, EUR, 150.00, 666.66"})
    void calculateExchange(Currencies currencyForSale, Currencies currencyToBuy, double amountToExchange,
                           double result) {
        double amount = exchangeCalculator.calculateExchange(currencyForSale, currencyToBuy, amountToExchange);
        assertEquals(result, amount);
    }
}