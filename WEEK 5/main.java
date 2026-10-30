
import transaction.Account;
import reports.TransactionReport;

public class MainApplication {
    public static void main(String[] args) {

        Account acc = new Account(1001, 5000);

        System.out.println("Initial Balance: Rs." +
                           acc.getBalance());

        acc.deposit(2000);

        acc.withdraw(1500);

        TransactionReport report =
            new TransactionReport();

        report.generateReport(acc);
    }
}
