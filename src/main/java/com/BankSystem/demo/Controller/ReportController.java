package com.BankSystem.demo.Controller;

import com.BankSystem.demo.Service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;

@RequestMapping(value="report")
@RestController
public class ReportController {

@Autowired
    ReportService reportService;

    @RequestMapping(value="generateAccountReport")
    public String generateAccountReport() throws JRException, FileNotFoundException {
        return reportService.generateAccountStatementReport();
    }
}
