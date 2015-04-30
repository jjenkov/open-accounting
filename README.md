# open-accounting

Open accounting is a set of Java tools and JSON formats that can create accounting reports for small companies.

I created these tools and file formats because I am tired of the closed databases used by the popular accounting
software. Closed databases makes it hard to migrate to other tools. These tools will use a "repository" with files
as database, to make it easier to "migrate" to a new tool or generate another report with another tool etc.



Open accounting plans to have features for:


1) Linking bank account movements to receipts - both in data file and the real file.

2) Generating invoices

3) Generating account listings.


etc.


This is not intended to be a replacement for an ERP. Rather, it is intended to be an open collection of tools
working on an open set of JSON file formats (organized into a repository). So far the tools are command line tools and the output is HTML reports.
In the future we might be able to create a GUI for the repository - just like GUIs for Git repository.  Or use the JSON
file formats as import / export formats between tools that are using closed databases today.

Let's make accounting easier and cheaper for small businesses.

