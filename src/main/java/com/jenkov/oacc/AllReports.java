package com.jenkov.oacc;

import com.jenkov.oacc.reports.MainReport;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by jjenkov on 30-04-2015.
 */
public class AllReports {

    public static void main(String[] args) throws IOException {

        if(args.length < 1){
            System.out.println("No accounting repo given as argument. Report stopped.");
            return;
        }

        System.out.println("Generating all Open Accounting reports for repo: " + args[0]);



        Path repoPath = Paths.get(args[0]);

        MainReport mainReport = new MainReport();
        mainReport.create(repoPath);




    }
}
