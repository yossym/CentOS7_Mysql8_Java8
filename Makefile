#all:
#	load


#load:
DeleteStatment.class: DeleteStatment.java
	javac -cp .:mysql-connector-java.jar DeleteStatment.java	
	java -cp .:mysql-connector-java.jar DeleteStatment

UpdateStatment.class: UpdateStatment.java
	javac -cp .:mysql-connector-java.jar UpdateStatment.java	
	java -cp .:mysql-connector-java.jar UpdateStatment

InsertStatment.class: InsertStatment.java
	javac -cp .:mysql-connector-java.jar InsertStatment.java	
	java -cp .:mysql-connector-java.jar InsertStatment




SelectStatment.class: SelectStatment.java
	javac -cp .:mysql-connector-java.jar SelectStatment.java	
	java -cp .:mysql-connector-java.jar SelectStatment

MySQLConnector.class: MySQLConnector.java
	javac -cp .:mysql-connector-java.jar MySQLConnector.java	
	java -cp .:mysql-connector-java.jar MySQLConnector

DriverLoad.class: DriverLoad.java
	javac -cp .:mysql-connector-java.jar DriverLoad.java	
	java -cp .:mysql-connector-java.jar DriverLoad
	

