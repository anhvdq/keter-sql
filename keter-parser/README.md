# Keter Parser
This module is for parsing SQL statement into Java code

- Coding style is inspired by trino-parser. See more: [trino-parser](https://github.com/trinodb/trino/tree/master/core/trino-parser)
- SQL syntax is currently support SELECT statement only, inspired by Spark & Trino SQL syntax. See more: [Spark](https://github.com/apache/spark/blob/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBase.g4), [Trino](https://github.com/trinodb/trino/blob/master/core/trino-parser/src/main/antlr4/io/trino/sql/parser/SqlBase.g4) 

## Installation

Use Maven to build code.

```bash
mvn clean package
```