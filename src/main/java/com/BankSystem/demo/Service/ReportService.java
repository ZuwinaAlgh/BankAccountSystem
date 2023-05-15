package com.BankSystem.demo.Service;

import com.BankSystem.demo.DTO.AccountHistoryWithTransactions;
import com.BankSystem.demo.DTO.AccountStatementGenerater;
import com.BankSystem.demo.Models.Account;
import com.BankSystem.demo.Repository.AccountRepository;
import com.BankSystem.demo.Repository.CreditCardRepository;
import com.BankSystem.demo.Repository.CustomerRepository;
import com.BankSystem.demo.Repository.TransactionRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
    public static final String pathToReports = "C:\\Users\\user011\\Downloads\\reports";
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CreditCardRepository creditCardRepository;
    @Autowired
    private TransactionRepository transactionRepository;


    public String generateAccountStatementReport() throws FileNotFoundException, JRException {
        List<Account> accountList=accountRepository.getAllAccounts();
        List<AccountStatementGenerater> accountStatementGeneraters=new ArrayList<>();
        for (Account account: accountList){
            String customerName=account.getCustomer().getCustomerName();
            String customerPhoneNumber=account.getCustomer().getCustomerPhoneNumber();
            String accountName=account.getAccountName();
            Integer accountNumber=account.getAccountNumber();
            Double balance=account.getBalance();
            AccountStatementGenerater accountStatementGenerater=new AccountStatementGenerater(customerName,customerPhoneNumber,accountName,accountNumber,balance);
            accountStatementGeneraters.add(accountStatementGenerater);

        }

        File file = new File("C:\\Users\\user011\\IdeaProjects\\demo\\demo\\src\\main\\resources\\AccountStatement.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(accountStatementGeneraters);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "ZuwinaALghafri");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\AccountReport.pdf");
        return "Report generated : " + pathToReports+"\\AccountReport.pdf";
    }


    public String generateAllAccountWithTransactions() throws FileNotFoundException, JRException {
        List<Account> accountList=accountRepository.getAllAccounts();
        List<AccountHistoryWithTransactions> accountHistoryWithTransactionsList=new ArrayList<>();
        for (Account account: accountList){
            String customerName=account.getCustomer().getCustomerName();
            String customerPhoneNumber=account.getCustomer().getCustomerPhoneNumber();
            Integer age=account.getCustomer().getAge();
            String email=account.getCustomer().getEmail();
            String accountName=account.getAccountName();
            Integer accountNumber=account.getAccountNumber();
            Double balance=account.getBalance();
            Double interestAmount=account.getInterestAmount();
            Double transactionAmount=account.getTransactionAmount();
            Double amount=account.getAmount();
            AccountHistoryWithTransactions accountHistoryWithTransactions1=new AccountHistoryWithTransactions();
            accountHistoryWithTransactionsList.add(accountHistoryWithTransactions1);


        }

        File file = new File("C:\\Users\\user011\\IdeaProjects\\demo\\demo\\src\\main\\resources\\AccountStatement.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(accountHistoryWithTransactionsList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "ZuwinaALghafri");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource);
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports+"\\AccountWithTransactionReport.pdf");
        return "Report generated : " + pathToReports+"\\AccountWithTransactionReport.pdf";
    }
}
