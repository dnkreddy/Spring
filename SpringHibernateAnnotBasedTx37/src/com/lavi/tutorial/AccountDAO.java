package com.lavi.tutorial;
/*
 *  Drop table accounts;
CREATE TABLE Accounts(acctno NUMBER(5)PRIMARY KEY,bal NUMBER(5),acType VARCHAR2(2));
 Insert into Accounts values(100,5000,'SA');
  Insert into Accounts values(101,2000,'CA'); 
  Insert into Accounts values(102,1500,'SA');
 */
public interface AccountDAO {
	public void deposit(int acctNo,int amt);
	public void withDraw(int acctNo,int amt);
    public void fundsTransfer(int fromAcctNo,int toAcctNo,int amt);
    public double getBalance(int acctNo);
}
