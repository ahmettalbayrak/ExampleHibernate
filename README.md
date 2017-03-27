# ExampleHibernate

//hibernate.cfg
DB driver class : com.mysql.jdbc.Driver
DB connection url : jdbc:mysql://localhost:3307/mysql
DB connection username : [kullanici_adiniz]
DB connection password : [parolanız]

//Employee Table
  Id(int auto_increment, primary key),
  Name(Text),
  Surname(Text),
  Salary(int),
  DepartmentId(foreign_key)
  
//Department Table
  Id(int auto_increment, primary key),
  Name(Text),
  Description(Text)
  
//Meetings Table
  Id(int auto_increment, primary key),
  Name(Text),
  Description(Text),
  DepartmentId(Foreign_key)
  
