/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class AccountDirectory {
    
    private ArrayList<Account>accountList;

    public AccountDirectory() {
       
        this.accountList = new ArrayList<Account>();
    }
    
    

    public ArrayList<Account> getAccountlist() {
        return accountList;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountList = accountlist;
    }
    
    
    public Account addAccount(){
    Account account = new Account();
    accountList.add(account);
    return account;
     }
    
    public void deleteAccount(Account account){
        accountList.remove(account);
    }
    public Account searchAccount(String accountNumber){
    for(Account account: accountList){
    
        if(account.getAccountNumber().equals(accountNumber)){
            return account;
        }
    }
        return null;
                }
}