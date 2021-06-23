package com.example.demo.student.service;

import com.example.demo.student.Student;
import com.example.demo.student.studentRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private studentRepository studentRepo;

    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        List<Student> students = studentRepo.findAll();

        //load file and compile it
        File file = ResourceUtils.getFile("D:\\MyDesktop\\Algebre\\HibernateDemo\\src\\main\\resources\\student.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
        //get datasource and map it to the jasperRepo
        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(students);
        //add the parameters
        Map<String, Object> parameters = new HashedMap(); parameters.put("Created By", "Ali");
        //Print it
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, datasource);
        if (reportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "D:\\MyDesktop\\Algebre\\HibernateDemo\\students.html");
        }
        if (reportFormat.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jasperPrint, "D:\\MyDesktop\\Algebre\\HibernateDemo\\students.pdf");
        }
        return "Report Generated!";
    }
}
