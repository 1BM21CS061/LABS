/*1.     Create a class Customer
with the following specifications. 


Private Members :


               Customer_no , Customer_name,  Qty ,  Price, TotalPrice, Discount, Netprice.


  Methods: Public members:


               1. A parameterized constructor
to assign initial


               2. Input( ) – to read data
members. Call Caldiscount().


 3. Caldiscount ( ) – To calculate Discount according to TotalPrice and NetPrice


                      TotalPrice = Price*Qty


                      TotalPrice >=50000 – Discount 25% of TotalPrice


                      TotalPrice >=25000 - Discount 10% of TotalPrice


                      Netprice= TotalPrice-Discount


4.Show( ) – to display Customer details.                     


Develop a Java program to accept details of n
customers, calculate the discounts given to them and print their complete
details.*/

/*------------------------------------------------------------------------------------------------------------------*/

import java.util.Scanner;
class Customer
{	
	Scanner x = new Scanner(System.in);
	private int customer_no,qty;
	private double price,tot_price,discount,netprice;
	private String customer_name;
	Customer(int number)
	{
		this.customer_no = number;	
	}

	public void Input()
	{
		System.out.println("Enter name:");
		this.customer_name = x.next();
		System.out.println("Enter quantity:");
		this.qty = x.nextInt();
		System.out.println("Enter price:");
		this.price = x.nextFloat();			
	}

	public void Caldiscount()
	{
		this.tot_price = this.qty*this.price;
		if(this.tot_price>=50000)
		{
			this.netprice = this.tot_price*(1-0.25);
		}
		else if(this.tot_price>=25000)
		{
			this.netprice = this.tot_price*(1-0.1);	
		}
		else
		{
			this.netprice = this.tot_price;
		}
	}
	
	public void Show()
	{
		System.out.println("Name of customer:"+this.customer_name);
		System.out.println("Number of customer:"+this.customer_no);
		System.out.println("Price:"+this.price);
		System.out.println("Quantity:"+this.qty);
		System.out.println("Total price:"+this.tot_price);
		System.out.println("Net Price:"+this.netprice);
		
	}
}

class Cust_main
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		int number;
		Customer[] cust_arr = new Customer[2];
		for(int i=0; i<2; i++)
		{
			System.out.println("Enter number:");
			number = x.nextInt();
			cust_arr[i] = new Customer(number);	
		}
		
		for(int i=0; i<2; i++)
		{
			cust_arr[i].Input();
			cust_arr[i].Caldiscount();
			cust_arr[i].Show();
			System.out.println("------------------------------------------");	
		}
	}
}