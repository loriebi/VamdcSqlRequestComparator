VamdcSqlRequestComparator

VAMDC aims to be an interoperable e-infrastructure that provides the international research community with access to a broad range of atomic and molecular (A&M) data compiled within a set of A&M databases accessible through the provision of this portal and of user software. Furthermore VAMDC aims to provide A&M data providers and compilers with a large dissemination platform for their work.

VAMDC infrastructure was established to provide a service to a wide international research community and has been developed in conjunction with consultations and advice from the A&M user community.

VamdcSqlRequestComparator defines Vamdc grammar. It compares two VamdcSqlRequests.

===========

File List
=======

**antlr-gen/**   - generated source code from Grammar

**bin/**         - compiled files for IDE

**build.xml**    - ant build

**.classpath**

**grammar/**    - Grammar definition, lexer, parser and tokens

**lib/**        - containes all needed libraries (junit + antlr) 

**.project**

**README.md**

**.settings**
    
**src/**    - Source code


How to Build/Clean project
==========

You can build project with apache **ant** command from terminal. Also you can use **Eclipse**/**Intellij Idea** or other IDE.

List of Main Targets
========

**ant build** - Creates build/ folder. First runs Antlr and generates Lexer,Parser and tokens from grammar. After compiles generated and source code.

**ant build-all** - Creates build/ folder. Compiles generated and source code. Also creates a JAR file (build/jar/VamdcSqlRequestComparator.jar).

**ant clean-all** - Deletes build/ folder.

**ant jar** - Creates jar file -> build/jar/VamdcSqlRequestComparator.jar

**ant doc** - Generates javadoc -> build/doc/

**ant junit** - Runs JUnit Tests.

**ant run -Dreq1="req1" -Dreq2="req2"** - Compares req1 and req2. Shows true/false or grammar error.
