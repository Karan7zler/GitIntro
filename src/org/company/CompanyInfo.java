package org.company;

public class CompanyInfo {
	
	private void companyName() {
	    System.out.println("Company Details: ");
		}
		
		private void companyName(int id) {
		    System.out.println("Company Id: "+id);
			}
		
		private void employeeName(String name) {
			System.out.println("Employee Name: "+name);
		}
		
		private void companyName(int accNum,long reg) {
		    System.out.println("Employee Acc.Number: "+accNum+"\nCompany Reg.Number: "+reg);
			}
		
		public static void main(String[] args) {
			
			CompanyInfo c = new CompanyInfo();
			c.companyName();
			c.companyName(1234);
			c.employeeName("Karan");
			c.companyName(1205, 4210345565l);
			
		}

}
