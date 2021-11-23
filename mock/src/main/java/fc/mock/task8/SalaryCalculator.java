package fc.mock.task8;

public class SalaryCalculator {

    private BaseSalaryService baseSalaryService;
    private SaturdaySalaryService saturdaySalaryService;

    public SalaryCalculator(BaseSalaryService baseSalaryService, SaturdaySalaryService saturdaySalaryService) {
        this.baseSalaryService = baseSalaryService;
        this.saturdaySalaryService = saturdaySalaryService;
    }

    public double calculateSalary(String surname, double bonus, int numberOfSaturday) {

        return baseSalaryService.fetchBaseSalary(surname) + bonus + (saturdaySalaryService.fetchSaturdaySalary(surname) * numberOfSaturday);
    }
}
