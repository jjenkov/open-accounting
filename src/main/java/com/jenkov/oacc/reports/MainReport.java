package com.jenkov.oacc.reports;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by jjenkov on 30-04-2015.
 */
public class MainReport {

    public void create(Path accountingRepoDir) throws IOException {

        Path reportDir = Paths.get(accountingRepoDir.toAbsolutePath() + File.separator + "reports");
        Files.createDirectories(reportDir);


        FileWriter writer = new FileWriter(reportDir + File.separator + "index.html") ;

        HtmlReport htmlReport = new HtmlReport(writer);

        htmlReport.reportStart();
        htmlReport.h1("Accounting Report");
        htmlReport.reportEnd();

        writer.close();


    }
}
