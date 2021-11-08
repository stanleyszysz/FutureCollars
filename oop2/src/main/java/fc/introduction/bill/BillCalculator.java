package fc.introduction.bill;

public class BillCalculator {

    double calculate(double billValue, float servicePayment) {
        return billValue + billValue * servicePayment;
    }

    double calculate(double billValue, float servicePayment, double discount) {
        double billValueAfterDiscount = (1 - discount) * billValue;
        return billValueAfterDiscount + billValueAfterDiscount * servicePayment;
    }

    double calculate(double billValue, float servicePayment, short takeawayPackagingFee) {
        return billValue + billValue * servicePayment + takeawayPackagingFee;
    }
}
