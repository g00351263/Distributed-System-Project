PASSWORD SERVICE:  

<NoTE> proto files are in src/main/resources

git: https://github.com/g00351263/Distributed-System-Project/tree/master/grpcProject

DETAILS to Run Password Checks:

Run Server File First java -jar service.jar
	hash and salt method are showing the values of hard coded password

Run Client File after server java -jar client.jar
	password and userId is sent to server(visible on screen)
	hashed password is recieved
	passwordMatch boolean is recieved

