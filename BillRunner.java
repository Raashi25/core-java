class BillRunner{

	public static void main(String args[]){
		
		//class refVariable=new className();
		Bill ref=new Bill(); //this line is given by the main method.
		//instance variable
		ref.billId=1;
		ref.AmountWithTax=499.90;
		ref.PaymentMethod="UPI";
		ref.isTaxInclusive=true;
		 ref.isBillPaid=false;
		 ref.isBillOverDue=false;
		 ref.planType="montly";
		 ref.IssueDate="sep 20";
		 ref.DueDate="oct 20";
		
	
		
		Bill ref1=new Bill();
		ref1.billId=2;
		ref1.AmountWithTax=799.90;
		ref1.PaymentMethod="Cash";
		ref1.isTaxInclusive=false;
		 ref1.isBillPaid=false;
		 ref1.isBillOverDue=false;
		 ref1.planType="84 days";
		 ref1.IssueDate="june 20";
		 ref1.DueDate="aug 15";
		
		System.out.println("The bill id is "+ref1.billId);
		System.out.println("The amount and tax of the bill :"+ref1.AmountWithTax);
		System.out.println("The Payment Method: "+ref1.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref1.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref1.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref1.isBillOverDue);
		System.out.println("Type of plan: "+ref1.planType);
		System.out.println("Issue Date: "+ref1.IssueDate);
		System.out.println("Due Date: "+ref1.DueDate);
		
		Bill ref2=new Bill();
		ref2.billId=3;
		ref2.AmountWithTax=569.90;
		ref2.PaymentMethod="UPI";
		ref2.isTaxInclusive=true;
		 ref2.isBillPaid=false;
		 ref2.isBillOverDue=false;
		 ref2.planType="56 days";
		 ref2.IssueDate="jan 20";
		 ref2.DueDate="mar 10";
		
		System.out.println("The bill id is "+ref2.billId);
		System.out.println("The amount and tax of the bill :"+ref2.AmountWithTax);
		System.out.println("The Payment Method: "+ref2.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref2.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref2.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref2.isBillOverDue);
		System.out.println("Type of plan: "+ref2.planType);
		System.out.println("Issue Date: "+ref2.IssueDate);
		System.out.println("Due Date: "+ref2.DueDate);
		
		Bill ref3=new Bill();
		ref3.billId=4;
		ref3.AmountWithTax=1499.90;
		ref3.PaymentMethod="UPI";
		ref3.isTaxInclusive=true;
		 ref3.isBillPaid=false;
		 ref3.isBillOverDue=false;
		 ref3.planType="yearly";
		 ref3.IssueDate="jan 2024";
		 ref3.DueDate="jan 2025";
		
		System.out.println("The bill id is "+ref3.billId);
		System.out.println("The amount and tax of the bill :"+ref3.AmountWithTax);
		System.out.println("The Payment Method: "+ref3.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref3.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref3.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref3.isBillOverDue);
		System.out.println("Type of plan: "+ref3.planType);
		System.out.println("Issue Date: "+ref3.IssueDate);
		System.out.println("Due Date: "+ref3.DueDate);
		
		Bill ref4=new Bill();
		ref4.billId=5;
		ref4.AmountWithTax=199.90;
		ref4.PaymentMethod="UPI";
		ref4.isTaxInclusive=true;
		 ref4.isBillPaid=true;
		 ref4.isBillOverDue=true;
		 ref4.planType="24 days";
		 ref4.IssueDate="nov 20";
		 ref4.DueDate="dec 14";
		
		System.out.println("The bill id is "+ref4.billId);
		System.out.println("The amount and tax of the bill :"+ref4.AmountWithTax);
		System.out.println("The Payment Method: "+ref4.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref4.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref4.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref4.isBillOverDue);
		System.out.println("Type of plan: "+ref4.planType);
		System.out.println("Issue Date: "+ref4.IssueDate);
		System.out.println("Due Date: "+ref4.DueDate);
		
		Bill ref5=new Bill();
		ref5.billId=6;
		ref5.AmountWithTax=3602.90;
		ref5.PaymentMethod="UPI";
		ref5.isTaxInclusive=true;
		 ref5.isBillPaid=false;
		 ref5.isBillOverDue=false;
		 ref5.planType="yearly";
		 ref5.IssueDate="july 20";
		 ref5.DueDate="july 20";
		
		System.out.println("The bill id is "+ref5.billId);
		System.out.println("The amount and tax of the bill :"+ref5.AmountWithTax);
		System.out.println("The Payment Method: "+ref5.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref5.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref5.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref5.isBillOverDue);
		System.out.println("Type of plan: "+ref5.planType);
		System.out.println("Issue Date: "+ref5.IssueDate);
		System.out.println("Due Date: "+ref5.DueDate);
		
		Bill ref6=new Bill();
		ref6.billId=7;
		ref6.AmountWithTax=2999.90;
		ref6.PaymentMethod="UPI";
		ref6.isTaxInclusive=true;
		 ref6.isBillPaid=false;
		 ref6.isBillOverDue=false;
		 ref6.planType="yearly";
		 ref6.IssueDate="sep 20";
		 ref6.DueDate="sep 20";
		
		System.out.println("The bill id is "+ref6.billId);
		System.out.println("The amount and tax of the bill :"+ref6.AmountWithTax);
		System.out.println("The Payment Method: "+ref6.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref6.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref6.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref6.isBillOverDue);
		System.out.println("Type of plan: "+ref6.planType);
		System.out.println("Issue Date: "+ref6.IssueDate);
		System.out.println("Due Date: "+ref6.DueDate);
		
		Bill ref7=new Bill();
		ref7.billId=8;
		ref7.AmountWithTax=1799.00;
		ref7.PaymentMethod="card";
		ref7.isTaxInclusive=true;
		 ref7.isBillPaid=false;
		 ref7.isBillOverDue=false;
		 ref7.planType="yearly";
		 ref7.IssueDate="mar 12";
		 ref7.DueDate="mar 2";
		
		System.out.println("The bill id is "+ref7.billId);
		System.out.println("The amount and tax of the bill :"+ref7.AmountWithTax);
		System.out.println("The Payment Method: "+ref7.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref7.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref7.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref7.isBillOverDue);
		System.out.println("Type of plan: "+ref7.planType);
		System.out.println("Issue Date: "+ref7.IssueDate);
		System.out.println("Due Date: "+ref7.DueDate);
		
		Bill ref8=new Bill();
		ref8.billId=9;
		ref8.AmountWithTax=499.90;
		ref8.PaymentMethod="UPI";
		ref8.isTaxInclusive=true;
		 ref8.isBillPaid=false;
		 ref8.isBillOverDue=false;
		 ref8.planType="montly";
		 ref8.IssueDate="sep 20";
		 ref8.DueDate="oct 20";
		
		System.out.println("The bill id is "+ref8.billId);
		System.out.println("The amount and tax of the bill :"+ref8.AmountWithTax);
		System.out.println("The Payment Method: "+ref8.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref8.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref8.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref8.isBillOverDue);
		System.out.println("Type of plan: "+ref8.planType);
		System.out.println("Issue Date: "+ref8.IssueDate);
		System.out.println("Due Date: "+ref8.DueDate);
		
		Bill ref9=new Bill();
		ref9.billId=10;
		ref9.AmountWithTax=609.90;
		ref9.PaymentMethod="UPI";
		ref9.isTaxInclusive=true;
		 ref9.isBillPaid=true;
		 ref9.isBillOverDue=false;
		 ref9.planType="77 days";
		 ref9.IssueDate="july 20";
		 ref9.DueDate="nov 20";
		
		System.out.println("The bill id is "+ref9.billId);
		System.out.println("The amount and tax of the bill :"+ref9.AmountWithTax);
		System.out.println("The Payment Method: "+ref9.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref9.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref9.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref9.isBillOverDue);
		System.out.println("Type of plan: "+ref9.planType);
		System.out.println("Issue Date: "+ref9.IssueDate);
		System.out.println("Due Date: "+ref9.DueDate);
		
		Bill ref10=new Bill();
		ref10.billId=11;
		ref10.AmountWithTax=199.90;
		ref10.PaymentMethod="UPI";
		ref10.isTaxInclusive=true;
		 ref10.isBillPaid=false;
		 ref10.isBillOverDue=false;
		 ref10.planType="montly";
		 ref10.IssueDate="mar 20";
		 ref10.DueDate="apr 20";
		
		System.out.println("The bill id is "+ref10.billId);
		System.out.println("The amount and tax of the bill :"+ref10.AmountWithTax);
		System.out.println("The Payment Method: "+ref10.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref10.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref10.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref10.isBillOverDue);
		System.out.println("Type of plan: "+ref10.planType);
		System.out.println("Issue Date: "+ref10.IssueDate);
		System.out.println("Due Date: "+ref10.DueDate);
		
		Bill ref11=new Bill();
		ref11.billId=12;
		ref11.AmountWithTax=489.90;
		ref11.PaymentMethod="Paytm";
		ref11.isTaxInclusive=true;
		 ref11.isBillPaid=false;
		 ref11.isBillOverDue=false;
		 ref11.planType="30";
		 ref11.IssueDate="jan 20";
		 ref11.DueDate="mar 10";
		
		System.out.println("The bill id is "+ref11.billId);
		System.out.println("The amount and tax of the bill :"+ref11.AmountWithTax);
		System.out.println("The Payment Method: "+ref11.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref11.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref11.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref11.isBillOverDue);
		System.out.println("Type of plan: "+ref11.planType);
		System.out.println("Issue Date: "+ref11.IssueDate);
		System.out.println("Due Date: "+ref11.DueDate);
		
		Bill ref12=new Bill();
		ref12.billId=13;
		ref12.AmountWithTax=499.90;
		ref12.PaymentMethod="UPI";
		ref12.isTaxInclusive=true;
		 ref12.isBillPaid=false;
		 ref12.isBillOverDue=false;
		 ref12.planType="montly";
		 ref12.IssueDate="sep 20";
		 ref12.DueDate="oct 20";
		
		System.out.println("The bill id is "+ref12.billId);
		System.out.println("The amount and tax of the bill :"+ref12.AmountWithTax);
		System.out.println("The Payment Method: "+ref12.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref12.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref12.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref12.isBillOverDue);
		System.out.println("Type of plan: "+ref12.planType);
		System.out.println("Issue Date: "+ref12.IssueDate);
		System.out.println("Due Date: "+ref12.DueDate);
		
		Bill ref13=new Bill();
		ref13.billId=14;
		ref13.AmountWithTax=409.90;
		ref13.PaymentMethod="card";
		ref13.isTaxInclusive=true;
		 ref13.isBillPaid=false;
		 ref13.isBillOverDue=false;
		 ref13.planType="77 days";
		 ref13.IssueDate="may 7";
		 ref13.DueDate="aug 20";
		
		System.out.println("The bill id is "+ref13.billId);
		System.out.println("The amount and tax of the bill :"+ref13.AmountWithTax);
		System.out.println("The Payment Method: "+ref13.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref13.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref13.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref13.isBillOverDue);
		System.out.println("Type of plan: "+ref13.planType);
		System.out.println("Issue Date: "+ref13.IssueDate);
		System.out.println("Due Date: "+ref13.DueDate);
		
		Bill ref14=new Bill();
		ref14.billId=15;
		ref14.AmountWithTax=219.0;
		ref14.PaymentMethod="UPI";
		ref14.isTaxInclusive=true;
		 ref14.isBillPaid=false;
		 ref14.isBillOverDue=false;
		 ref14.planType="28 days";
		 ref14.IssueDate="sep 20";
		 ref14.DueDate="oct 18";
		
		System.out.println("The bill id is "+ref14.billId);
		System.out.println("The amount and tax of the bill :"+ref14.AmountWithTax);
		System.out.println("The Payment Method: "+ref14.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref14.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref14.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref14.isBillOverDue);
		System.out.println("Type of plan: "+ref14.planType);
		System.out.println("Issue Date: "+ref14.IssueDate);
		System.out.println("Due Date: "+ref14.DueDate);
		
		Bill ref15=new Bill();
		ref15.billId=16;
		ref15.AmountWithTax=199.00;
		ref15.PaymentMethod="UPI";
		ref15.isTaxInclusive=true;
		 ref15.isBillPaid=false;
		 ref15.isBillOverDue=false;
		 ref15.planType="24 days";
		 ref15.IssueDate="july 17";
		 ref15.DueDate="aug 9";
		
		System.out.println("The bill id is "+ref15.billId);
		System.out.println("The amount and tax of the bill :"+ref15.AmountWithTax);
		System.out.println("The Payment Method: "+ref15.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref15.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref15.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref15.isBillOverDue);
		System.out.println("Type of plan: "+ref15.planType);
		System.out.println("Issue Date: "+ref15.IssueDate);
		System.out.println("Due Date: "+ref15.DueDate);
		
		Bill ref16=new Bill();
		ref16.billId=17;
		ref16.AmountWithTax=799.90;
		ref16.PaymentMethod="card";
		ref16.isTaxInclusive=true;
		 ref16.isBillPaid=false;
		 ref16.isBillOverDue=false;
		 ref16.planType="quaterly";
		 ref16.IssueDate="june 21";
		 ref16.DueDate="dec 16";
		
		System.out.println("The bill id is "+ref16.billId);
		System.out.println("The amount and tax of the bill :"+ref16.AmountWithTax);
		System.out.println("The Payment Method: "+ref16.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref16.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref16.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref16.isBillOverDue);
		System.out.println("Type of plan: "+ref16.planType);
		System.out.println("Issue Date: "+ref16.IssueDate);
		System.out.println("Due Date: "+ref16.DueDate);
		
		Bill ref17=new Bill();
		ref17.billId=18;
		ref17.AmountWithTax=499.90;
		ref17.PaymentMethod="UPI";
		ref17.isTaxInclusive=true;
		 ref17.isBillPaid=false;
		 ref17.isBillOverDue=false;
		 ref17.planType="montly";
		 ref17.IssueDate="sep 20";
		 ref17.DueDate="oct 20";
		
		System.out.println("The bill id is "+ref17.billId);
		System.out.println("The amount and tax of the bill :"+ref17.AmountWithTax);
		System.out.println("The Payment Method: "+ref17.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref17.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref17.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref17.isBillOverDue);
		System.out.println("Type of plan: "+ref17.planType);
		System.out.println("Issue Date: "+ref17.IssueDate);
		System.out.println("Due Date: "+ref17.DueDate);
		
		Bill ref18=new Bill();
		ref18.billId=19;
		ref18.AmountWithTax=329.90;
		ref18.PaymentMethod="Paytm";
		ref18.isTaxInclusive=true;
		 ref18.isBillPaid=false;
		 ref18.isBillOverDue=false;
		 ref18.planType="28 days";
		 ref18.IssueDate="sep 20";
		 ref18.DueDate="oct 18";
		
		System.out.println("The bill id is "+ref18.billId);
		System.out.println("The amount and tax of the bill :"+ref18.AmountWithTax);
		System.out.println("The Payment Method: "+ref18.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref18.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref18.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref18.isBillOverDue);
		System.out.println("Type of plan: "+ref18.planType);
		System.out.println("Issue Date: "+ref18.IssueDate);
		System.out.println("Due Date: "+ref18.DueDate);
		
		Bill ref19=new Bill();
		ref19.billId=20;
		ref19.AmountWithTax=499.90;
		ref19.PaymentMethod="UPI";
		ref19.isTaxInclusive=true;
		 ref19.isBillPaid=false;
		 ref19.isBillOverDue=false;
		 ref19.planType="56 days";
		 ref19.IssueDate="mar 7";
		 ref19.DueDate="apr 30";
		
		System.out.println("The bill id is "+ref19.billId);
		System.out.println("The amount and tax of the bill :"+ref19.AmountWithTax);
		System.out.println("The Payment Method: "+ref19.PaymentMethod);
		System.out.println("The Tax Inclusive: "+ref19.isTaxInclusive);
		System.out.println("Whether the Bill Paid: "+ref19.isBillPaid);
		System.out.println("Whether the Bill is Over Due: "+ref19.isBillOverDue);
		System.out.println("Type of plan: "+ref19.planType);
		System.out.println("Issue Date: "+ref19.IssueDate);
		System.out.println("Due Date: "+ref19.DueDate);
		
		}
		}