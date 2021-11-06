package fc.introduction.bill;

public class BillCalculator {
    double billValue;
    float servicePayment;
    double discount;
    short takeawayPackagingFee;

    double calculate(double billValue, float servicePayment) {
        double totalAmount = billValue + billValue * servicePayment;
        return totalAmount;
    }

    double calculate(double billValue, float servicePayment, double discount) {
        double billValueAfterDiscount = (1 - discount) * billValue;
        double totalAmount = billValueAfterDiscount + billValueAfterDiscount * servicePayment;
        return totalAmount;
    }

    double calculate(double billValue, float servicePayment, short takeawayPackagingFee) {
        double totalAmount = billValue + billValue * servicePayment + takeawayPackagingFee;
        return totalAmount;
    }
}
