# Keter SQL
Keter SQL is a Java library for manipulating SQL statement and use it in coding language.

## Features
- Java API for reading and analyzing SQL statement using our own business logic
- Converting SQL syntax among query engines (Spark, Trino, Elasticsearch, MSSQL, MySQL,....)
- Java API for generating SQL statement

## Installation

Use Maven to build code.

```bash
mvn clean package
```
## Modules
### keter-parser
- Responsible for parsing sql string into AST
### keter-spi
- Define interface for basic elements of SQL logical plan
### keter-main
- Implement business logic
### keter-cli
- Command line tool, example of using SQL plan in client 
## Notes
- This project is developed for learning purpose only
- This project is inspired by Trino's Java coding style and Spark's SQL syntax