# Wushu Nantes-Cholet-Angers - Backend & Services project
This project aims at providing the backend services to be used to support a sports club practicing Wushu

## Default testing data
Testing data is declared in `import.sql`.
To load data on first start or to reset data with defaults, change `spring.jpa.hibernate.ddl-auto` property value (in `application.properties`) with either `create` or `create-drop`.

## Setting up the storage
Configuration of the persistent storage :
* h2 database now persistent after full restart of the server/computer
* `import.sql` contains testing data. To load data on first start or to reset data with defaults, change `spring.jpa.hibernate.ddl-auto` property value (in `application.properties`) with either `create-drop` or `create`.