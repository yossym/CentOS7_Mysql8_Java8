readme.txt
==========

2020-03-29

CentOS 7 に
MySQL 8と
java 8をインストールして
javaからJDBCを使ってデータベースを
利用する。


標準のmysql-connector-java.jarは1.5なので
JDBCはこのjarファイルを使う

mysql-connector-java-8.0.19-1.el7.noarch.rpm CentOS 7 Download
https://centos.pkgs.org/7/mysql-connectors-aarch64/mysql-connector-java-8.0.19-1.el7.noarch.rpm.html



javac -cp /usr/share/java/mysql-connector-java.jar: MySQLConnector.java
java -cp /usr/share/java/mysql-connector-java.jar: MySQLConnector

