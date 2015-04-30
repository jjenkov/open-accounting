package com.jenkov.oacc.reports;

import java.io.IOException;
import java.io.Writer;

/**
 * Created by jjenkov on 30-04-2015.
 */
public class HtmlReport {

    private Writer writer = null;

    public HtmlReport(Writer writer){
        this.writer = writer;
    }

    public void reportStart() throws IOException {
        this.writer.write("<!DOCTYPE html>\r\n");
        this.writer.write("<html>\r\n");
        this.writer.write("<body>\r\n");
    }

    public void element(String element, String body) throws IOException {
        this.writer.write("<");  this.writer.write(element); this.writer.write(">");
        this.writer.write(body);
        this.writer.write("</"); this.writer.write(element); this.writer.write(">");
    }

    public void h1(String text) throws IOException {
        element("h1", text);
    }

    public void reportEnd() throws IOException {
        this.writer.write("</body>\r\n");
        this.writer.write("</html>\r\n");
    }
}
