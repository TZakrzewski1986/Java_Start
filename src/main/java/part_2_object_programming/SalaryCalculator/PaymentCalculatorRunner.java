package part_2_object_programming.SalaryCalculator;

public class PaymentCalculatorRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Edek", "Kowalski", 3000);
        double nettoYearPayment = PaymentCalculator.nettoYearPayment(employee);
        double bruttoYearPayment = PaymentCalculator.bruttoYearPayment(employee);
        System.out.printf("Roczna pensja pracownika bez opodatkowania to: %.0f\n", nettoYearPayment);
        System.out.printf("Roczna pensja pracownika z opodatkowaniem to: %.0f\n", bruttoYearPayment);
    }
}
