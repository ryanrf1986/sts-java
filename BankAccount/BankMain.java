public class BankMain {
    public static void main(String[] notArgs) {
        BankAccount ryBank = new BankAccount();
        
        System.out.printf("|---- TOTAL BANK ACCOUNTS #%s -----|\n",
        BankAccount.getTotalAccounts()
        );

        ryBank.setChecking(100);
        ryBank.setSavings(200);
        System.out.println("\n|----- Ry's Bank Accounts ----|");
        System.out.printf("Checking Account: $%.2f\n", ryBank.getChecking());
        System.out.printf("Savings Account: $%.2f\n", ryBank.getSavings());

        ryBank.addToEither("savings", 50);
        ryBank.displayAccounts();
        
        BankAccount anotherBank = new BankAccount();
        System.out.printf("|---- TOTAL BANK ACCOUNTS #%s -----|\n",
        BankAccount.getTotalAccounts()
        );
        System.out.printf("|--- All The Money :: $%.2f ---|\n",
        BankAccount.getAllTheMoney()
        );
        
    }
}