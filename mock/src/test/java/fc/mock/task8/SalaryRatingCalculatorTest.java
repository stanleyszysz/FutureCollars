package fc.mock.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SalaryRatingCalculatorTest {

    private BaseSalaryService mockedBaseSalaryService;
    private SaturdaySalaryService mockedSaturdaySalaryService;
    private SalaryCalculator salaryCalculator;


    @BeforeEach
    void setUp() {
        mockedBaseSalaryService = Mockito.mock(BaseSalaryService.class);
        mockedSaturdaySalaryService = Mockito.mock(SaturdaySalaryService.class);
        Mockito.when(mockedBaseSalaryService.fetchBaseSalary("Smith")).thenReturn(4550.00);
        Mockito.when(mockedSaturdaySalaryService.fetchSaturdaySalary("Smith")).thenReturn(350.00);
        Mockito.when(mockedBaseSalaryService.fetchBaseSalary("Brown")).thenReturn(3200.00);
        Mockito.when(mockedSaturdaySalaryService.fetchSaturdaySalary("Brown")).thenReturn(150.00);
        Mockito.when(mockedBaseSalaryService.fetchBaseSalary("Johnson")).thenReturn(0.00);
        Mockito.when(mockedSaturdaySalaryService.fetchSaturdaySalary("Johnson")).thenReturn(0.00);
        salaryCalculator = new SalaryCalculator(mockedBaseSalaryService, mockedSaturdaySalaryService);
    }

    @ParameterizedTest
    @CsvSource(value = {"Smith, 1100.00, 2, 6350.00", "Brown, 600.00, 0, 3800.00", "Johnson, 0.00, 0, 0.00"})
    void calculateSalary(String surname, double bonus, int numberOfSaturday, double expectedSalary) {
        double totalSalary = salaryCalculator.calculateSalary(surname,bonus,numberOfSaturday);
        assertEquals(expectedSalary, totalSalary);

    }
}