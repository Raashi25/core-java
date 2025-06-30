class Bank{
	static String bankName	 ="State bank of india";
	static String bankBranch ="katipalla";
	static String ifscCode    ="SBI098765";
	static String branchCode ="HFV9087";
	static String location	 ="KATIPALLA,SURATHKAL";
	static String branchManager = "Suresh Kamath";
    static String assistantManager = "Anita Shetty";
    static int numberOfEmployees = 45;
    static int numberOfATMs = 3;
    static int yearEstablished = 1992;
	static double totalDepositsCrore = 125.76;
    static double totalLoansCrore = 98.45;
    static double annualInterestRate = 6.5;
    static double minimumBalance = 1000.00;
    static double fixedDepositInterest = 7.25;
    static int totalCustomers = 28500;
    static int savingsAccounts = 18000;
    static int currentAccounts = 8000;
    static int loanAccounts = 2500;
    static double averageMonthlyTransaction = 4500000.75;
	
	
							
 public static void main(String[] args) {

        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + bankBranch);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Branch Code: " + branchCode);
        System.out.println("Location: " + location);
        System.out.println("Branch Manager: " + branchManager);
        System.out.println("Assistant Manager: " + assistantManager);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Number of ATMs: " + numberOfATMs);
        System.out.println("Year Established: " + yearEstablished);
        System.out.println("Total Deposits: ₹" + totalDepositsCrore + " crore");
        System.out.println("Total Loans: ₹" + totalLoansCrore + " crore");
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Minimum Balance: ₹" + minimumBalance);
        System.out.println("Fixed Deposit Interest: " + fixedDepositInterest + "%");
        System.out.println("Total Customers: " + totalCustomers);
        System.out.println("Savings Accounts: " + savingsAccounts);
        System.out.println("Current Accounts: " + currentAccounts);
        System.out.println("Loan Accounts: " + loanAccounts);
        System.out.println("Average Monthly Transactions: ₹" + averageMonthlyTransaction);
    }
}